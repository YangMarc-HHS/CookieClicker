package TimeUse;

import javax.swing.*;
import java.awt.*;
import java.util.concurrent.atomic.AtomicInteger;

public class otuCpsDisplay extends JLabel {
    public otuCpsDisplay (int cpsAmount) {


        this.setText("CPS: " + cpsAmount);
        this.setBounds(135,270, 230, 50);
        this.setOpaque(true);
        this.setBackground(Color.ORANGE);
        this.setFont(new Font("Serif", Font.PLAIN, 15));
        this.setVisible(true);


    }



}
