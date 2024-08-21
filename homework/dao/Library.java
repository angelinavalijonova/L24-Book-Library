package lesson24.homework.dao;

import lesson24.homework.model.Book;

////создаем интерфейс Library с методами:
////добавить книгу;
////удалить книгу;
////найти книгу;
////кол-во книг;
////напечатать список книг.
public interface Library {

    boolean addBook(Book b);  // добавить книгу

    Book removeBook(String nameOfBook); // /удалить книгу;

    Book findBook(String nameOfBook);//найти книгу;

    int quantity();// кол-во книг;

    void printBooks();


}
