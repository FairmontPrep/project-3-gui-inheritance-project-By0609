import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class BowlMilk extends JPanel {
    private ImageIcon image;

    public BowlMilk() {
        image = new ImageIcon("images/bowl_milk.png");
    }

    public void draw(Graphics g) {
        g.drawImage(image.getImage(), 0, 0, this);
    }
}
