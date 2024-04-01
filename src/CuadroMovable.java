
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JPanel;




public class CuadroMovable extends JPanel implements KeyListener {

    private int x = 50;
    private int y = 50;

    public CuadroMovable() {
        addKeyListener(this);
        setFocusable(true);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.orange);
        g.fillRect(x, y, 50, 50);
    }

    public void keyPressed(KeyEvent e) {
        int keyCode = e.getKeyCode();
        switch (keyCode) {
            case KeyEvent.VK_UP:
                y -= 5;
                break;
            case KeyEvent.VK_DOWN:
                y += 5;
                break;
            case KeyEvent.VK_LEFT:
                x -= 5;
                break;
            case KeyEvent.VK_RIGHT:
                x += 5;
                break;
        }
        repaint();
    }

    public void keyReleased(KeyEvent e) {
    }

    public void keyTyped(KeyEvent e) {
    }

}
