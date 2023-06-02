package TimeUse;
import java.util.Scanner;

public class mazeGoCrazy {
	
	
	public static void main (String[]args) {
		Scanner scanner = new Scanner(System.in);
		int[][] maze;
		String[] test;
		int sizeX = scanner.nextInt();
		int sizeY = scanner.nextInt();
		maze = new int[sizeX][sizeY];
		test = new String[sizeX];
		
		for (int i = 0; i < sizeX; i++) {
			test[i] = scanner.nextLine();
		}
		
		
		
	}

}
