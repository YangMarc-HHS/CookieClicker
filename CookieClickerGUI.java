import javax.swing.*;
import java.awt.*;
import java.util.concurrent.atomic.AtomicInteger;

public class CookieClickerGUI {

    public CookieClickerGUI() {
        final AtomicInteger[] cookieAmount = {new AtomicInteger()};
        JLabel usernameDisplay = new JLabel();
        usernameDisplay.setText("Username");
        usernameDisplay.setBounds(100,100, 300, 75);
        usernameDisplay.setOpaque(true);
        usernameDisplay.setBackground(Color.ORANGE);
        usernameDisplay.setFont(new Font("Serif", Font.PLAIN, 25));

        JLabel cookieAmountDisplay = new JLabel();
        cookieAmountDisplay.setText("Cookie Amount: " + cookieAmount[0]);
        cookieAmountDisplay.setBounds(115,185, 270, 70);
        cookieAmountDisplay.setOpaque(true);
        cookieAmountDisplay.setBackground(Color.ORANGE);
        cookieAmountDisplay.setFont(new Font("Serif", Font.PLAIN, 20));

        JLabel cpsDisplay = new JLabel();
        cpsDisplay.setText("cps: 0");
        cpsDisplay.setBounds(125,260, 250, 40);
        cpsDisplay.setOpaque(true);
        cpsDisplay.setBackground(Color.ORANGE);
        cpsDisplay.setFont(new Font("Serif", Font.PLAIN, 14));

        CircleButton cookieImage = new CircleButton("Insert Cookie Image");
        cookieImage.setBounds(80, 325, 350,350);
        cookieImage.setFont(new Font("Serif", Font.PLAIN, 30));

        cookieImage.addActionListener(e -> {
            cookieAmount[0].addAndGet(1);
            cookieAmountDisplay.setText("Cookie Amount: " + cookieAmount[0]);
        });

        JButton building1 = new JButton();
        JButton building2 = new JButton();
        JButton building3 = new JButton();
        JButton building4 = new JButton();
        JButton building5 = new JButton();
        JButton building6 = new JButton();

        building1.setText("building1");
        building2.setText("building2");
        building3.setText("building3");
        building4.setText("building4");
        building5.setText("building5");
        building6.setText("building6");

        building1.setBounds(700,100, 300, 75);
        building2.setBounds(700,200, 300, 75);
        building3.setBounds(700,300, 300, 75);
        building4.setBounds(700,400, 300, 75);
        building5.setBounds(700,500, 300, 75);
        building6.setBounds(700,600, 300, 75);

        building1.setOpaque(true);
        building2.setOpaque(true);
        building3.setOpaque(true);
        building4.setOpaque(true);
        building5.setOpaque(true);
        building6.setOpaque(true);

        building1.setBackground(Color.ORANGE);
        building2.setBackground(Color.ORANGE);
        building3.setBackground(Color.ORANGE);
        building4.setBackground(Color.ORANGE);
        building5.setBackground(Color.ORANGE);
        building6.setBackground(Color.ORANGE);

        building1.setFont(new Font("Serif", Font.PLAIN, 23));
        building2.setFont(new Font("Serif", Font.PLAIN, 23));
        building3.setFont(new Font("Serif", Font.PLAIN, 23));
        building4.setFont(new Font("Serif", Font.PLAIN, 23));
        building5.setFont(new Font("Serif", Font.PLAIN, 23));
        building6.setFont(new Font("Serif", Font.PLAIN, 23));


//        JLabel buildingAmount1 = new JLabel();
//        JLabel buildingAmount2 = new JLabel();
//        JLabel buildingAmount3 = new JLabel();
//        JLabel buildingAmount4 = new JLabel();
//        JLabel buildingAmount5 = new JLabel();
//        JLabel buildingAmount6 = new JLabel();

        JLabel buildingAmount1 = new JLabel("X", SwingConstants.CENTER);
        JLabel buildingAmount2 = new JLabel("X", SwingConstants.CENTER);
        JLabel buildingAmount3 = new JLabel("X", SwingConstants.CENTER);
        JLabel buildingAmount4 = new JLabel("X", SwingConstants.CENTER);
        JLabel buildingAmount5 = new JLabel("X", SwingConstants.CENTER);
        JLabel buildingAmount6 = new JLabel("X", SwingConstants.CENTER);


        buildingAmount1.setBounds(1050,100, 100, 75);
        buildingAmount2.setBounds(1050,200, 100, 75);
        buildingAmount3.setBounds(1050,300, 100, 75);
        buildingAmount4.setBounds(1050,400, 100, 75);
        buildingAmount5.setBounds(1050,500, 100, 75);
        buildingAmount6.setBounds(1050,600, 100, 75);

        buildingAmount1.setOpaque(true);
        buildingAmount2.setOpaque(true);
        buildingAmount3.setOpaque(true);
        buildingAmount4.setOpaque(true);
        buildingAmount5.setOpaque(true);
        buildingAmount6.setOpaque(true);

        buildingAmount1.setBackground(Color.ORANGE);
        buildingAmount2.setBackground(Color.ORANGE);
        buildingAmount3.setBackground(Color.ORANGE);
        buildingAmount4.setBackground(Color.ORANGE);
        buildingAmount5.setBackground(Color.ORANGE);
        buildingAmount6.setBackground(Color.ORANGE);

        buildingAmount1.setFont(new Font("Serif", Font.PLAIN, 23));
        buildingAmount2.setFont(new Font("Serif", Font.PLAIN, 23));
        buildingAmount3.setFont(new Font("Serif", Font.PLAIN, 23));
        buildingAmount4.setFont(new Font("Serif", Font.PLAIN, 23));
        buildingAmount5.setFont(new Font("Serif", Font.PLAIN, 23));
        buildingAmount6.setFont(new Font("Serif", Font.PLAIN, 23));

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setBounds(190,60,1200,850);
        frame.setVisible(true);
        frame.add(usernameDisplay);
        frame.add(cookieAmountDisplay);
        frame.add(cpsDisplay);
        frame.add(cookieImage);

        frame.add(building1);
        frame.add(building2);
        frame.add(building3);
        frame.add(building4);
        frame.add(building5);
        frame.add(building6);

        frame.add(buildingAmount1);
        frame.add(buildingAmount2);
        frame.add(buildingAmount3);
        frame.add(buildingAmount4);
        frame.add(buildingAmount5);
        frame.add(buildingAmount6);

    }
}
