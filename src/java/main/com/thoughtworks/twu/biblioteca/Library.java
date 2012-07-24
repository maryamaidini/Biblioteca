package com.thoughtworks.twu.biblioteca;
import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: maidini
 * Date: 18/07/2012
 * Time: 15:45
 * To change this template use File | Settings | File Templates.
 */
public class Library {

     ArrayList<com.thoughtworks.twu.biblioteca.Books> BookList=new ArrayList<Books>();

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
     public  Books.ReservationStatus UpdateBookStatus(int code, Books.BookStatus Status)
     {

         for (int i=0;i<BookList.size();i++)
          {
              if(BookList.get(i).Code == code  )
              {
                 return Reserve(i, Status);
              }
          }
         return  Books.ReservationStatus.Failed;
     }

    public Books.ReservationStatus Reserve(int i, Books.BookStatus Status) {

            if(Status ==  Books.BookStatus.Reserved)
            {
                if( BookList.get(i).Status ==  Books.BookStatus.OutOfStock || BookList.get(i).Status ==  Books.BookStatus.Reserved)
                    return  Books.ReservationStatus.Failed      ;
                else
                {
                    BookList.get(i).Status = Status;
                    return  Books.ReservationStatus.Successful;
                }
            }
            else
            {
                BookList.get(i).Status = Status;
                return  Books.ReservationStatus.Successful;
            }


    }


}