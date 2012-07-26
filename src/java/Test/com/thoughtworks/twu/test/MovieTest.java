package com.thoughtworks.twu.test;

import com.thoughtworks.twu.biblioteca.Library;
import com.thoughtworks.twu.biblioteca.Movies;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created with IntelliJ IDEA.
 * User: maidini
 * Date: 25/07/2012
 * Time: 16:12
 * To change this template use File | Settings | File Templates.
 */
public class MovieTest {
    @Test
    public void AddMovieTest()
    {
        //Assign
        Library Lib=new Library();


        //Assert
        Movies Movie =new Movies("Testname","TestDirector",  1)    ;
        Lib.AddMovie(Movie);
        //Test
        assertEquals(1, Lib.ShowMovieStock());
    }

}
