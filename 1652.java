import java.io.IOException;
import java.util.Scanner; 

public class Main {
 
     static int zeroOneTwig(int remainingWeight, int weight[], int[] ornaments, int n) {
    	  if ( n == 0 || remainingWeight == 0 ) {
    		  return 0;
    	  }
    	  if ( weight[n - 1] > remainingWeight ) {
    		  return zeroOneTwig ( remainingWeight, weight, ornaments, n-1 );
    	  }
    	  else {
    		  return Math.max(ornaments[n - 1] + zeroOneTwig( remainingWeight - weight[n - 1], weight, ornaments, n-1),
    				  		  zeroOneTwig(remainingWeight, weight, ornaments, n - 1) );
    	  }
      }
	
	  public static void main(String[] args) {
  		Scanner read = new Scanner(System.in);
  		
  		int inputTwigs;
  		int quantityOfPackages;
  		int[] quantityOfOrnaments = new int[1000];
  		int[] weight = new int[1000];
  		int supportedWeight;
  		int twigNumber = 1;
  		
  		inputTwigs = read.nextInt();
  		
  		while ( inputTwigs-- > 0 ) {
  			quantityOfPackages = read.nextInt();
  			supportedWeight = read.nextInt();
  			
  			for ( int i = 0; i < quantityOfPackages; i ++ ) {
  				quantityOfOrnaments[i] = read.nextInt();
  				weight[i] = read.nextInt();
  			}
  			
  			System.out.println("Galho " +  (twigNumber++) +":\nNumero total de enfeites: " + zeroOneTwig(supportedWeight, weight, quantityOfOrnaments, quantityOfPackages));
  			System.out.println();
  	}
  }
}