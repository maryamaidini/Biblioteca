package TW.Objects;
     import TW.Enum.EnumObjects;

import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: maidini
 * Date: 18/07/2012
 * Time: 15:45
 * To change this template use File | Settings | File Templates.
 */
public class Library {

     ArrayList<Books> BookList=new ArrayList<Books>();

    public void AddBook(Books Book)
    {
        BookList.add(Book);
    }
     public int ShowStock()
     {
         System.out.println("These are the  of the Books");
         System.out.println("Title                Code                    availability");

         for (int i=0;i<BookList.size();i++)
         {

             System.out.println(BookList.get(i).Title + "                  "+BookList.get(i).Code+ "                    "+BookList.get(i).Status);
         }
         return BookList.size();

     }


     /*
      * Very deep nested indeed. How could this be flattened? Why would we want to do that?
      *
      * What is the meaning of the return codes please?
      */
     public String UpdateBookStatus(int code,EnumObjects.BookStatus Status)
     {
         for (int i=0;i<BookList.size();i++)
          {

               if(BookList.get(i).Code == code  )
               {
                   if(Status == EnumObjects.BookStatus.Reserved)
                   {
                       if( BookList.get(i).Status == EnumObjects.BookStatus.OutOfStock || BookList.get(i).Status == EnumObjects.BookStatus.Reserved)
                           return "Sorry we don't have that book yet";
                        else
                        {
                              BookList.get(i).Status = Status;
                              return "";
                        }
                   }
                   else
                   {
                       BookList.get(i).Status = Status;
                       return "";
                   }

               }
          }
         return " ";
     }

    /*
     * Would this class be a good place for this method?
     */
    public Library CreateLibrary(Library Lib)
    {

        Books Book1=new Books("Math",1, EnumObjects.BookStatus.Available) ;
        Books Book2=new Books("History",2, EnumObjects.BookStatus.OutOfStock) ;
        Books Book3=new Books("Science",3, EnumObjects.BookStatus.Reserved) ;

        Lib.AddBook(Book1);
        Lib.AddBook(Book2);
        Lib.AddBook(Book3);
        return Lib;
    }
}
