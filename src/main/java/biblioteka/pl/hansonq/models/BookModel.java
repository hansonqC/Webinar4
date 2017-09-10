package biblioteka.pl.hansonq.models;

import biblioteka.pl.hansonq.Book;
import biblioteka.pl.hansonq.models.dao.daoImpl.BookDaoImpl;

import java.sql.Date;
import java.util.List;
import java.util.Scanner;

/**
 * Created by lukasz on 2017-09-08.
 */
public class BookModel implements Comparable<Book> {
    public static List<BookDaoImpl> booksList;

    private int bookId;
    private String title;
    private String author;
    private String releaseDate;
    private String category;
    private boolean isBorrowed;

    public BookModel(int bookId, String title, String author, String releaseDate, String category, boolean isBorrowed) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.releaseDate = releaseDate;
        this.category = category;
        this.isBorrowed = isBorrowed;
    }

    public int getBookId() {
        return bookId;
    }

    public BookModel setBookId(int bookId) {
        this.bookId = bookId;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public BookModel setTitle(String title) {
        this.title = title;
        return this;
    }

    public String getAuthor() {
        return author;
    }

    public BookModel setAuthor(String author) {
        this.author = author;
        return this;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public BookModel setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
        return this;
    }

    public String getCategory() {
        return category;
    }

    public BookModel setCategory(String category) {
        this.category = category;
        return this;
    }

    public boolean isBorrowed() {
        return isBorrowed;
    }

    public BookModel setBorrowed(boolean borrowed) {
        isBorrowed = borrowed;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BookModel bookModel = (BookModel) o;

        if (bookId != bookModel.bookId) return false;
        if (releaseDate != bookModel.releaseDate) return false;
        if (isBorrowed != bookModel.isBorrowed) return false;
        if (!title.equals(bookModel.title)) return false;
        if (!author.equals(bookModel.author)) return false;
        return category.equals(bookModel.category);
    }

    @Override
    public int hashCode() {
        int result = bookId;
        result = 31 * result + title.hashCode();
        result = 31 * result + author.hashCode();

        result = 31 * result + category.hashCode();
        result = 31 * result + (isBorrowed ? 1 : 0);
        return result;
    }

    @Override
    public int compareTo(Book o) {
        if (bookId == o.getBookId()) {
            return 0;
        } else if (bookId > o.getBookId()) {
            return 1;
        }
        return -1;
    }

    public int compareToTitle(Book o) {
        if (title.compareTo(o.getTitle())==0){
            return 0;
        } else if ((title.compareTo(o.getTitle())>0)) {
            return 1;
        }
        return -1;
    }
    public int compareToAuthor(Book o) {
        if (author.compareTo(o.getAuthor())==0){
            return 0;
        } else if ((author.compareTo(o.getAuthor()))>0) {
            return 1;
        }
        return -1;
    }
    public int compareToCategory(Book o) {
        if (category.compareTo(o.getCategory())==0){
            return 0;
        } else if ((category.compareTo(o.getCategory())>0)) {
            return 1;
        }
        return -1;
    }
}
