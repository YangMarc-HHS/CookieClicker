import java.io.FileNotFoundException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
import java.io.*;


public class Methods {
	
	public String getCookieAmountFromFile (String userpass) {
		String cookieAmount = "";
		
		try {
    		userpass = userpass.replaceAll("//s+", "");
            cookieAmount = Files.readAllLines(Paths.get("file.txt")).get(1);
    	}catch (NullPointerException e) {
    		e.printStackTrace();
    	}catch (IOException e) {
           e.printStackTrace();

        }
		
		return cookieAmount;
        
	}
	
	public String[] getBuildingsBoughtFromFile (String userpass) {
		String[] buildingsBought = null;
		
		
		try {
    		userpass = userpass.replaceAll("//s+", "");
    		for (int i = 0; i<6;i++) {
    			buildingsBought[i]=Files.readAllLines(Paths.get("file.txt")).get(i+2);
    		}
    		
    	}catch (NullPointerException e) {
    		e.printStackTrace();
    	}catch (IOException e) {
           e.printStackTrace();

        }
		
		return buildingsBought;
        
	}
	
	
    public boolean newFindUser(String userpass) {
    	try {
    		userpass = userpass.replaceAll("//s+", "");
    	}catch (NullPointerException e) {
    		
    	}
        
        
        try {
            return Files.readAllLines(Path.of("txtFiles/LoginDetails.txt")).contains(userpass);
        } catch (IOException e) {
            System.out.println("IOException");
            return false;
        }
    }



    public boolean addToDoc(String fileNameWithTxt, String stringGoingToAddedToDoc) {

        PrintWriter xWriter = null;
        boolean result = true;
        try {
            xWriter = new PrintWriter(fileNameWithTxt);
            xWriter.print(stringGoingToAddedToDoc + "\r\n");
            return true;
        } catch (IOException e) {
            System.out.print("IOException");
            return false;

        } finally {
            xWriter.close();
        }

    }
    //takes in file and string, and writes string to file

    public int findAmountOfLines(String fileNameWithTxt) throws FileNotFoundException {
        File file = new File(fileNameWithTxt);
        int lineAmount = 0;
        Scanner lineCounter = new Scanner(file);
        while (lineCounter.hasNextLine()) {
            lineCounter.nextLine();
            lineAmount++;
        }
        return lineAmount;
    }

    //finds the amount of lines in a file
    public int rollTen(int pity, int pity2) {
        int rolls[];
        int rollNum;
        for (int i = 0; i < 10; i++) {
            if (pity < 75) {
                rollNum = (int) ((double) Math.random() * 101);

            }
        }
        return 10;
    }

    //ten roll - not finished yet
    public String[] saveData(int lineAmount, String fileNameWithTxt) throws FileNotFoundException {


        File file = new File(fileNameWithTxt);
        //lineAmount = lineAmount - 1;
        String lineInfo = ".";
        String[] exportedData = new String[lineAmount];
        Scanner lineReader = new Scanner(file);
        for (int i = 0; i < lineAmount; i++) {
            lineInfo = lineReader.nextLine();
            exportedData[i] = lineInfo;
        }
        return exportedData;
    }
    //saves everything in the file as a string array

    public void makeFile (String fileNameWithTxt) {
        File newUserFile = new File(fileNameWithTxt);


        try {

            if (newUserFile.exists()) {
                System.out.println("Error: Account Already Made:");

            } else {
                newUserFile.createNewFile();
                System.out.println("File created");
                FileWriter newUserFileWriter = new FileWriter(fileNameWithTxt);
                newUserFileWriter.write("userpass: " + fileNameWithTxt);
            }
        }   catch (IOException e) {
            System.out.println("IOException");
        }

    }
    //makes file once given file name

    public String userpassFile (String user, String pass) {

        return user + pass + ".txt";
    }


    public void exportCookieAmount (String fileName, int importedCookieAmount) {
        try {
            PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter(fileName)));
        }catch (IOException e ) {
            System.out.println("xd");
        }


    }

    public int[] getIntData(int lineAmount, String fileNameWithTxt) throws FileNotFoundException {


        File file = new File(fileNameWithTxt);
        //lineAmount = lineAmount - 1;
        String lineInfo = ".";
        int[] exportedData = new int[lineAmount];
        Scanner lineReader = new Scanner(file);
        for (int i = 0; i < lineAmount; i++) {
            lineInfo = lineReader.nextLine();
            exportedData[i] = Integer.parseInt(lineInfo);
        }
        return exportedData;
    }
    //sa


}

