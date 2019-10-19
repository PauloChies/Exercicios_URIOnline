import java.io.IOException;
import java.util.Scanner;
import java.util.Arrays;

public class Main {
 
    public static void main(String[] args) {
	  Scanner read = new Scanner(System.in);
	  
	  int balls[] = new int[1005];
	  int markedBalls[] = new int[1005];
	  int numBalls = 0;
	  int number = 0;
	  
	  Boolean flag;
	  
	  number = read.nextInt();
	  numBalls = read.nextInt();
	  
	  
	  while (number != 0 || numBalls != 0) { 
		  Arrays.fill(markedBalls, 0);
		  flag = true;
		  
		  for ( int i = 0; i < numBalls; i++ ) { 
			  balls[i] = read.nextInt();
		  }
		  
		  for ( int i = 0; i < numBalls; i++ ) {
			  for ( int j = 0; j < numBalls; j++) {
				  markedBalls[Math.abs(balls[i] - balls[j])] = 1;
			  }
		  }
		  
		  for ( int i = 0; i < ( number + 1 ); i++ ) {
			  if (markedBalls[i] == 0) {
				  flag = false;
			  }
		  }
		  System.out.println(flag ? "Y" : "N");
		  number = read.nextInt();
		  numBalls = read.nextInt();
	  		}
	  }
}  