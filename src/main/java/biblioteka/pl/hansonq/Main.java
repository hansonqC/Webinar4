package biblioteka.pl.hansonq;



import biblioteka.pl.hansonq.models.BookModel;
import biblioteka.pl.hansonq.models.dao.BookDao;
import biblioteka.pl.hansonq.models.dao.daoImpl.BookDaoImpl;

import java.util.*;

/**
 * Created by lukasz on 2017-07-29.
 */
public class Main {


    public static List<BookModel> booksList;
    public static void main(String[] args) {
booksList = new ArrayList<>();
  BookDao bookDao = new BookDaoImpl();
       Main main = new Main();
      main.init(bookDao);
       main.showMenu();
    /*  Book.booksList=new ArrayList<>();
      Book.borrowedBooksList=new ArrayList<>();
      Book book= new Book();
      book.init();
      book.showLibrary();
      book.showMenu();
*/


    }
    public void init(BookDao bookDao) {


        booksList.add(new BookModel(0, "Boze igrzysko", "Norman Davis", "2017-02-02", "Historia powszechna", false));
        booksList.add(new BookModel(0, "Wiedzmin. Czas pogardy", "Andrzej Sapkowski","2017-02-02", "Fantastyka", false));
        booksList.add(new BookModel(0, "Sekrety Samurajow", "Oskar Ratti", "2017-02-02", "Historia powszechna", false));
        booksList.add(new BookModel(0, "Sztuka wojny", "Sun Tzu", "2017-02-02", "Historia powszechna", false));
        booksList.add(new BookModel(0, "Dzieje Grekow i Rzymian", "Zygmunt Kubiak", "2017-02-02", "Historia powszechna", false));
        booksList.add(new BookModel(0, "Achaja", "Andrzej Ziemianski", "2017-02-02", "Fantastyka", false));
        booksList.add(new BookModel(0, "Zapach szkla", "Andrzej Ziemianski", "2017-02-02", "Fantastyka", false));
        booksList.add(new BookModel(0, "Blade runner", "Philip K Dick", "2017-02-02", "Fantastyka", false));
        booksList.add(new BookModel(0, "Algorytmy", "Jozin z Bazin", "2017-02-02", "Historia powszechna", false));
        booksList.add(new BookModel(0, "Bushido", "Ivazo Nitobe", "2017-02-02", "Historia powszechna", false));
        booksList.add(new BookModel(0, "Ksiega bessy", "John Rotchchild","2011-02-02", "Biznes", false));
        booksList.add(new BookModel(0, "Analiza techniczna rynkow finansowych", "John J Murphu", "2017-02-02", "Biznes", false));
        booksList.add(new BookModel(0, "Getting things done", "David Allen", "2010-05-02", "Poradnik", false));
        booksList.add(new BookModel(0, "Skazany na trening", "Paul Wade", "2000-06-02", "Poradnik", false));
        booksList.add(new BookModel(0, "Przebudzenie", "Anthony De Mello", "2017-02-02", "Filozofia", false));

        
        for(BookModel book : booksList){
            bookDao.addBook(book);
        }

      //  saveToFile(Paths.get("book.txt"));
    }
    public void showMenu() {
        System.out.println("\nWitaj w bibliotece, dostepne opcje : \n1 - Pokaz spis ksiazek\n2 - Dopisz ksiazke\n3 - Usun ksiazke\n4 - Wypozycz ksiazke\n5 - Pokaz spis wypozyczonych ksiazek\n6 - Poukladaj ksiazki\n7 - Zwroc ksiazke\n8 - Wyjdz z programu");
        Scanner scanner = new Scanner(System.in);
        try {
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                 //   showLibrary();
                    showMenu();
                    break;
                case 2:
                  //  addBook();
                    break;
                case 3:
                   // removeBook();
                    break;
                case 4:
                  //  borrowBook();
                    break;
                case 5:
                   // showBorrowedBooks(false);
                    break;
                case 6:
                   // sort();
                    break;
                case 7:
                  //  returnBook();
                    break;
                case 8:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Brak pozycji w menu");
                    showMenu();
                    break;


            }
        } catch (Exception ex) {
            System.out.println("Sprawdz poprawnosc wprowadzonych danych");
            showMenu();
        }

    }
}
