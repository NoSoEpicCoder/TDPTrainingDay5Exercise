package testing;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.accenture.book.Book;
import com.accenture.book.SchoolBook;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class SchoolBookTest {
    private static Book book1 = null;

    @BeforeAll
    static void init(){
        book1 = new SchoolBook("test book", "testing the book object", 20.00, 50);

    }

    @Test
    void getPrice() {
        assertEquals(10.00, book1.getPrice());
        //Need to create an abstract method in Book for get/set setNumOfCopies to call the method bellow
        //book1.setNumOfCopies()
        //assertEquals(10.00, book1.getPrice());
    }

    @org.junit.jupiter.api.Test
    void testToString() {
    }

    @AfterAll
    void cleanUp(){
        book1 = null;
    }
}