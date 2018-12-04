package LibraryNew;

public class Book {
    int id;
    String bookName;
    String bookAuthor;
    int estYear;

    public Book(int id, String bookName, String bookAuthor, int estYear) {
        this.id = id;
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
        this.estYear = estYear;
    }


    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookName() {
        return bookName;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public int getEstYear() {
        return estYear;
    }

    @Override
    public String toString() {
        return "{" +
                "id=" + id +
                ", bookName='" + bookName + '\'' +
                ", bookAuthor='" + bookAuthor + '\'' +
                ", estYear=" + estYear +
                '}';
    }


}
