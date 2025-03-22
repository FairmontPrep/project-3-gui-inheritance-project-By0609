import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class CerealGUI extends JPanel {
    private Image bowlMilk, cerealBase, chocoTopping, fruitTopping, sweetener;
    private Random random;

    public CerealGUI() {
        random = new Random();

        // Load images
        bowlMilk = new ImageIcon("images/bowl_milk.png").getImage();
        cerealBase = new ImageIcon("images/cereal_base.png").getImage();
        chocoTopping = new ImageIcon("images/topping_choco.png").getImage();
        fruitTopping = new ImageIcon("images/topping_fruit.png").getImage();
        sweetener = new ImageIcon("images/sweetener.png").getImage();

        // Generate random cereal bowl
        generateRandomCereal();
    }

    private void generateRandomCereal() {
        StringBuilder description = new StringBuilder("A bowl of milk with ");

        // Bowl with milk (Always present)
        description.append("a layer of cereal ");

        // Cereal base (Always present)
        description.append("and cereal ");

        // Randomly select topping
        boolean isChoco = random.nextBoolean();
        boolean hasSweetener = random.nextBoolean();

        if (isChoco) {
            description.append("with chocolate topping ");
        } else {
            description.append("with fruit topping ");
        }

        // Randomly decide if sweetener is added
        if (hasSweetener) {
            description.append("and a touch of sweetener.");
        } else {
            description.append("without sweetener.");
        }

        // Print the final description
        System.out.println(description.toString());

        // Force repaint to update the image
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Draw bowl with milk (Always present)
        g.drawImage(bowlMilk, 0, 0, this);

        // Draw cereal base (Always present)
        g.drawImage(cerealBase, 0, 0, this);

        // Draw random topping
        if (random.nextBoolean()) {
            g.drawImage(chocoTopping, 0, 0, this);
        } else {
            g.drawImage(fruitTopping, 0, 0, this);
        }

        // Draw sweetener randomly
        if (random.nextBoolean()) {
            g.drawImage(sweetener, 0, 0, this);
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Random Cereal Generator");
        CerealGUI panel = new CerealGUI();

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.add(panel);
        frame.setVisible(true);
    }
}
