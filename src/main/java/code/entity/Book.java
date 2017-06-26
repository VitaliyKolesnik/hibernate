package code.entity;



public class Book {
    private int id;
    private String title;
    private int authorId;


    public Book(String title, int authorId) {
        this.title = title;
        this.authorId = authorId;
    }

    public Book(int id, String title, int authorId) {

        this.id = id;
        this.title = title;
        this.authorId = authorId;
    }

    public int getAuthorId() {
        return authorId;
    }

    public void setAuthorId(int authorId) {
        this.authorId = authorId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Book{");
        sb.append("id=").append(id);
        sb.append(", title='").append(title).append('\'');
        sb.append(", authorId=").append(authorId);
        sb.append('}');
        return sb.toString();
    }
}
