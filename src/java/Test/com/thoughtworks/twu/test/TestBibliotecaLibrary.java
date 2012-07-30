package com.thoughtworks.twu.test;

import com.thoughtworks.twu.biblioteca.BibliotecaLibrary;
import com.thoughtworks.twu.biblioteca.Library;
import org.junit.Test;

import java.io.*;

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
    public void ProccessMenuTest_CheckLibraryNumber() throws FileNotFoundException {
        //Assign
        Library Lib=new Library();

        BibliotecaLibrary Bib=new BibliotecaLibrary();
        Lib=Bib.CreateLibrary(Lib);
        //Assert
        System.setIn(new FileInputStream("LoginTrue.txt"));

        boolean  Check=Bib.ProccessMenuSelection(3,Lib);

        //test
        assertEquals(true, Check);

    }
    @Test
    public void CheckUserCredentialTest()
    {
        //Assign
        Library Lib=new Library();

        BibliotecaLibrary Bib=new BibliotecaLibrary();
        Bib.CreateLibrary(Lib);
        //Assert
        boolean  CheckTrue=Bib.CheckUserCredential("111-1112","1234",Lib) ;
        boolean  CheckFalse=Bib.CheckUserCredential("111-1112","123",Lib) ;

        //test
        assertEquals(true, CheckTrue);
        assertEquals(false, CheckFalse);


    }

    @Test
    public void ReadIntegerTest() throws IOException {
        //Assign
        Library Lib=new Library();

        // Assign an existing input file to input stream:
        System.setIn(new FileInputStream("InputFile.txt"));
        InputStreamReader inputStream = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(inputStream);
        BibliotecaLibrary Bib=new BibliotecaLibrary();
        //Assert
        int Num=Bib.ReadInteger(reader);
        int Num2=Bib.ReadInteger(reader);
        System.out.println("num1 = "+Num);
        System.out.println("num2 = "+Num2);
        //test
        assertEquals(Num, 7);
        assertEquals(Num2, 5);
    }
    @Test
    public void ReadStringTest() throws IOException {
        //Assign
        Library Lib=new Library();

        // Assign an existing input file to input stream:
        System.setIn(new FileInputStream("InputFile.txt"));
        InputStreamReader inputStream = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(inputStream);
        BibliotecaLibrary Bib=new BibliotecaLibrary();
        //Assert
        String Num=Bib.ReadString(reader);

        //test
        assertEquals(Num, "7");

    }
    @Test
    public void LoginTrueTest() throws IOException {
        //Assign
        Library Lib=new Library();

        // Assign an existing input file to input stream:
        System.setIn(new FileInputStream("LoginTrue.txt"));

        BibliotecaLibrary Bib=new BibliotecaLibrary();
        Lib=Bib.CreateLibrary(Lib);
        //Assert
        Boolean Num=Bib.Login(Lib);

        //test
        assertEquals((Object) Num, true);

    }
    @Test
    public void LoginFalseTest() throws IOException {
        //Assign
        Library Lib=new Library();

        // Assign an existing input file to input stream:
        System.setIn(new FileInputStream("LoginFalse.txt"));

        BibliotecaLibrary Bib=new BibliotecaLibrary();
        Lib=Bib.CreateLibrary(Lib);
        //Assert
        Boolean Num=Bib.Login(Lib);

        //test
        assertEquals((Object) Num, false);

    }


    @Test
    public void BookReservationProcessTestSuccess() throws IOException {
        //Assign
        Library Lib=new Library();

        // Assign an existing input file to input stream:
        System.setIn(new FileInputStream("ReservationSuccess.txt"));

        BibliotecaLibrary Bib=new BibliotecaLibrary();
        Lib=Bib.CreateLibrary(Lib);
        //Assert
        boolean  Result=Bib.BookReservationProcess(Lib);

        //test
        assertEquals(Result, true);

    }

    @Test
    public void BookReservationProcessTestFailed() throws IOException {
        //Assign
        Library Lib=new Library();

        // Assign an existing input file to input stream:
        System.setIn(new FileInputStream("ReservationFailed.txt"));

        BibliotecaLibrary Bib=new BibliotecaLibrary();
        Lib=Bib.CreateLibrary(Lib);
        //Assert
        boolean  Result=Bib.BookReservationProcess(Lib);

        //test
        assertEquals(Result, false);

    }
}
