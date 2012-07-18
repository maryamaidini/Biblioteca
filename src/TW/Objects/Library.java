package TW.Objects;
     import java.util.List;
/**
 * Created with IntelliJ IDEA.
 * User: maidini
 * Date: 18/07/2012
 * Time: 15:45
 * To change this template use File | Settings | File Templates.
 */
public class Library {
    public List<Books> BookList;

    public void AddBook(Books Book)
    {
        BookList.add(Book);
    }

}
