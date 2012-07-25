package com.thoughtworks.twu.biblioteca;

/**
 * Created with IntelliJ IDEA.
 * User: maidini
 * Date: 23/07/2012
 * Time: 10:31
 * To change this template use File | Settings | File Templates.
 */
public class Movies {



    public String Title;
    public String Director;
    public int Rating;
    public Movies(String title, String Director, int Rat)
    {
        this.Title = title;
        this.Director = Director;
        this.Rating=Rat;
    }

    private String getTitle() {

        return this.Title;

    }



    private String getDirector() {

        return this.Director;

    }



    private int getRating() {

        return this.Rating;

    }

    private void setRating(int Rat) {

        this.Rating = Rat;

    }







}
