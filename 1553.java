import java.io.IOException;
import java.util.Scanner;
import java.util.Arrays;

public class Main {
 
    public static void main(String[] args) throws IOException {

		Scanner read = new Scanner(System.in);
		
		int inputQuestions;
		int frequency;
		int[] numbers = new int[110]; 
		int userInput;
		int counter = 0;
		
		inputQuestions = read.nextInt();
		frequency = read.nextInt();
		Arrays.fill(numbers, 0);
		
		while ( inputQuestions != 0 || frequency != 0 ) {
			for ( int i = 0; i < inputQuestions; i++ ) {
				userInput = read.nextInt();
				numbers[userInput]++;
			}
			for ( int i = 0; i < numbers.length; i++ ) {
				if ( numbers[i] >= frequency ) {
					counter ++;
				}
			}
			System.out.println(counter);
			counter = 0;
			inputQuestions = read.nextInt();
			frequency = read.nextInt();
			Arrays.fill(numbers, 0);
		}
	}
}