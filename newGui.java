import javax.swing.*;
import java.awt.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Scanner;

public class newGui {
    private int cookieAmount = 0;
    private int buildingsBought[];
    private int buildingPrice[];
    private int cpsAmount;
    public newGui () {
        //final long[] cookieAmount = {0};

        //final AtomicInteger[] cookieAmount = {new AtomicInteger()};
        //final AtomicInteger[] buildingsBought = {new AtomicInteger()};
        //final AtomicInteger[] buildingPrice1 = {new AtomicInteger()};
        //final AtomicInteger[] buildingPrice2 = {new AtomicInteger()};
        //final AtomicInteger[] buildingPrice3 = {new AtomicInteger()};
        //final AtomicInteger[] buildingPrice4 = {new AtomicInteger()};
        //final AtomicInteger[] buildingPrice5 = {new AtomicInteger()};
        //final AtomicInteger[] buildingPrice6 = {new AtomicInteger()};
        //final AtomicInteger[] cpsAmount = {new AtomicInteger()};

        buildingPrice = new int[6];
        buildingsBought = new int[6];
        for (int i = 0; i < 5; i++) {
            buildingsBought[i] = 0;
        }
        int cookieAmountX = 0;
        buildingPrice[0] = 10;
        buildingPrice[1] = 110;
        buildingPrice[2] = 1200;
        buildingPrice[3] = 13000;
        buildingPrice[4] = 140000;
        buildingPrice[5] = 1500000;







        otuCookieAmountDisplay cookieAmountDisplay = new otuCookieAmountDisplay(cookieAmount);

        otuUsernameDisplay usernameDisplay = new otuUsernameDisplay();
        otuCpsDisplay cpsDisplay = new otuCpsDisplay(cpsAmount);

        mtuBuildingButton building0 = new mtuBuildingButton("Building 0", 700,100,300,75);
        mtuBuildingButton building1 = new mtuBuildingButton("Building 1", 700,200,300,75);
        mtuBuildingButton building2 = new mtuBuildingButton("Building 2", 700,300,300,75);
        mtuBuildingButton building3 = new mtuBuildingButton("Building 3", 700,400,300,75);
        mtuBuildingButton building4 = new mtuBuildingButton("Building 4", 700,500,300,75);
        mtuBuildingButton building5 = new mtuBuildingButton("Building 5", 700,600,300,75);

        mtuBuildingBought bought0 = new mtuBuildingBought("0",1050,100,100,75);
        mtuBuildingBought bought1 = new mtuBuildingBought("0",1050,200,100,75);
        mtuBuildingBought bought2 = new mtuBuildingBought("0",1050,300,100,75);
        mtuBuildingBought bought3 = new mtuBuildingBought("0",1050,400,100,75);
        mtuBuildingBought bought4 = new mtuBuildingBought("0",1050,500,100,75);
        mtuBuildingBought bought5 = new mtuBuildingBought("0",1050,600,100,75);

        mtuBuildingCost cost0 = new mtuBuildingCost("10", 700,175,300,20);
        mtuBuildingCost cost1 = new mtuBuildingCost("110", 700,275,300,20);
        mtuBuildingCost cost2 = new mtuBuildingCost("1200", 700,375,300,20);
        mtuBuildingCost cost3 = new mtuBuildingCost("13000", 700,475,300,20);
        mtuBuildingCost cost4 = new mtuBuildingCost("140000", 700,575,300,20);
        mtuBuildingCost cost5 = new mtuBuildingCost("1500000", 700,675,300,20);



        JButton x10 = new JButton();
        x10.setText("x10");
        x10.setBounds(700,700,300,75);
        x10.addActionListener(e -> {

            building4.setText("Building 4 ");
        });


        java.util.Timer autoRunner = new java.util.Timer();
        autoRunner.scheduleAtFixedRate(new TimerTask() {
            public void run() {

                cookieAmount = cookieAmount + cpsAmount;

                cpsDisplay.setText("CPS: " + cpsAmount);
                cookieAmountDisplay.setText("Cookie Amount: " + cookieAmount);
        }
}, 0, 2000);




        CircleButton cookieImage = new CircleButton("Insert Cookie Image");
        cookieImage.setBounds(80, 325, 350,350);
        cookieImage.setFont(new Font("Serif", Font.PLAIN, 30));

        cookieImage.addActionListener(new ActionListener(){

            public void actionPerformed(ActionEvent e) {
                cookieAmount+=1;
                cookieAmountDisplay.setText("Cookie Amount: " + cookieAmount);
            }


            //cookieAmountX =  cookieAmount[0].get();
        });



        building0.addActionListener(e -> {

            if (cookieAmount>= buildingPrice[0]) {

                cookieAmount = cookieAmount-buildingPrice[0];

                buildingsBought[0] += 1 ;
                bought0.setText(""+ buildingsBought[0]);

                cpsAmount+=1;
                buildingPrice[0]= buildingPrice[0] * 23/20;
                cost0.setText(buildingPrice[0] + "");
            }
            cookieAmountDisplay.setText("Cookie Amount: " + cookieAmount);
            cpsDisplay.setText("CPS: " + cpsAmount);
        });

        building1.addActionListener(e -> {

            if (cookieAmount>= buildingPrice[1]) {

                cookieAmount = cookieAmount-buildingPrice[1];

                buildingsBought[1]+=1;
                bought1.setText("" + buildingsBought[1]);

                cpsAmount+=10;
                buildingPrice[1]= buildingPrice[1] * 23/20;
                cost1.setText(buildingPrice[1] + "");
            }
            cookieAmountDisplay.setText("Cookie Amount: " + cookieAmount);
            cpsDisplay.setText("CPS: " + cpsAmount);
        });

        building2.addActionListener(e -> {

            if (cookieAmount>= buildingPrice[2]) {

                cookieAmount = cookieAmount-buildingPrice[2];

                buildingsBought[2]+=1;
                bought2.setText("" + buildingsBought[2]);

                cpsAmount+=100;
                buildingPrice[2]= buildingPrice[2] * 23/20;
                cost2.setText(buildingPrice[2] + "");
            }
            cookieAmountDisplay.setText("Cookie Amount: " + cookieAmount);
            cpsDisplay.setText("CPS: " + cpsAmount);
        });

        building3.addActionListener(e -> {

            if (cookieAmount>= buildingPrice[3]) {

                cookieAmount = cookieAmount-buildingPrice[3];

                buildingsBought[3]+=1;
                bought3.setText("" + buildingsBought[3]);

                cpsAmount+=1000;
                buildingPrice[3]= buildingPrice[3] * 23/20;
                cost3.setText(buildingPrice[3] + "");
            }
            cookieAmountDisplay.setText("Cookie Amount: " + cookieAmount);
            cpsDisplay.setText("CPS: " + cpsAmount);
        });

        building4.addActionListener(e -> {
        if (building4.getText() == "Building 4") {
            if (cookieAmount>= buildingPrice[4]) {

                cookieAmount = cookieAmount-buildingPrice[4];

                buildingsBought[4]+=1;

                cpsAmount+=10000;
                buildingPrice[4]= buildingPrice[4] * 23/20;
                cost4.setText(buildingPrice[4] + "");
            }
        }else if (building4.getText() == "Building 4 ") {
            if (cookieAmount>= buildingPrice[4]*10) {

                cookieAmount -=buildingPrice[4]*10;

                buildingsBought[4]+=10;


                cpsAmount+=10000*10;
                buildingPrice[4]= buildingPrice[4] * 23/20;
                cost4.setText(buildingPrice[4] + "");
            }
        }
            bought4.setText("" + buildingsBought[4]);
            cookieAmountDisplay.setText("Cookie Amount: " + cookieAmount);
            cpsDisplay.setText("CPS: " + cpsAmount);
        });
        building5.addActionListener(e -> {

            if (cookieAmount>= buildingPrice[5]) {

                cookieAmount = cookieAmount-buildingPrice[5];

                buildingsBought[5]+=1;
                bought5.setText("" + buildingsBought[5]);

                cpsAmount+=100000;
                buildingPrice[5]= buildingPrice[5] * 23/20;
                cost5.setText(buildingPrice[5] + "");
            }
            cookieAmountDisplay.setText("Cookie Amount: " + cookieAmount);
            cpsDisplay.setText("CPS: " + cpsAmount);
        });




        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setBounds(190,60,1200,850);
        frame.setVisible(true);
        frame.add(cookieImage);

        frame.add(building0);
        frame.add(building1);
        frame.add(building2);
        frame.add(building3);
        frame.add(building4);
        frame.add(building5);


        frame.add(bought0);
        frame.add(bought1);
        frame.add(bought2);
        frame.add(bought3);
        frame.add(bought4);
        frame.add(bought5);

        frame.add(cost0);
        frame.add(cost1);
        frame.add(cost2);
        frame.add(cost3);
        frame.add(cost4);
        frame.add(cost5);



        frame.add(usernameDisplay);
        frame.add(cookieAmountDisplay);
        frame.add(cpsDisplay);
        frame.add(x10);


        String hi;
        do {
            Scanner hello = new Scanner(System.in);
            hi = hello.next();

            switch (hi) {
                case "addMoney":
                    cookieAmount = 999999999;
                    break;
                case "details":
                    System.out.print(Arrays.toString(buildingsBought));
                    break;
                case "divideHalf":
                    cookieAmount/=10;
            }


        }while (!hi.equals("end"));







    }
}