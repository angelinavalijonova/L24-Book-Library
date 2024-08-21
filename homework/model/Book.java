package lesson24.homework.model;
//создаем класс Book c полями ISBN, автор, название книги, год издания;
//создаем интерфейс Library с методами:
//добавить книгу;
//удалить книгу;
//найти книгу;
//кол-во книг;
//напечатать список книг.
//создаем класс LibraryImpl, который implements Library;
//создаем класс LibraryImplTest, в котором создаем тесты для вышеперечисленных методов;
//разрабатываем тесты по аналогии с работой на занятии.

public class Book {

   private int ISBN;
   private String author;
   private String nameOfBook;
   private int yearOfPub;

   public Book(int ISBN, String author, String nameOfBook, int yearOfPub) {
      this.ISBN = ISBN;
      this.author = author;
      this.nameOfBook = nameOfBook;
      this.yearOfPub = yearOfPub;
   }

   public int getISBN() {
      return ISBN;
   }

   public void setISBN(int ISBN) {
      this.ISBN = ISBN;
   }

   public String getAuthor() {
      return author;
   }

   public void setAuthor(String author) {
      this.author = author;
   }

   public String getNameOfBook() {
      return nameOfBook;
   }

   public void setNameOfBook(String nameOfBook) {
      this.nameOfBook = nameOfBook;
   }

   public int getYearOfPub() {
      return yearOfPub;
   }

   public void setYearOfPub(int yearOfPub) {
      this.yearOfPub = yearOfPub;
   }

   @Override
   public String toString() {
      final StringBuilder sb = new StringBuilder("Book{");
      sb.append("ISBN=").append(ISBN);
      sb.append(", author='").append(author).append('\'');
      sb.append(", nameOfBook='").append(nameOfBook).append('\'');
      sb.append(", yearOfPub=").append(yearOfPub);
      sb.append('}');
      return sb.toString();
   }
}
