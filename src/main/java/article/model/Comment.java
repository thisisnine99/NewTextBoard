package article.model;

public class Comment {
    private int commentId;
    private String comment;
    private String regDate;
    private int articleId;
    public Comment(int commentId, String comment, String regDate, int articleId) {
        this.commentId = commentId;
        this.comment = comment;
        this.regDate = regDate;
        this.articleId = articleId;
    }

    public int getCommentId() {
        return commentId;
    }

    public void setCommentId(int commentId) {
        this.commentId = commentId;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getRegDate() {
        return regDate;
    }

    public void setRegDate(String regDate) {
        this.regDate = regDate;
    }

    public int getArticleId() {
        return articleId;
    }

    public void setArticleId(int articleId) {
        this.articleId = articleId;
    }
}
