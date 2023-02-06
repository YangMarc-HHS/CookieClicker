import java.io.FileNotFoundException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;
import java.io.*;


public class Methods {
    public boolean newFindUser(String userpass) {
        userpass = userpass.replaceAll("//s+", "");
        try {
            return Files.readAllLines(Path.of("LoginDetails.txt")).contains(userpass);
        } catch (IOException e) {
            System.out.println("IOException");
            return false;
        }
    }

    public boolean addToDoc(String fileNameWithTxt, String stringGoingToAddedToDoc) {
        PrintWriter xWriter = null;

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

    public void makeFile(String fileNameWithTxt) {
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
        } catch (IOException e) {
            System.out.println("IOException");
        }

    }
    public String userpassFile (String user, String pass) {

        return user + pass + ".txt";
    }


}


