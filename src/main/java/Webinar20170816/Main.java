package Webinar20170816;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Lenovo on 16.08.2017.
 */
public class Main {
    public static void main(String[] args) {
        new Main();
    }

    private Scanner scanner;
    private List<Book> bookList;

    public Main() {
        scanner = new Scanner(System.in);
        bookList = Utils.parseBooksFromFiles(Paths.get("C:\\Users\\lukasz\\Desktop\\Intelij\\Webinar4\\src\\books.txt"));//Utils.parseBooksFromFile(Paths.get("books.txt"));
        start();
    }


    private void start() {
        System.out.println("Witaj w mojej bibliotece!");

        String command;
        do {
            System.out.println("1 - Dodawanie ksiazki");
            System.out.println("2 - Wypozyczenie ksiazki");
            System.out.println("3 - Oddawanie ksiazki");
            System.out.println("4 - Wyswietl wolne pozycje");

            System.out.print("Wpisz polecenie: ");
            command = scanner.nextLine();
            parseChoice(command);

        } while (!command.equals("exit"));
    }

    private void parseChoice(String command) {
        switch (command) {
            case "4": {
                showFreeBooks();
                break;
            }
            case "1":{
                addBook();
                break;
            }
            case "2": {
                rentBook();
                break;
            }
            case "3": {
                bringBackBook();
                break;
            }
            case "exit":{
              Utils.saveBooksToFile(Paths.get("books.txt"),bookList);
              break;
            }

                default:{
                    System.out.println("Nie ma takiej komendy");
                    break;
                }
        }
    }

    private void bringBackBook() {
        System.out.println("Podaj nazwe ksiazki ktora chcesz zwrocic: ");
        String name=scanner.nextLine();

        for(Book book : bookList){
            if(book.getName().equalsIgnoreCase(name)&& book.getRentStatus()==1){
                book.setRentStatus(0);
                System.out.println("Dzieki za zwrocenie ksiazki");
                return;
            }
        }
    }

    private void rentBook() {
        System.out.println("Podaj nazwe ksiazki ktora chcesz wypozyczyc: ");
        String name=scanner.nextLine();

        for(Book book : bookList){
            if(book.getName().equalsIgnoreCase(name)&&book.getRentStatus()==0){
                book.setRentStatus(1);
                System.out.println("Wypozyczono ksiazke "+book.getName());
                System.out.println("Oddaj jak tylko przeczytasz!");
                return;
            }
        }
    }


    private void showFreeBooks() {
        for (Book book : bookList) {
            if (book.getRentStatus() == 0) {
                System.out.println("Wolna pozycja: " + book.getName());
            }
        }
    }

    private void addBook() {
        System.out.println("Dodajesz now± ksi±zke!");

        String title, author;
        int pages, producerYear;

        System.out.println("Tytul: ");
        title = scanner.nextLine();


        System.out.println("Autor: ");
        author = scanner.nextLine();


        System.out.println("Ilosc stron: ");
        pages = Integer.parseInt(scanner.nextLine());


        System.out.println("Rok wydania: ");
        producerYear = Integer.parseInt(scanner.nextLine());

        bookList.add(new Book(title,author,producerYear,pages,0));
        System.out.println("Dodano ksiazke do listy !");
    }


}