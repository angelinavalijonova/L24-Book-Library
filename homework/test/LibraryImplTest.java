package lesson24.homework.test;
////создаем класс LibraryImplTest, в котором создаем тесты для вышеперечисленных методов;
////разрабатываем тесты по аналогии с работой на занятии.

import lesson24.homework.dao.Library;
import lesson24.homework.dao.LibraryImpl;
import lesson24.homework.model.Book;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LibraryImplTest {

    Library library;

    @BeforeEach

    void setUp(){
        library = new LibraryImpl(5);
        library.addBook(new Book(123456789,"Stephen King","Misery",1996));
        library.addBook(new Book(234567890,"Stephen King","Mister M",1986));
        library.addBook(new Book(234567890,"Stephen King","Mister M",1986));
        library.addBook(new Book(345678901,"Stephen King","Holy",2023));
//        array = new Book[4];
//        array[0] = new Book(123456789,"Stephen King","Misery",1996);
//        array[1] = new Book(234567890,"Stephen King","Mister M",1986);
//        array[2] = new Book(345678901,"Stephen King","Holy",2023);
//        array[3] = new Book(456789012,"Stephen King","Shine",1980);
//        for (int i = 0; i <array.length ; i++) {
//            library.addBook(array[i]);
//        }
    }

    @Test
    void testPrintBook(){
        library.printBooks();
    }


    @Test
    void testAddBook() {
        boolean addBookResult = library.addBook(new Book(345678901,"Stephen King","Holy",2023));
        assertTrue(addBookResult);

        addBookResult = library.addBook(new Book(345678901,"Stephen King","Holy",2023));
        assertFalse(addBookResult);
    }

    @Test
    void testFindBook(){
        Book foundBook = library.findBook("Mister M");
        assertEquals("Mister M", foundBook.getNameOfBook());
    }

    @Test
    void testRemoveBook(){
       Book removedBook = library.removeBook("Misery");
       assertEquals("Misery", removedBook.getNameOfBook());
    }

    @Test
    void  testQuantity(){
        int expectedQty = 4;
        int resultQty = library.quantity();
        assertEquals(expectedQty, resultQty);
    }
}
