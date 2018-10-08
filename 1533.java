import java.io.IOException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner; 

public class Main {
 
    public static void main(String[] args) throws IOException {

		Scanner read = new Scanner(System.in);
		int cases;
		int[] suspectDegree;
		int[] ordenedSuspectDegree;
		int suspect;
		int auxSuspect = 0;
		
		cases = read.nextInt();
		
		while ( cases != 0 ) {
			suspectDegree = new int[cases];
			ordenedSuspectDegree = new int[cases];

			for (int i = 0; i < cases; i++) {
				suspectDegree[i] = read.nextInt();
				ordenedSuspectDegree[i] = suspectDegree[i];
			}
			Arrays.sort(ordenedSuspectDegree);
			suspect = ordenedSuspectDegree[ordenedSuspectDegree.length -2];
			for ( int i = 0; i < cases; i++ ) {
				if (suspectDegree[i] == suspect ) {
					auxSuspect = i;
					break;
				}
			}
				System.out.println(auxSuspect + 1);
				cases = read.nextInt();
		}
	}
}