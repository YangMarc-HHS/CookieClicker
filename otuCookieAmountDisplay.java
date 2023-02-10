import javax.swing.*;
import java.awt.*;
import java.util.concurrent.atomic.AtomicInteger;

public class otuCookieAmountDisplay extends JLabel {
    public otuCookieAmountDisplay(int cookieAmount) {

        this.setText("Cookie Amount: " + cookieAmount);
        this.setBounds(115,185, 270, 70);
        this.setOpaque(true);
        this.setBackground(Color.ORANGE);
        this.setFont(new Font("Serif", Font.PLAIN, 11));
    }

    public void buttonpressed (AtomicInteger[] cookieAmount) {
        cookieAmount[0].addAndGet(1);
        this.setText("Cookie Amount: " + cookieAmount[0]);
    }


}
