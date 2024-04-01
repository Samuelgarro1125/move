
import javax.swing.*;

public class latin {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        CuadroMovable cuadro = new CuadroMovable();
        frame.add(cuadro);
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
