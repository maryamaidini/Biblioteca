package TW;

/**
 * Created with IntelliJ IDEA.
 * User: maidini
 * Date: 19/07/2012
 * Time: 10:33
 * To change this template use File | Settings | File Templates.
 */


import TW.Enum.EnumObjects;
import TW.Objects.Library;

import java.io.BufferedReader;
import java.io.InputStreamReader;// package com.thoughtworks.biblioteca;

public class BibliotecaLibrary {


    /*
    * This is a very looooong method. What could be done about it? Maybe it is doing to many things?
    */
    public static void main(String[] args) {
        Library Lib=new Library();
       Lib= Lib.CreateLibrary(Lib);
        System.out.println("**********************************************************");
        System.out.println("* Welcome to The Bangalore Public Library System - Biblioteca *");
        System.out.println("**********************************************************");
          boolean Condition = true;
        while (Condition) {
            System.out.println("**********************************************************");
            System.out.println("*                Menu                                    *");
            System.out.println("*         =====================                          *");
            System.out.println("*         1. List Book Catalog                           *");
            System.out.println("*         2. Reserve a Book                              *");
            System.out.println("*         3. Check LibNumber                             *");
            System.out.println("*         4. Exit                                        *");
            System.out.println("**********************************************************");
            System.out.println("Your Selection: ");


            InputStreamReader inputStream = new InputStreamReader(System.in);
            BufferedReader reader = new BufferedReader(inputStream);
            int i1 = 0;
            try {
                String value = reader.readLine();
                i1 = Integer.parseInt(value);
            } catch (Exception e) {
                // Do you know what numbers are!!!
                System.out.println("Enter a valid integer!!");
            }

            if(i1 < 1 || i1 > 5)
            {

                System.out.println("Enter a valid integer between 1 and 3");
            }
            else if (i1 == 1) {

                Lib.ShowStock();

            }
            else if (i1 == 2) {
                System.out.println(" Please enter the code of the book you wish to reserve: ");
                int i2 = 0;
                try {
                    i2 = Integer.parseInt(reader.readLine());
                } catch (Exception e) {
                    // Do you know what numbers are!!!
                    System.out.println("Enter a valid integer!!");

                }
                if(i2>=1 && i2<4)
                {
                        System.out.println("\n");
                        String result =Lib.UpdateBookStatus(i2,EnumObjects.BookStatus.Reserved) ;
                    if(result == "")
                        System.out.println(" Thank You! Enjoy the book");
                    else
                        System.out.println(result);

                }
                else
                    System.out.println("Enter a valid Code!!");

            } else if (i1 == 3) {

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
             else  if (i1 == 4) {
                System.out.println("Hope to see you soon. Thank you.");
                Condition = false;

            }



        }
    }




}
