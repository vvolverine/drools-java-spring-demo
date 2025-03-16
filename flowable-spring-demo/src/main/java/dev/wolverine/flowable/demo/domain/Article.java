package dev.wolverine.flowable.demo.domain;

public class Article {

    private String id;
    private String author;
    private String url;

    public Article() {
    }

    public Article(String author, String url) {
        this.author = author;
        this.url = url;
    }

    public Article(String id, String author, String url) {
        this.id = id;
        this.author = author;
        this.url = url;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAuthor() {
        return this.author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getUrl() {
        return this.url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

}
