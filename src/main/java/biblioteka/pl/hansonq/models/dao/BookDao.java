package biblioteka.pl.hansonq.models.dao;

import biblioteka.pl.hansonq.Book;
import biblioteka.pl.hansonq.models.BookModel;

import java.util.List;

/**
 * Created by lukasz on 2017-09-08.
 */
public interface BookDao {
    List<Book> getAllBooks();
    void addBook(BookModel bookModel);
    void deleteBook(int position);
    void borrowBook(int position);
    void returnBook(int position);
    List<Book>getBorrowedBooks();
    void sortByAuthor();
    void sortByTitle();
    void sortByCategory();



}
