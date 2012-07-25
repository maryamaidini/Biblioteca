import com.thoughtworks.twu.biblioteca.BibliotecaLibrary;
import com.thoughtworks.twu.biblioteca.Library;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class TestBibliotecaLibrary {
      @Test
    public void CreateLibraryTest()
    {
        //Assign
        Library Lib=new Library();

         BibliotecaLibrary Bib=new BibliotecaLibrary();
        //Assert
      Lib=Bib.CreateLibrary(Lib);

        //test
        assertEquals(3, Lib.ShowBookStock());
        assertEquals(3, Lib.ShowMovieStock());
    }
    @Test
    public void ProccessMenuTest_Exit()
    {
        //Assign
        Library Lib=new Library();

        BibliotecaLibrary Bib=new BibliotecaLibrary();
        //Assert
        boolean  Check=Bib.ProccessMenuSelection(5,Lib);

        //test
        assertEquals(false, Check);

    }
    @Test
    public void ProccessMenuTest_ShowBooks()
    {
        //Assign
        Library Lib=new Library();

        BibliotecaLibrary Bib=new BibliotecaLibrary();
        //Assert
        boolean  Check=Bib.ProccessMenuSelection(1,Lib);

        //test
        assertEquals(true, Check);

    }

    @Test
    public void ProccessMenuTest_ShowMovies()
    {
        //Assign
        Library Lib=new Library();

        BibliotecaLibrary Bib=new BibliotecaLibrary();
        //Assert
        boolean  Check=Bib.ProccessMenuSelection(4,Lib);

        //test
        assertEquals(true, Check);

    }
    @Test
    public void ProccessMenuTest_CheckLibraryNumber()
    {
        //Assign
        Library Lib=new Library();

        BibliotecaLibrary Bib=new BibliotecaLibrary();
        //Assert
        boolean  Check=Bib.ProccessMenuSelection(3,Lib);

        //test
        assertEquals(true, Check);

    }
    /*
    @Test
    public void ReadIntegerTest()
    {
        //Assign
        Library Lib=new Library();

        BibliotecaLibrary Bib=new BibliotecaLibrary();
        //Assert
        int Num=Bib.ReadInteger();

        //test
        assertEquals(Num, 0);

    }
    */

}
