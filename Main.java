





































import java.awt.*;
import java.awt.event.*;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import javax.swing.*;

public class Main {

    public static int importedCookieAmount;

    public static int[] importedBuildingsBought;

    public static String userpassFile;


    public static void main (String[]args) {


        loginScreen login = new loginScreen(true);
        Methods ms = new Methods();

        int[] a = {0, 1, 2, 3, 4, 5};
        clickerGui frame = new clickerGui(1,a);
        frame.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent e) {
                importedCookieAmount = frame.getCpsAmount();
                importedBuildingsBought = frame.getBuildingsBought();

                userpassFile = loginScreen.getFileName();
                //ms.addToDoc(userpassFile,"" + importedCookieAmount);
            }
        });







    }

}
