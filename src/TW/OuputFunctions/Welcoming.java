package TW.OuputFunctions;

/**
 * Created with IntelliJ IDEA.
 * User: maidini
 * Date: 18/07/2012
 * Time: 15:40
 * To change this template use File | Settings | File Templates.
 */
public class Welcoming {
    private String welcome;

    public Welcoming(String welcome) {
        this.welcome = welcome;
    }

    public void run() {
        System.out.println(welcome);
    }
}