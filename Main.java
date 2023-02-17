import java.awt.*;
import java.awt.event.*;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import javax.swing.*;

public class Main {

    public static int importedCookieAmount;

    public static int[] importedBuildingsBought;

    public static String userpassFile;
    
    static clickerGui frame;


    public static void main (String[]args) {
        Methods ms = new Methods();

        /*
       loginScreen login = new loginScreen(true);
        
        String userpass = login.getFileName();
        boolean userFound = ms.newFindUser(userpassFile);
        
        	while (!userFound) {
        		userFound = ms.newFindUser(userpassFile);
        		
        	}

        login.setVisible(false);
        
        login.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent e) {
            	System.out.print("e");
            	int[] a = {0,1,2,3,4,5};
            	frame = new clickerGui(1,a);
            }
        });
        	*/

        
        int[] a = {0,1,2,3,4,5};
    	frame = new clickerGui(1,a);
        
        frame.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent e) {
                importedCookieAmount = frame.getCpsAmount();
                importedBuildingsBought = frame.getBuildingsBought();

                userpassFile = loginScreen.getFileName();
                //ms.addToDoc(userpassFile,"" + importedCookieAmount);
            }
        });
        	
        
        System.out.println(loginScreen.getBuildingsBought());
        System.out.println(loginScreen.getCookieBalance());





    }

}
