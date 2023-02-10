import javax.swing.*;
import java.awt.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Scanner;
import java.io.*;
import java.util.Arrays;
import java.util.Scanner;
import java.io.IOException;

public class loginScreen extends JFrame{
	String username = "";
	String password = "";  
	File file = new File("LoginDetails.txt");
    Methods method = new Methods();
    String loginChoice;
    String userpass;
    String userpassFile;
    int lineAmountLD;
    File userFile;
    String[] fileInfo = {"a", "b"};
    int numOfLines;


	
	public loginScreen (boolean visible) {

	    try {
	        if (file.exists()) {
	            System.out.println("File already exists - " + file.getName());
	        } else {
	            file.createNewFile();
	            System.out.println("File created");
	        }
	    } catch (IOException e) {
	        System.out.println("IOException");
	    }
	    
	    try {
            numOfLines = method.findAmountOfLines("LoginDetails.txt");
            //finds number of lines in Logindetails

            String[] importedData = method.saveData(numOfLines, "LoginDetails.txt");
            //saves all lines in logindetails

            System.out.println(Arrays.toString(importedData));
            //prints out all information in logindetails


        } catch (FileNotFoundException e) {
            System.out.print("FileNotFoundException");
        } //finds and saves and data in login details
	    
	    
		JTextField usernameField = new JTextField();
		usernameField.setVisible(true);
		usernameField.setBounds(300,0,300,50);

		
		JTextField passwordField = new JTextField();
		passwordField.setVisible(true);
		passwordField.setBounds(300,50,300,50);
		
		JLabel usernameLabel = new JLabel();
		usernameLabel.setVisible(true);
		usernameLabel.setBounds(0,0,300,50);
		usernameLabel.setText("Username:	");
		
		JLabel passwordLabel = new JLabel();
		passwordLabel.setVisible(true);
		passwordLabel.setBounds(0,50,300,50);
		passwordLabel.setText("Password:	");
		
		JButton loginButton = new JButton();
		loginButton.setBounds(200,200,200,25);
		loginButton.setVisible(true);
		loginButton.setText("Login");
		
		JButton newAccountButton = new JButton();
		newAccountButton.setBounds(200,250,200,25);
		newAccountButton.setVisible(true);
		newAccountButton.setText("New Account");
		
		newAccountButton.addActionListener(e -> {


    		username = usernameField.getText();
    		password = passwordField.getText();
    	
            username = username.toLowerCase();
            
            
            username = username.replaceAll("\\s", "");
            password = password.replaceAll("\\s", "");

            userpass = username + password;
            userpassFile = userpass + ".txt";

            try {
                FileWriter myWriter = new FileWriter("LoginDetails.txt", true);
                myWriter.close();


            } catch (IOException ecd) {
                System.out.println("IOException");
            }
            method.addToDoc("LoginDetails.txt", userpass);

            method.addToDoc(userpassFile, "userpass: " + userpass);
			System.out.println("account made");
			
		});
		
		JLabel problems = new JLabel();
		problems.setBounds(250,300 ,100,25);
		problems.setVisible(true);
		problems.setText("");
		
		loginButton.addActionListener(e -> {
			
		username = usernameField.getText();
		password = passwordField.getText();

		username = username.toLowerCase();
		username = username.replaceAll("\\s", "");
        password = password.replaceAll("\\s", "");
        
        userpass = username + password;
        userpassFile = userpass + ".txt";
        userpass = username + password;
        userpassFile = userpass + ".txt";


        userFile = new File(userpassFile);
        System.out.println("Account Found: " + method.newFindUser(userpass));


        try {
            lineAmountLD = method.findAmountOfLines(userpassFile);
            fileInfo = method.saveData(lineAmountLD, userpassFile);

        } catch (FileNotFoundException exp) {
            try {
                userFile.createNewFile();
                method.addToDoc(userpassFile, "Username:" + username);
                method.addToDoc(userpassFile, "Password:" + password);
                lineAmountLD = method.findAmountOfLines(userpassFile);
                fileInfo = method.saveData(lineAmountLD, userpassFile);

            } catch (IOException ex) {
                System.out.print("IOException");
            }
			
		}
        });
		

	        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        this.setLayout(null);
	        this.setBounds(190,60,600,425);
	        this.setVisible(visible);
	        
	        
	        this.add(usernameField);
	        this.add(passwordField);
	        this.add(usernameLabel);
	        this.add(passwordLabel);
	        
	        this.add(loginButton);
	        this.add(problems);
	        this.add(newAccountButton);

	        
	}
}
