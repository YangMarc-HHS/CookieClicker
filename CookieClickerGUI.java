import javax.swing.*;
import java.awt.*;
import java.util.concurrent.atomic.AtomicInteger;

public class CookieClickerGUI {

    public CookieClickerGUI() {

        final AtomicInteger[] cookieAmount = {new AtomicInteger()};


        final AtomicInteger[] amountBought1 = {new AtomicInteger()};
        final AtomicInteger[] amountBought2 = {new AtomicInteger()};
        final AtomicInteger[] amountBought3 = {new AtomicInteger()};
        final AtomicInteger[] amountBought4 = {new AtomicInteger()};
        final AtomicInteger[] amountBought5 = {new AtomicInteger()};
        final AtomicInteger[] amountBought6 = {new AtomicInteger()};




        UsernameDisplay usernameDisplay = new UsernameDisplay();
        CookieAmountDisplay cookieAmountDisplay = new CookieAmountDisplay(cookieAmount);

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

        buildingButton building1 = new buildingButton ("Building 1", 700,100,300,75);
        buildingButton building2 = new buildingButton ("Building 2", 700,200,300,75);
        buildingButton building3 = new buildingButton ("Building 3", 700,300,300,75);
        buildingButton building4 = new buildingButton ("Building 4", 700,400,300,75);
        buildingButton building5 = new buildingButton ("Building 5", 700,500,300,75);
        buildingButton building6 = new buildingButton ("Building 6", 700,600,300,75);

        JLabel buildingAmount1 = new JLabel("0", SwingConstants.CENTER);
        JLabel buildingAmount2 = new JLabel("0", SwingConstants.CENTER);
        JLabel buildingAmount3 = new JLabel("0", SwingConstants.CENTER);
        JLabel buildingAmount4 = new JLabel("0", SwingConstants.CENTER);
        JLabel buildingAmount5 = new JLabel("0", SwingConstants.CENTER);
        JLabel buildingAmount6 = new JLabel("0", SwingConstants.CENTER);

        building1.addActionListener(e -> {
            amountBought1[0].addAndGet(1);
            buildingAmount1.setText( "" + amountBought1[0]);
        });
        building2.addActionListener(e -> {
            amountBought2[0].addAndGet(1);
            buildingAmount2.setText( "" + amountBought2[0]);
        });
        building3.addActionListener(e -> {
            amountBought3[0].addAndGet(1);
            buildingAmount3.setText( "" + amountBought3[0]);
        });
        building4.addActionListener(e -> {
            amountBought4[0].addAndGet(1);
            buildingAmount4.setText( "" + amountBought4[0]);
        });
        building5.addActionListener(e -> {
            amountBought5[0].addAndGet(1);
            buildingAmount5.setText( "" + amountBought5[0]);
        });
        building6.addActionListener(e -> {
            amountBought6[0].addAndGet(1);
            buildingAmount6.setText( "" + amountBought6[0]);
        });



        //buildingAmount1.setBounds(1050,100, 100, 75);

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


        JLabel cost = new JLabel("hello");

        buildingAmount1.setSize(300,400);
        building1.setSize(500,400);
        building1.setMinimumSize(new Dimension(300, 75));

        JPanel buildingPanel = new JPanel();

        buildingPanel panelX = new buildingPanel(building1, buildingAmount1,cost);

        buildingPanel.add(building1);
        buildingPanel.add(buildingAmount1);
        buildingPanel.setVisible(true);
        buildingPanel.setBackground(Color.CYAN);
        buildingPanel.setBounds(700,100,450,100);


        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setBounds(190,60,1200,850);
        frame.setVisible(true);


        frame.add(usernameDisplay);
        frame.add(cookieAmountDisplay);
        frame.add(cpsDisplay);
        frame.add(cookieImage);

        frame.add(buildingPanel);
        //frame.add(building1);
        frame.add(building2);
        frame.add(building3);
        frame.add(building4);
        frame.add(building5);
        frame.add(building6);

       //frame.add(buildingAmount1);
        frame.add(buildingAmount2);
        frame.add(buildingAmount3);
        frame.add(buildingAmount4);
        frame.add(buildingAmount5);
        frame.add(buildingAmount6);




        //JLabel usernameDisplay = new JLabel();
        usernameDisplay.setText("Username");
        usernameDisplay.setBounds(100,100, 300, 75);
        usernameDisplay.setOpaque(true);
        usernameDisplay.setBackground(Color.ORANGE);
        usernameDisplay.setFont(new Font("Serif", Font.PLAIN, 25));

/*
        buildingButton button = new buildingButton("X");
        buildingPanel panel = new buildingPanel(button, 0);



*/


    }

}
