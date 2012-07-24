package com.thoughtworks.twu.biblioteca;

/**
 * Created with IntelliJ IDEA.
 * User: maidini
 * Date: 18/07/2012
 * Time: 15:55
 * To change this template use File | Settings | File Templates.
 */

/*
 * I like that you are separating different classes into packages. How did you decide what to put into which package?
 *
 */
public class Books {

    /*
     * Public state of an object is a dangerous thing. How could you improve encapsulation of this class?
     */
    public String Title;
    public int Code;
    public BookStatus Status;
    public  Books(String title, int code, BookStatus Sts)
    {
         this.Title = title;
        this.Code = code;
        this.Status = Sts;
    }

    public enum ReservationStatus {
        Successful,Failed
    }
    public enum BookStatus {
        Available,Reserved,OutOfStock
    }

}