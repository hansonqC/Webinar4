package biblioteka.pl.hansonq.models.dao.daoImpl;

import biblioteka.pl.hansonq.Book;
import biblioteka.pl.hansonq.Connector;
import biblioteka.pl.hansonq.models.BookModel;
import biblioteka.pl.hansonq.models.dao.BookDao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by lukasz on 2017-09-08.
 */
public class BookDaoImpl implements BookDao{

    Connector connector=Connector.getInstance();


    @Override
    public List<Book> getAllBooks() {
        return null;
    }

    @Override
    public void addBook(BookModel bookModel) {
        PreparedStatement prepareStatement = null;
        try {
            prepareStatement = connector.getConnection().prepareStatement("INSERT INTO bibliography (id,title,author,release_date,category,isBorrowed) VALUES(?,?,?,?,?,?)");
            prepareStatement.setInt(1,0);
            prepareStatement.setString(2,bookModel.getTitle());
            prepareStatement.setString(3,bookModel.getAuthor());
            prepareStatement.setString(4,bookModel.getReleaseDate());
            prepareStatement.setString(5,bookModel.getCategory());
            prepareStatement.setBoolean(6,bookModel.isBorrowed());
            prepareStatement.execute();
            prepareStatement.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }


    }

    @Override
    public void deleteBook(int position) {

    }

    @Override
    public void borrowBook(int position) {

    }

    @Override
    public void returnBook(int position) {

    }





    @Override
    public List<Book> getBorrowedBooks() {
        return null;
    }

    @Override
    public void sortByAuthor() {

    }

    @Override
    public void sortByTitle() {

    }

    @Override
    public void sortByCategory() {

    }


}
