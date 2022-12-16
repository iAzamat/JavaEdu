package Homeworks.Java06;

public class Book {
    private String nameBook;
    private String authorBook;

    public Book(String nameOfBook, String authorOfBook) {
        this.nameBook = nameOfBook;
        this.authorBook = authorOfBook;
    }

    public String getNameBook() {
        return nameBook;
    }

    public void setNameOfBook(String nameOfBook) {
        this.nameBook = nameOfBook;
    }

    public String getAuthorBook() {
        return authorBook;
    }

    public void setAuthorOfBook(String authorOfBook) {
        this.authorBook = authorOfBook;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;

        Book book = (Book) o;

        if (getNameBook() != null ? !getNameBook().equals(book.getNameBook()) : book.getNameBook() != null)
            return false;
        return getAuthorBook() != null ? getAuthorBook().equals(book.getAuthorBook()) : book.getAuthorBook() == null;
    }

    @Override
    public int hashCode() {
        int result = getNameBook() != null ? getNameBook().hashCode() : 0;
        result = 31 * result + (getAuthorBook() != null ? getAuthorBook().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Book{" +
                "nameOfBook='" + nameBook + '\'' +
                ", authorOfBook='" + authorBook + '\'' +
                '}';
    }
}
