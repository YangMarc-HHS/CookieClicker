package TimeUse;

import javax.swing.*;
import java.awt.*;

public class mtuBuildingCost extends JLabel {
    public mtuBuildingCost (String text, int x, int y, int width, int height) {
        super(text);
        this.setText(text);
        this.setBounds(x,y,width,height);
        this.setVisible(true);
        this.setOpaque(true);
        this.setHorizontalAlignment(SwingConstants.CENTER);
        this.setVerticalAlignment(SwingConstants.CENTER);
        this.setFont(new Font("Serif", Font.PLAIN, 17));
        this.setBackground(Color.red);

    }
}
