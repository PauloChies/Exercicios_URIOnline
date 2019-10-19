import java.io.IOException;
import java.util.Scanner; 

public class Main {
 
     public static void main(String[] args) {
		  Scanner scan = new Scanner(System.in);
		  String userInputA;
		  String userInputB;

		  int cases;
		  int x;
		  int y;
		  int tmp;
		  int sizeOfInputs;
		  int sizeOfInputA;
		  int sizeOfInputB;
		     
		  cases = scan.nextInt();
		     
		  for (int i = 0; i < cases; ++i) {
		      userInputA = scan.next();
		      userInputB = scan.next();
		      sizeOfInputs = userInputA.length() + userInputB.length();
		      sizeOfInputA = userInputA.length();
		      sizeOfInputB = userInputB.length();
		         
		      x = 0;
		      y = 0;
		      tmp = 0;
		         
		      for (int j = 0; j < sizeOfInputs; ++j) {       
		          if (tmp == 0) {
		              tmp = 1;
		              if (x != sizeOfInputA) {
		            	  char [] fValue = userInputA.toCharArray();
		            	  System.out.print(fValue[x]);
		                  x++;
		              }
		          }
		             if (tmp == 1) {
		                 tmp = 0;
		                 if (y != sizeOfInputB) {
		                	 char [] sValue = userInputB.toCharArray();
		                	 System.out.print(sValue[y]);
		                	 y++;
		                 }
		             }
		      	}
		         System.out.println();
		     }
		}
	}