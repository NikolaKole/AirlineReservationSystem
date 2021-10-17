
import controler.Controller;
import view.FirstFrame;

/**
 *
 * @author Nikola
 */
public class Main {

    public static void main(String[] args) {
        FirstFrame frame = new FirstFrame();
        Controller controller = new Controller(frame);
    }
}
