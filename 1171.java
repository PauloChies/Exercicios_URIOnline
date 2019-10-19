import java.io.IOException;
import java.util.Scanner;
import java.util.Arrays;

public class Main {

     public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		int cases;
		int i;
		int sArray[] = new int[2001];
		int counter = 0;
		int inputNumber;
		
		
		Arrays.fill(sArray, 0);
		
		cases = read.nextInt();
		
		while ( cases > 0 ) {
			inputNumber = read.nextInt();
			sArray[inputNumber]++;
			cases --;
		}
		
		for( i = 0; i < 2001; i++ ) {
			if ( sArray[i] != 0 ) {
				System.out.println(i + " aparece " + sArray[i] + " vez(es)" );
			}
		}
	}
}