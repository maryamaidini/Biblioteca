/**
* Created with IntelliJ IDEA.
* User: maidini
* Date: 19/07/2012
* Time: 10:33
* To change this template use File | Settings | File Templates.
*/
package com.thoughtworks.twu.biblioteca;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BibliotecaLibrary {


    /*
    * This is a very looooong method. What could be done about it? Maybe it is doing to many things?
    */
    public static void main(String[] args) {
       Library Lib=new Library();
       Lib= CreateLibrary(Lib);
       PrintWelcoming();
       UserIntraction(Lib);


    }

    private static void UserIntraction(Library Lib) {
        boolean Condition = true;
        while (Condition) {
            PrintMenu();
            InputStreamReader inputStream = new InputStreamReader(System.in);
            BufferedReader reader = new BufferedReader(inputStream);
             Integer i1= ReadMenuNumber( reader );
            Condition= ProccessMenuSelection(i1,Lib, reader);

        }
    }
    public static void PrintWelcoming()
      {
          System.out.println("**********************************************************");
          System.out.println("* Welcome to The Bangalore Public Library System - Biblioteca *");
          System.out.println("**********************************************************");

      }
    public static void PrintMenu()
    {
        System.out.println("**********************************************************");
        System.out.println("*                Menu                                    *");
        System.out.println("*         =====================                          *");
        System.out.println("*         1. List Book Catalog                           *");
        System.out.println("*         2. Reserve a Book                              *");
        System.out.println("*         3. Check LibNumber                             *");
        System.out.println("*         4. Exit                                        *");
        System.out.println("**********************************************************");
        System.out.println("Your Selection: ");
     }

    public static boolean ProccessMenuSelection(int SelectedMenu ,Library Lib, BufferedReader reader)
    {
        if(SelectedMenu < 1 || SelectedMenu > 5)
        {
            System.out.println("Enter a valid integer between 1 and 4");
        }
        else if (SelectedMenu == 1) {

            Lib.ShowStock();

        }
        else if (SelectedMenu == 2) {
           BookReservationProcess(Lib,reader);

        } else if (SelectedMenu == 3) {

            System.out.println(" Please enter your library number: ");
            int i2 = 0;
            try {
                i2 = Integer.parseInt(reader.readLine());
                System.out.println(" Please talk to Librarian. Thank you ");
            } catch (Exception e) {
                // Do you know what numbers are!!!
                System.out.println("Enter a valid integer!!");

            }
        }
        else  if (SelectedMenu == 4) {
            System.out.println("Hope to see you soon. Thank you.");
            return false;

        }
            return true;

}

    private static void BookReservationProcess(Library Lib,BufferedReader reader) {
        System.out.println(" Please enter the code of the book you wish to reserve: ");
        int BookId = 0;
        try {
            BookId = Integer.parseInt(reader.readLine());
        } catch (Exception e) {
            // Do you know what numbers are!!!
            System.out.println("Enter a valid integer!!");

        }
        if(BookId >= 1 && BookId < 4)
        {
            System.out.println("\n");
            Books.ReservationStatus result =Lib.UpdateBookStatus(BookId, Books.BookStatus.Reserved) ;
            if(result ==  Books.ReservationStatus.Successful)
                System.out.println(" Thank You! Enjoy the book");
            else
                System.out.println(" The book is not available");

        }
        else
            System.out.println("Enter a valid Code!!");
    }

    public static int ReadMenuNumber(BufferedReader reader)
    {

        int i1 = 0;
        try {
            String value = reader.readLine();
            i1 = Integer.parseInt(value);
            return i1;
        }
        catch (Exception e) {
            // Do you know what numbers are!!!
            System.out.println("Enter a valid integer!");
        }
        return 0;
    }

    public static Library CreateLibrary(Library Lib)
    {

        Books Book1=new Books("Math",1,  Books.BookStatus.Available) ;
        Books Book2=new Books("History",2,  Books.BookStatus.OutOfStock) ;
        Books Book3=new Books("Science",3,  Books.BookStatus.Reserved) ;

        Lib.AddBook(Book1);
        Lib.AddBook(Book2);
        Lib.AddBook(Book3);
        return Lib;
    }
}
