/**
 * Created with IntelliJ IDEA.
 * User: maidini
 * Date: 18/07/2012
 * Time: 14:45
 * To change this template use File | Settings | File Templates.
 */
package TW;

import TW.Enum.EnumObjects;
import TW.Objects.Books;
import TW.Objects.Library;
import TW.OuputFunctions.Welcoming;

public class MainPage {
    public static void main(String[] args)
    {
        //Welcomming
        Welcoming WL=new Welcoming("Welcome To teh Bangalore Public Library");
        WL.run();

        Library Lib=new Library();
        Books Book1=new Books("Math","1", EnumObjects.BookStatus.Available) ;
        Books Book2=new Books("History","2", EnumObjects.BookStatus.OutOfStock) ;
        Books Book3=new Books("Science","2", EnumObjects.BookStatus.Reserved) ;

        Lib.AddBook(Book1);
        Lib.AddBook(Book2);
        Lib.AddBook(Book3);


    }
}
