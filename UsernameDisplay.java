import javax.swing.*;
import java.awt.*;

public class UsernameDisplay extends JLabel {
    public UsernameDisplay() {


        this.setText("Username");
        this.setBounds(100,100, 300, 75);
        this.setOpaque(true);
        this.setBackground(Color.ORANGE);
        this.setFont(new Font("Serif", Font.PLAIN, 25));

    }
}
