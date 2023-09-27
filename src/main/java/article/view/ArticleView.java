package article.view;

import article.model.Article;
import article.model.Comment;

import java.util.ArrayList;

public class ArticleView {
    public void printList(ArrayList<Article> articles) {
        for (Article article : articles) {
            System.out.printf("게시물 번호 : %d\n", article.getId());
            System.out.printf("제목 : %s\n", article.getTitle());
            System.out.printf("등록일 : %s\n", article.getRegDate());
            System.out.println("==============================");
        }
    }
    public void printDetail(Article article, ArrayList<Comment> comments) {
        System.out.printf("게시물 번호 : %d\n", article.getId());
        System.out.printf("제목 : %s\n", article.getTitle());
        System.out.printf("내용 : %s\n", article.getContent());
        System.out.printf("조회수 : %d\n", article.getHit());
        System.out.printf("작성일 : %s\n", article.getRegDate());
        System.out.println("==============================");
        printComment(comments);
    }

    public void printComment(ArrayList<Comment> comments) {
        System.out.println("=============== 댓글 ===============");
        for (Comment comment : comments) {
            System.out.printf("댓글 내용 : %s\n", comment.getComment());
            System.out.printf("댓글 작성일 : %s\n", comment.getRegDate());
            System.out.println("==============================");
        }
    }
}
