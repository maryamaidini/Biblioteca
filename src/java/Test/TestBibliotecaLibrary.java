import com.thoughtworks.twu.biblioteca.Library;
import org.junit.Test;

import static com.thoughtworks.twu.biblioteca.BibliotecaLibrary.CreateLibrary;
import static junit.framework.Assert.assertEquals;

public class TestBibliotecaLibrary {
      @Test
    public void CreateLibraryTest()
    {
        //Assign
        Library Lib=new Library();


        //Assert
      Lib=CreateLibrary(Lib);

        //test
        assertEquals(3, Lib.ShowStock());
    }
}
