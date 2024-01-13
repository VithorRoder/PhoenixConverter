package mt2converter;

import com.formdev.flatlaf.FlatDarkLaf;
import javax.swing.JFrame;

/**
 *
 * @author Vithor Roder
 */
public class PhoenixConverter {

    public static void main(String[] args) {

        FlatDarkLaf.setup();
        JFrame frame = new FramePhoenixConverter();
        frame.setVisible(true);

    }

}
