
public class Book implements Comparable<Book>{
    private int pageNum;
    private String name;
    private String authorName;
    private int date;

    @Override
    public int compareTo(Book book) {
        return this.getName().compareTo(book.getName());
    }

    public Book(int pageNum, String name, String authorName, int date) {
        this.pageNum = pageNum;
        this.name = name;
        this.authorName = authorName;
        this.date = date;
    }

    public int getPageNum() {
        return pageNum;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

}
