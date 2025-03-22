import java.awt.Graphics;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Sweetener extends JPanel {
    private ImageIcon image;
    private boolean hasSweetener;

    public Sweetener() {
        Random rand = new Random();
        hasSweetener = rand.nextBoolean(); // 50% chance of adding sweetener
        if (hasSweetener) {
            image = new ImageIcon("images/sweetener.png");
        }
    }

    public boolean hasSweetener() {
        return hasSweetener;
    }

    public void draw(Graphics g) {
        if (hasSweetener) {
            g.drawImage(image.getImage(), 0, 0, this);
        }
    }
}
