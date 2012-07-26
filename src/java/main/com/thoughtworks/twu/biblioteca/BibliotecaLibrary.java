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
       BibliotecaLibrary Bib=new BibliotecaLibrary();
       Library Lib=new Library();
       Lib= Bib.CreateLibrary(Lib);
       Bib. PrintWelcoming();
       Bib.UserIntraction(Lib);


    }

    private  void UserIntraction(Library Lib) {
        boolean Condition = true;
        while (Condition) {
            PrintMenu();


             Integer i1= ReadInteger();
            Condition= ProccessMenuSelection(i1,Lib);

        }
    }
    public  void PrintWelcoming()
      {
          System.out.println("**********************************************************");
          System.out.println("* Welcome to The Bangalore Public Library System - Biblioteca *");
          System.out.println("**********************************************************");

      }
    public  void PrintMenu()
    {
        System.out.println("**********************************************************");
        System.out.println("*                Menu                                    *");
        System.out.println("*         =====================                          *");
        System.out.println("*         1. List Book Catalog                           *");
        System.out.println("*         2. Reserve a Book                              *");
        System.out.println("*         3. Check LibNumber                             *");
        System.out.println("*         4. View Movie detail                           *");
        System.out.println("*         5. Exit                                        *");
        System.out.println("**********************************************************");
        System.out.println("Your Selection: ");
     }

    public  boolean ProccessMenuSelection(int SelectedMenu ,Library Lib)
    {
        if(SelectedMenu < 1 || SelectedMenu > 5)
        {
            System.out.println("Enter a valid integer between 1 and 4");
        }
        else if (SelectedMenu == 1) {

            Lib.ShowBookStock();

        }
        else if (SelectedMenu == 2) {
           BookReservationProcess(Lib);

        } else if (SelectedMenu == 3) {

            boolean  Check =  Login(Lib) ;
            if(Check==true)
                System.out.println(" Your Library info is correct ");
            else

            System.out.println(" Your Library info does not exist in the system. Please talk to Librarian. Thank you ");

        }
        else if (SelectedMenu == 4) {

            Lib.ShowMovieStock();
        }
        else  if (SelectedMenu == 5) {
            System.out.println("Hope to see you soon. Thank you.");
            return false;

        }
            return true;

}

    private  void BookReservationProcess(Library Lib) {
        System.out.println(" Please enter the code of the book you wish to reserve: ");
        int BookId = 0;
        try {
            BookId = ReadInteger();
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

    public  int ReadInteger()
    {
        InputStreamReader inputStream = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(inputStream);
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


    public  String ReadString()
    {
        InputStreamReader inputStream = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(inputStream);

        try {
            return reader.readLine().toString();

        }
        catch (Exception e) {
            // Do you know what numbers are!!!
            System.out.println("Enter a valid integer!");
        }
        return "";
    }
    public  Library CreateLibrary(Library Lib)
    {
        //Add book
        Books Book1=new Books("Math",1,  Books.BookStatus.Available) ;
        Books Book2=new Books("History",2,  Books.BookStatus.OutOfStock) ;
        Books Book3=new Books("Science",3,  Books.BookStatus.Reserved) ;

        Lib.AddBook(Book1);
        Lib.AddBook(Book2);
        Lib.AddBook(Book3);

        //Add Movie
        Movies Movie1=new Movies("Titanic","name1",  1) ;
        Movies Movie2=new Movies("King Speech","name2",  2) ;
        Movies Movie3=new Movies("Science","name3",  3) ;

        Lib.AddMovie(Movie1);
        Lib.AddMovie(Movie2);
        Lib.AddMovie(Movie3);
        //Add User
        User User1=new User("Librarian","",  "111-1111","123") ;
        User User2=new User("Maryam ","Aidini",  "111-1112","1234") ;
        User User3=new User("Sara","Berry",  "111-1113","12345") ;


        Lib.AddUser(User1);
        Lib.AddUser(User2);
        Lib.AddUser(User3);
        return Lib;
    }

    public boolean Login(Library Lib )
    {
        System.out.println(Lib.UserList.size());
        System.out.println(" Please enter you UserName: ");
        String Usern = ReadString();
        System.out.println(" Please enter you Password: ");
        String Pass = ReadString();

       return CheckUserCredential(Usern, Pass,Lib);
    }

    public boolean CheckUserCredential( String Username, String pass,Library Lib) {
         for (int i=0;i<Lib.UserList.size();i++)
         {
                if((Username.equals(Lib.UserList.get(i).LibrryNumber) ) && (pass.equals(Lib.UserList.get(i).PassWord))  )
                     return true;
         }
        return false;
    }
}
