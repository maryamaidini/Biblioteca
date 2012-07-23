import TW.Enum.BookStatus;
import TW.Enum.ReservationStatus;
import TW.Objects.Books;
import TW.Objects.Library;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created with IntelliJ IDEA.
 * User: maidini
 * Date: 19/07/2012
 * Time: 11:37
 * To change this template use File | Settings | File Templates.
 */


/*
 * Which parts of your system are testing by this class? Which parts are not? What is the ratio of these parts?
 *
 * Did you try TDD while developing the library system?
 *
 */
public class TestLibrary {
    @Test
public void AddBookTest()
    {
     //Assign
        Library Lib=new Library();


     //Assert
        Books book=new Books("Testname",1, BookStatus.Reserved)    ;
        Lib.AddBook(book);
     //Test
        assertEquals(1, Lib.ShowStock());
    }
    @Test
    public void ChangeBookStatusToNonReserveStatus()
    {
        //Assign
        Library Lib=new Library();
        Books book=new Books("Testname",1, BookStatus.Reserved)    ;
        Lib.AddBook(book);

        //Assert
        ReservationStatus check= Lib.UpdateBookStatus(1, BookStatus.OutOfStock);
        //Test
        assertEquals(ReservationStatus.Successful, check);
    }
    @Test
    public void ChangeBookStatusToReserveFromAvailable()
    {
        //Assign
        Library Lib=new Library();
        Books book=new Books("Testname",1, BookStatus.Available)    ;
        Lib.AddBook(book);

        //Assert
        ReservationStatus check= Lib.UpdateBookStatus(1, BookStatus.Reserved);
        //Test
        assertEquals(ReservationStatus.Successful, check);
    }
    @Test
     public void ChangeBookStatusToReserveFromReserve()
    {
        //Assign
        Library Lib=new Library();
        Books book=new Books("Testname",1, BookStatus.Reserved)    ;
        Lib.AddBook(book);

        //Assert
        ReservationStatus check= Lib.UpdateBookStatus(1, BookStatus.Reserved);
        assertEquals(ReservationStatus.Failed, check);
    }
    @Test
    public void ChangeBookStatusToReserveFromOutOfStock()
    {
        //Assign
        Library Lib=new Library();
        Books book=new Books("Testname",1, BookStatus.OutOfStock)    ;
        Lib.AddBook(book);

        //Assert
        ReservationStatus check= Lib.UpdateBookStatus(1, BookStatus.Reserved);
        //Test
        assertEquals(ReservationStatus.Failed, check);
    }
}
