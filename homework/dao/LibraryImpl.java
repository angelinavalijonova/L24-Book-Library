package lesson24.homework.dao;
//создаем класс LibraryImpl, который implements Library;

import lesson24.homework.model.Book;

public class LibraryImpl implements Library {

    private int size;// size of array
    private Book[] books;

    public LibraryImpl(int size) {
        this.size = size;
        books = new Book[size];
    }

    @Override
    public boolean addBook(Book b) {
        for (int i = 0; i < books.length; i++) {
            if (books[i] == null) {
                books[i] = b;
                return true;
            }
        }
        return false;
    }

    @Override
    public Book removeBook(String nameOfBook) {
        Book deletedBook = null;
        for (int i = 0; i < size; i++) {
            if(books[i] != null && books[i].getNameOfBook().equals(nameOfBook)){
                deletedBook = books[i];
                books[i] = null;
                break;
            }
        }
        return deletedBook;
    }

    @Override
    public Book findBook(String nameOfBook) {
        for (int i = 0; i < size; i++) {
            if(books[i] != null && books[i].getNameOfBook().equals(nameOfBook)){
                return books[i];
            }
        }
        return null;
    }

    @Override
    public int quantity() {
        int counter = 0;
        for (int i = 0; i < size; i++) {
            if(books[i] != null ){
                counter++;
            }
        }
        return counter;
    }

    @Override
    public void printBooks() {
        for (int i = 0; i < size ; i++) {
            if(books[i] != null)
                System.out.println(books[i]);
        }

    }
}
