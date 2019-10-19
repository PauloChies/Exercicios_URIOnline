import java.io.IOException;
import java.util.Scanner;
import java.text.DecimalFormat; 

public class Main {
 
    public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.000");
		
		int cases;
		double students;
		double studentsGrade;
		double sumOfGrades = 0;
		double[] gradeArray = new double[1000];
		int i;
		double averageOfGrades = 0;
		double studentAbove = 0;
		double percentageOfStudents=0;
		
		cases = read.nextInt();
		while ( cases > 0 ) {
			
			students = read.nextInt();
			averageOfGrades = 0;
			sumOfGrades = 0;
			studentAbove = 0;
			percentageOfStudents = 0;
			
			for( i = 0; i < students ; i++ ) {
				gradeArray[i] = read.nextInt();
				sumOfGrades += gradeArray[i];
			}	
						
				averageOfGrades = sumOfGrades / students;
						
				for( i = 0; i < students ; i++ ) {
					if ( gradeArray[i] > averageOfGrades ) {
						studentAbove++;
					}
				}
				percentageOfStudents = ( (double)studentAbove * 100 ) / students;
				System.out.println(df.format(percentageOfStudents) + "%");
				
			    cases --;
		}
	}
}