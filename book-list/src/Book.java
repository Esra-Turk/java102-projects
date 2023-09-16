import java.util.Date;

public class Book {
    private String bookName;
    private String authorName;
    private int pageNumber;

    private int publishDate;

    public Book(String bookName, String authorName, int pageNumber, int publishDate) {
        this.bookName = bookName;
        this.authorName = authorName;
        this.pageNumber = pageNumber;
        this.publishDate = publishDate;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    public int getPublishDate() {
        return publishDate;
    }

    public void setPublishDate (int publishDate) {
        this.publishDate = publishDate;
    }
}
