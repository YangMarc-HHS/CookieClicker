import javax.swing.*;
import java.awt.*;

public class mtuBuildingBought extends JLabel {
    public mtuBuildingBought(String text, int x, int y, int width, int height) {
        super(text);
        this.setBounds(x,y,width,height);
        this.setText(text);
        this.setBackground(Color.green);
        this.setVisible(true);
        this.setOpaque(true);
        this.setHorizontalAlignment(SwingConstants.CENTER);
        this.setVerticalAlignment(SwingConstants.CENTER);
        this.setFont(new Font("Serif", Font.PLAIN, 23));


    }

}
