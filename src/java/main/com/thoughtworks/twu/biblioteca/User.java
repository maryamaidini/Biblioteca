package com.thoughtworks.twu.biblioteca;

/**
 * Created with IntelliJ IDEA.
 * User: maidini
 * Date: 23/07/2012
 * Time: 10:26
 * To change this template use File | Settings | File Templates.
 */
public class User {

    private String FirtsName;
    private String Surename;
    private String LibrryNumber;
    private String PassWord;
    public User(String firtsName, String surename, String LibNumber,String pass)
    {
        this.FirtsName = firtsName;
        this.Surename = surename;
        this.LibrryNumber=LibNumber;
        this.PassWord = pass;
    }
    public String getFirstName() {

        return this.FirtsName;

    }



    public String getSureName() {

        return this.Surename;

    }
    public String getLibraryNumber() {

        return this.LibrryNumber;

    }
    public String getPassword() {

        return this.PassWord;

    }
}
