package article.controller;

import article.model.Article;
import article.model.Member;
import util.Util;

import java.util.Scanner;

public class Board {
    Scanner sc = new Scanner(System.in);
    ArticleController articleController = new ArticleController();
    MemberController memberController = new MemberController();
    public void start() {
        while (true) {
            Member loginedMember = memberController.getLoginedMember();
            if (loginedMember == null) {
                System.out.print("명령어 : ");
            } else {
                System.out.printf("명령어[%s(%s)] : ", loginedMember.getId(), loginedMember.getNname());
            }
            String cmd = sc.nextLine();
            if (cmd.equals("exit")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else if (cmd.equals("add")) {
                articleController.add();
            } else if (cmd.equals("list")) {
                articleController.list();
            } else if (cmd.equals("update")) {
                articleController.update();
            } else if (cmd.equals("delete")) {
                articleController.delete();
            } else if (cmd.equals("detail")) {
                articleController.detail();
            } else if (cmd.equals("search")) {
                articleController.search();
            } else if (cmd.equals("signup")) {
                memberController.signup();
            } else if (cmd.equals("login")) {
                memberController.login();
            } else if (cmd.equals("memberlist")) {
                memberController.memberlist();
            }
        }
    }
}
