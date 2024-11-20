import java.util.Objects;

public class Book {
    private String bookName;
    private Author nameAuthor;
    private int yearPublication;

    public Book(String bookName, Author nameAuthor, int yearPublication) {
        this.bookName = bookName;
        this.nameAuthor = nameAuthor;
        this.yearPublication = yearPublication;
    }

    public String getTitle() {
        return this.bookName;
    }

    public Author getNameAuthor() {
        return this.nameAuthor;
    }

    public int getYearPublication() {
        return this.yearPublication;
    }

    public void setYearPublication(int yearPublication) {
        this.yearPublication = yearPublication;
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookName, nameAuthor, yearPublication);
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) return true;
        if (other == null || getClass() != other.getClass()) return false;
        Book otherBook = (Book) other;
        return otherBook.equals(otherBook.bookName) && nameAuthor.equals(otherBook.nameAuthor) && yearPublication == otherBook.yearPublication;
    }

    @Override
    public String toString() {
        return "Книга - " + this.bookName + ", " + " автор - " + this.nameAuthor + " опубликован - " + this.yearPublication + " году.";
    }

}


