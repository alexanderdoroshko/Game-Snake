import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Apple {
    private static final Image imageApple = new ImageIcon("apple.png").getImage();
    private final int appleX;
    private final int appleY;
    private final int DOT_SIZE = 16;

    public Apple() {
        appleX = new Random().nextInt(20) * DOT_SIZE;
        appleY = new Random().nextInt(20) * DOT_SIZE;
    }

    public  Image getImageApple() {
        return imageApple;
    }

    public int getAppleX() {
        return appleX;
    }

    public int getAppleY() {
        return appleY;
    }
}
