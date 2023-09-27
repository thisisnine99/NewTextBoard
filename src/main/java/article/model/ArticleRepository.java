package article.model;

import util.Util;

import java.util.ArrayList;

public class ArticleRepository {
    private int LastArticleNum = 0;
    private ArrayList<Article> articles = new ArrayList<>();

    public ArticleRepository() {
        LastArticleNum++;
        Article article1 = new Article(LastArticleNum, "안녕하세요 반갑습니다. 자바 공부중이에요.", "안녕하세요.", Util.getDateTime());
        LastArticleNum++;
        Article article2 = new Article(LastArticleNum, "자바 질문좀 할게요~", "할게요~", Util.getDateTime());
        LastArticleNum++;
        Article article3 = new Article(LastArticleNum, "정처기 따야되나요?", "되나요?", Util.getDateTime());
        articles.add(article1);
        articles.add(article2);
        articles.add(article3);
    }

    public ArrayList<Article> getArticles() {
        return articles;
    }

    public void insert(String title, String content) {
        LastArticleNum++;
        Article article = new Article(LastArticleNum, title, content, Util.getDateTime());
        articles.add(article);
    }

    public void remove(Article article) {
        articles.remove(article);
    }

    public Article findByNum(int num) {
        for (Article article : articles) {
            if (article.getId() == num) {
                return article;
            }
        }
        return null;
    }

    public ArrayList<Article> findByKeyWord(String keyWord) {
        ArrayList<Article> articles1 = new ArrayList<>();
        for (Article article : articles) {
            if (article.getTitle().contains(keyWord)) {
                articles1.add(article);
            }
        }
        return articles1;
    }
}
