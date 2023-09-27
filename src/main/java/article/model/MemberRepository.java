package article.model;

import util.Util;

import java.util.ArrayList;

public class MemberRepository {
    private int LastMemberId = 0;
    private ArrayList<Member> members = new ArrayList<>();

    public void insert(String Id, String Pw, String Nname) {
        LastMemberId++;
        Member member = new Member(Id, Pw, Nname, Util.getDateTime(), LastMemberId);
        members.add(member);
    }

    public Member compareByloginId(String loginId) {
        for (Member member : members) {
            if (member.getId().equals(loginId)) {
                return member;
            }
        }
        return null;
    }

    public void memberList() {
        for (Member member : members) {
            System.out.println(member.getId());
            System.out.println(member.getPw());
            System.out.println(member.getNname());
            System.out.println(member.getRegDate());
            System.out.println(member.getMemberId());
        }
    }
}
