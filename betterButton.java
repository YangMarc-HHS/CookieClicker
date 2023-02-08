import javax.swing.*;
import java.awt.*;

public class betterButton extends JButton {
    public betterButton (String text, int x, int y ,int width, int height) {
        super(text);
        this.setBounds(x,y,width,height);
        this.setVisible(true);
        this.setBackground(Color.red);
        this.setText(text);

    }
}
