package articles_02;

public class Article {
    private String title;
    private String content;
    private String author;

    public Article(String title, String content, String author) {

        this.title = title;
        this.content = content;
        this.author = author;

    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        // "{title} - {content}: {author}"
        return String.format("%s - %s: %s", this.title, this.content, this.author);

    }

}
