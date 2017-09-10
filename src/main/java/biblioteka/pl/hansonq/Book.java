package biblioteka.pl.hansonq;

import javax.swing.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.*;

public class Book implements Comparable<Book> {
    public static List<Book> booksList;
    public static List<Book> borrowedBooksList;
    private Scanner scanner;
    private int bookId;
    private String title;
    private String author;
    private int releaseDate;
    private String category;
    private boolean isBorrowed;
    private String authorSuraname;


    public Book() {

openFile(Paths.get("book.txt"));
    }

    public Book(int bookId, String title, String author, int releaseDate, String category, boolean isBorrowed) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.releaseDate = releaseDate;
        this.category = category;
        this.isBorrowed = isBorrowed;

    }

    public Book(String title, String author) {

        this.title = title;
        this.author = author;
    }


    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(int releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public boolean isBorrowed() {
        return isBorrowed;
    }

    public void setBorrowed(boolean borrowed) {
        isBorrowed = borrowed;
    }


    //****************** Equals , hashcode and comparators  *************************


    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Book book = (Book) o;


        if (releaseDate != book.releaseDate) return false;
        if (isBorrowed != book.isBorrowed) return false;
        if (!title.equals(book.title)) return false;
        if (!author.equals(book.author)) return false;
         return category.equals(book.category);
    }

    @Override
    public int hashCode() {
        int result = bookId;
        result = 31 * result + title.hashCode();
        result = 31 * result + author.hashCode();
        result = 31 * result + releaseDate;
        result = 31 * result + category.hashCode();
        result = 31 * result + (isBorrowed ? 1 : 0);
        return result;
    }

    public int compareToRelaseDate(Book o) {
        if (releaseDate== o.getReleaseDate()) {
            return 0;
        } else if (releaseDate > o.getReleaseDate()) {
            return 1;
        }
        return -1;
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
    ////////////////////////// Equals , hashcode and comparators  ////////////////////////////////////



    // Creating a starter bibliography

    private void openFile(Path path){

      List<String>books=new ArrayList<>();
        try {
          books= Files.readAllLines(Paths.get("book.txt"));
        } catch (IOException e) {
            e.printStackTrace();
        }
       // JOptionPane.showMessageDialog(null,books.toString());
    }
    private void saveToFile(Path path){
        List<String>list=new ArrayList<>();
        for(Book book :booksList){
            list.add(book.toString());
        }
        try {

            Files.write(path,list, StandardOpenOption.CREATE);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void init() {


        booksList.add(new Book(1, "Boze igrzysko", "Norman Davis", 2005, "Historia powszechna", false));
        booksList.add(new Book(2, "Wiedzmin. Czas pogardy", "Andrzej Sapkowski", 2014, "Fantastyka", false));
        booksList.add(new Book(3, "Sekrety Samurajow", "Oskar Ratti", 1997, "Historia powszechna", false));
        booksList.add(new Book(4, "Sztuka wojny", "Sun Tzu", 2000, "Historia powszechna", false));
        booksList.add(new Book(5, "Dzieje Grekow i Rzymian", "Zygmunt Kubiak", 2005, "Historia powszechna", false));
        booksList.add(new Book(6, "Achaja", "Andrzej Ziemianski", 2008, "Fantastyka", false));
        booksList.add(new Book(7, "Zapach szkla", "Andrzej Ziemianski", 2005, "Fantastyka", false));
        booksList.add(new Book(8, "Blade runner", "Philip K Dick", 1996, "Fantastyka", false));
        booksList.add(new Book(9, "Algorytmy", "Jozin z Bazin", 2005, "Historia powszechna", false));
        booksList.add(new Book(10, "Bushido", "Ivazo Nitobe", 2013, "Historia powszechna", false));
        booksList.add(new Book(11, "Ksiega bessy", "John Rotchchild", 2009, "Biznes", false));
        booksList.add(new Book(12, "Analiza techniczna rynkow finansowych", "John J Murphu", 2005, "Biznes", false));
        booksList.add(new Book(13, "Getting things done", "David Allen", 2015, "Poradnik", false));
        booksList.add(new Book(14, "Skazany na trening", "Paul Wade", 2016, "Poradnik", false));
        booksList.add(new Book(15, "Przebudzenie", "Anthony De Mello", 2006, "Filozofia", false));

        saveToFile(Paths.get("book.txt"));
    }

    @Override
    public String toString() {
        return bookId + " - Tytul : " + title + ", autor : " + author + ", rok wydania : " + releaseDate + ", kategoria : " + category + ", wypozyczona : " + isBorrowed + "\n";
    }


    public void showLibrary() {
        refreshbooksList();
        System.out.println("\nSpis ksiazek : \n" + booksList.toString());

    }

    //refreshing ordinalnumber in booksList
    private void refreshbooksList() {
        for (int i = 0; i < booksList.size(); i++) {
            Book book = booksList.get(i);
            book.setBookId(i + 1);
        }
    }

    //refreshing ordinalnumber in borrowedBooksList
    private void refreshborrowedBooksList() {
        for (int i = 0; i < borrowedBooksList.size(); i++) {
            Book book = borrowedBooksList.get(i);
            book.setBookId(i + 1);
        }
    }

    private void addBook() {
        int id = booksList.size() + 1;
        scanner = new Scanner(System.in);
        System.out.println("Aby dodac ksiazke podaj nastepuj±ce dane :\nTytul : ");
        String title = scanner.nextLine();
        System.out.println("Autor : ");
        String author = scanner.nextLine();
        System.out.println("Rok wydania : ");
        String relase = scanner.nextLine();
        System.out.println("Kategoria (Poradnik, Biznes, Historia powszechna, Fantastyka, Opowiadania, Bajki etc. ) :");
        String category = scanner.nextLine();
        int relaseDate = Integer.parseInt(relase);
        boolean isBorrowed = false;

        booksList.add(new Book(id, title, author, relaseDate, category, isBorrowed));
        String newBook = title + "\nautor : " + author;
        System.out.println("Dodano ksiazke : \n" + newBook);
        showLibrary();
        showMenu();

    }

    private void removeBook() {
        Book bookToRemove;
        showLibrary();
        scanner = new Scanner(System.in);
        int position = 0;
        System.out.println("Podaj pozycje ktora chcesz usunac :");
        position = scanner.nextInt();
        bookToRemove = booksList.get(position - 1);
        if (bookToRemove.isBorrowed == true) {
            System.out.println("Nie mozna usunac wypozyczonej ksiazki");
            showMenu();
        } else {
            try {
                String removedBook = booksList.subList(position - 1, position).toString();
                booksList.remove(position - 1);
                System.out.println("Usunieto ksiazke : \n" + removedBook);
                refreshbooksList();
                showLibrary();
                showMenu();
            } catch (Exception ex) {
                System.out.println("Sprawdz poprawnosc wprowadzonych danych");
                removeBook();
            } finally {
                System.out.println("Sprawdz poprawnosc wprowadzonych danych");
                removeBook();


            }
        }
    }


    private void borrowBook() {
        showLibrary();
        scanner = new Scanner(System.in);
        System.out.println("Podaj pozycje ktora chcialbys wypozyczyc :");
        int position = scanner.nextInt();
        Book book = booksList.get(position - 1);
        if (book.isBorrowed == true) {
            System.out.println("Ksiazka zostala juz wypozyczona !");
            borrowBook();
        } else {
            book.setBorrowed(true);
            borrowedBooksList.add(book);
            refreshborrowedBooksList();
            String borrowedBook = book.getTitle() + ", autor : " + book.getAuthor();
            System.out.println("Wypozyczono ksiazke :\n" + borrowedBook);
            showMenu();

        }


    }

    private void returnBook() {
        if (borrowedBooksList.size() > 0) {
            scanner = new Scanner(System.in);
            showBorrowedBooks(true);
            System.out.println("Podaj pozycje ktora zwrocono");
            int position = scanner.nextInt();
            Book book = borrowedBooksList.get(position - 1);

            for (Book book2 : booksList) {

                if (book2.compareTo(book) == 0) {
                    book2.setBorrowed(false);
                 //   JOptionPane.showMessageDialog(null, book2.getTitle());

                }
            }
            borrowedBooksList.remove(position - 1);
            showLibrary();
            showMenu();
        } else {
            System.out.println("Nie wypozyczono zadnej ksiazki");
            showMenu();
        }
    }

    private void showBorrowedBooks(boolean remove) {
        refreshborrowedBooksList();
        if (borrowedBooksList.size() > 0) {

            System.out.println("Lista ksiazek wypozyczonych :\n" + borrowedBooksList.toString());
            if (!remove) showMenu();
        } else {

            System.out.println("Wszystkie ksiazki sa w bibliotece");
            showMenu();

        }
    }

    public void sort() {
        scanner = new Scanner(System.in);
        System.out.println("Jak chcesz posortowac spis ksiazek ?\n1 - wg tytulu\n2 - wg autora\n3 - wg daty wydania\n4 - wg kategorii");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                sortByTitle();
                break;
            case 2:
                sortByAuthor();
                break;
            case 3:
                sortByRelaseDate();
                break;
            case 4:
                sortByCategory();
                break;

        }
    }
    private void sortByRelaseDate(){
       Collections.sort(booksList,Book::compareToRelaseDate);
       refreshbooksList();
       showLibrary();
       showMenu();
    }
    private void sortByTitle(){
        Collections.sort(booksList,Book::compareToTitle);
        refreshbooksList();
        showLibrary();
        showMenu();

    }
    private void sortByAuthor(){
        Collections.sort(booksList,Book::compareToAuthor);
        refreshbooksList();
        showLibrary();
        showMenu();

    }
    private void sortByCategory(){
        Collections.sort(booksList,Book::compareToCategory);
        refreshbooksList();
        showLibrary();
        showMenu();

    }
    public void showMenu() {
        System.out.println("\nWitaj w bibliotece, dostepne opcje : \n1 - Pokaz spis ksiazek\n2 - Dopisz ksiazke\n3 - Usun ksiazke\n4 - Wypozycz ksiazke\n5 - Pokaz spis wypozyczonych ksiazek\n6 - Poukladaj ksiazki\n7 - Zwroc ksiazke\n8 - Wyjdz z programu");
        scanner = new Scanner(System.in);
        try {
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    showLibrary();
                    showMenu();
                    break;
                case 2:
                    addBook();
                    break;
                case 3:
                    removeBook();
                    break;
                case 4:
                    borrowBook();
                    break;
                case 5:
                    showBorrowedBooks(false);
                    break;
                case 6:
                    sort();
                    break;
                case 7:
                    returnBook();
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







