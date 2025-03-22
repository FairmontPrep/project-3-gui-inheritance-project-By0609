import java.awt.Graphics;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Topping extends JPanel {
    private ImageIcon image;
    private String type;

    public Topping() {
        Random rand = new Random();
        if (rand.nextBoolean()) {
            image = new ImageIcon("images/topping_choco.png");
            type = "choco";
        } else {
            image = new ImageIcon("images/topping_fruit.png");
            type = "fruit";
        }
    }

    public String getType() {
        return type;
    }

    public void draw(Graphics g) {
        g.drawImage(image.getImage(), 0, 0, this);
    }
}
