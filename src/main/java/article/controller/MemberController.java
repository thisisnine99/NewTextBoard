package article.controller;

import article.model.Member;
import article.model.MemberRepository;

import java.util.Scanner;

public class MemberController {
    Scanner sc = new Scanner(System.in);
    MemberRepository memberRepository = new MemberRepository();
    private Member loginedMember = null;

    public void signup() {
        System.out.println("===== 회원가입을 진행합니다 =====");
        System.out.print("아이디를 입력해주세요 : ");
        String Id = sc.nextLine();
        System.out.print("비밀번호를 입력해주세요 : ");
        String Pw = sc.nextLine();
        System.out.print("닉네임을 입력해주세요 : ");
        String Nname = sc.nextLine();
        memberRepository.insert(Id, Pw, Nname);
        System.out.println("===== 회원가입이 완료되었습니다 =====");
    }

    public void memberlist() {
        memberRepository.memberList();
    }

    public void login() {
        System.out.print("아이디 : ");
        String loginId = sc.nextLine();
        System.out.print("비밀번호 : ");
        String loginPw = sc.nextLine();

        String failMsg = "잘못된 회원 정보입니다.";
        Member member = memberRepository.compareByloginId(loginId);

        if (member == null) {
            System.out.println(failMsg);
            return;
        }
        if (!member.getPw().equals(loginPw)) {
            System.out.println(failMsg);
            return;
        }
        System.out.printf("%s님 환영합니다.\n", member.getNname());
        loginedMember = member;
    }

    public Member getLoginedMember() {
        return loginedMember;
    }
}