import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class CerealBase extends JPanel {
    private ImageIcon image;

    public CerealBase() {
        image = new ImageIcon("images/cereal_base.png");
    }

    public void draw(Graphics g) {
        g.drawImage(image.getImage(), 0, 0, this);
    }
}
