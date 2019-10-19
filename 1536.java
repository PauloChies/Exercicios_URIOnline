import java.io.IOException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Scanner;  

public class Main {
 
    public static void main(String[] args) throws NumberFormatException, IOException {
    		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    		PrintWriter out = new PrintWriter(System.out);
    		
    	        int cases = Integer.parseInt(in.readLine());
    	        int teamOne;
    	        int teamTwo;
    	        int matchOne, backOne, matchTwo, backTwo;
    	        String[] goals;
    	        while (cases-- > 0) {
    	            goals = in.readLine().split("\\sx\\s");
    	            matchOne = Integer.parseInt(goals[0]);
    	            backOne = Integer.parseInt(goals[1]);
    	            goals = in.readLine().split("\\sx\\s");
    	            matchTwo = Integer.parseInt(goals[1]);
    	            backTwo = Integer.parseInt(goals[0]);
    	            teamOne = matchOne + matchTwo;
    	            teamTwo = backOne + backTwo;
    	            if (teamOne > teamTwo || teamOne == teamTwo && backTwo > matchOne) {
    	                out.println("Time 1");
    	            } else if (teamOne < teamTwo|| teamOne == teamTwo && backTwo < matchOne) {
    	                out.println("Time 2");
    	            } else {
    	                out.println("Penaltis");
    	            }
    	        }
    	        out.close();
    	    }
		}