import com.thoughtworks.twu.biblioteca.Books;
import com.thoughtworks.twu.biblioteca.Library;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created with IntelliJ IDEA.
 * User: maidini
 * Date: 24/07/2012
 * Time: 11:01
 * To change this template use File | Settings | File Templates.
 */
public class TestLibrary  {
    @Test
    public void AddBookTest()
    {
        //Assign
        Library Lib=new Library();


        //Assert
        Books book=new Books("Testname",1,  Books.BookStatus.Reserved)    ;
        Lib.AddBook(book);
        //Test
        assertEquals(1, Lib.ShowStock());
    }
    @Test
    public void ChangeBookStatusToNonReserveStatus()
    {
        //Assign
        Library Lib=new Library();
        Books book=new Books("Testname",1,  Books.BookStatus.Reserved)    ;
        Lib.AddBook(book);

        //Assert
        Books.ReservationStatus check= Lib.UpdateBookStatus(1,  Books.BookStatus.OutOfStock);
        //Test
        assertEquals( Books.ReservationStatus.Successful, check);
    }
    @Test
    public void ChangeBookStatusToReserveFromAvailable()
    {
        //Assign
        Library Lib=new Library();
        Books book=new Books("Testname",1,  Books.BookStatus.Available)    ;
        Lib.AddBook(book);

        //Assert
        Books.ReservationStatus check= Lib.UpdateBookStatus(1,  Books.BookStatus.Reserved);
        //Test
        assertEquals( Books.ReservationStatus.Successful, check);
    }
    @Test
    public void ChangeBookStatusToReserveFromReserve()
    {
        //Assign
        Library Lib=new Library();
        Books book=new Books("Testname",1,  Books.BookStatus.Reserved)    ;
        Lib.AddBook(book);

        //Assert
        Books.ReservationStatus check= Lib.UpdateBookStatus(1,  Books.BookStatus.Reserved);
        assertEquals( Books.ReservationStatus.Failed, check);
    }
    @Test
    public void ChangeBookStatusToReserveFromOutOfStock()
    {
        //Assign
        Library Lib=new Library();
        Books book=new Books("Testname",1,  Books.BookStatus.OutOfStock)    ;
        Lib.AddBook(book);

        //Assert
        Books.ReservationStatus check= Lib.Reserve(0,  Books.BookStatus.Reserved);
        //Test
        assertEquals( Books.ReservationStatus.Failed, check);
    }

}
