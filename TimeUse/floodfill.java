package TimeUse;

//import java.util.Scanner;
//
//public class floodfill {
//	static int[][] maze;
//	static int visitOrder = 1;
//	static int sizeN;
//	static int sizeM;
//	static String[] input;
//	
//	
//	static void floodfill (int x, int y) {
//		if (maze[x][y] != 0) {
//			return;
//		}else {
//			maze[x][y] = visitOrder;
//			visitOrder++;
//		}
//		
//		if (x-1 >= 0 ) {
//			floodfill(x-1,y);
//		}
//		if (y-1 >= 0 ) {
//			floodfill(x,y-1);
//		}
//		if (y+1 < sizeM ) {
//			floodfill(x,y+1);
//		}
//		if (x+1 < sizeN ) {
//			floodfill(x+1,y);
//		}
//		
//		
//	}
//	
//	public static void main (String[]args) {
//		Scanner scanner = new Scanner(System.in);
//		int sizeN = scanner.nextInt();
//		int sizeM = scanner.nextInt();
//		maze = new int[sizeN][sizeM];
//		
//		for (int i = 0; i<sizeN; i++) {
//			for (int j = 0; j < sizeM; j++) {
//				maze[i][j] = scanner.nextInt();
//				
//				
//			}
//			
//		}
//		floodfill(0,0);
//		for (int i1 = 0; i1<sizeN; i1++) {
//			for (int j1 = 0; j1 < sizeM; j1++) {
//				if (i1 == 0 && j1 == 0) {
//					System.out.print("1 ");
//					continue;
//				}else if (maze[i1][j1] == 1) {
//					System.out.print("0 ");
//				}else {
//					System.out.print(maze[i1][j1] + " ");
//				}
//				
//				
//			}
//			System.out.println();
//		}
//		
//		
//	}
//	
//	
//	
//	
//	
//	
//}




