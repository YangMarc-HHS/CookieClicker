import java.awt.*;
import java.awt.event.*;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import javax.swing.*;

public class Main {

    public static int importedCookieAmount;

    public static int[] importedBuildingsBought;

    public static String userpassFile;
    public static String userpass;
    
    static clickerGui frame;
    static String[] importedData = null;


    public static void main (String[]args) {
        Methods ms = new Methods();



        loginScreen login = new loginScreen(true) {
            @Override
            public void dispose() {

                userpassFile = loginScreen.getFileName() + ".txt";

                try {

                    importedData = ms.saveData(ms.findAmountOfLines(userpassFile), userpassFile);
                    importedCookieAmount = Integer.parseInt(importedData[2]);
                    for (int i = 0; i<6; i++) {
                        importedBuildingsBought[i] =Integer.parseInt(importedData[i+3]);
                    }
                    System.out.println("de");

                } catch (FileNotFoundException ex) {
                    ex.printStackTrace();
                }


                frame = new clickerGui(importedCookieAmount,importedBuildingsBought);
                frame.addWindowListener(new java.awt.event.WindowAdapter() {
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        importedCookieAmount = frame.getCpsAmount();
                        importedBuildingsBought = frame.getBuildingsBought();

                        userpassFile = loginScreen.getFileName();
                        try {
                            FileWriter myWriter = new FileWriter(userpassFile, false);
                            myWriter.write(userpassFile.replaceAll(".txt", "") + "\r\n");
                            myWriter.write(importedBuildingsBought + "\r\n");
                            for (int i = 0; i < 6; i++) {
                                myWriter.write(importedBuildingsBought[i] + "\r\n");
                            }

                        }catch (IOException eX) {
                            eX.printStackTrace();
                        }

                        System.out.println(loginScreen.getBuildingsBought());
                        System.out.println(loginScreen.getCookieBalance());

                        //ms.addToDoc(userpassFile,"" + importedCookieAmount);
                    }
                });

                super.dispose();
            }
        };


//        boolean userFound = ms.newFindUser(userpassFile);
//
//        	while (!userFound) {
//                userpass = login.getFileName();
//
//        		userFound = ms.newFindUser(userpass + ".txt");
//
//        	}
//
//        login.setVisible(false);




//        login.addWindowListener(new java.awt.event.WindowAdapter() {
//            public void windowClosed(java.awt.event.WindowEvent e) {
//
//                userpassFile = loginScreen.getFileName() + ".txt";
//
//                try {
//
//                    importedData = ms.saveData(ms.findAmountOfLines(userpassFile), userpassFile);
//                    importedCookieAmount = Integer.parseInt(importedData[2]);
//                    for (int i = 0; i<6; i++) {
//                        importedBuildingsBought[i] =Integer.parseInt(importedData[i+3]);
//                    }
//
//
//                } catch (FileNotFoundException ex) {
//                    ex.printStackTrace();
//                }
//            }
//        });


        


        

//        userpassFile = loginScreen.getFileName() + ".txt";
//
//        importedCookieAmount = loginScreen.getCookieBalance();
//        importedBuildingsBought = loginScreen.getBuildingsBought();









    }

}
