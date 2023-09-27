package article.model;

import util.Util;

import java.util.ArrayList;

public class CommentRepository {
    private int LastCommentNum = 0;
    private ArrayList<Comment> comments = new ArrayList<>();

    public void insert(int articleId, String comment) {
        LastCommentNum++;
        Comment comment1 = new Comment(LastCommentNum, comment, Util.getDateTime(), articleId);
        comments.add(comment1);
    }
    public ArrayList<Comment> getComments (int num) {
        ArrayList<Comment> commentArrayList = new ArrayList<>();
        for (Comment comment : comments) {
            if (comment.getArticleId() == num) {
                commentArrayList.add(comment);
            }
        }
        return commentArrayList;
    }
}
