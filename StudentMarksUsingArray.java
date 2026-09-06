import java.util.Scanner;

public class StudentMarksArray
{
	public static int getHighest(int[] marks){
		
		//variable
		int highestMarks = marks[0];
		
		for(int i = 0; i < marks.length; i++){
			
			if(marks[i] > highestMarks){
				highestMarks = marks[i];
			}
			
		}
		return highestMarks;
	}
	
	public static int getLowest(int[] marks){
		
		//variable
		int lowestMarks = marks[0];
		
		for(int i = 0; i < marks.length; i++){
			
			if(marks[i] < lowestMarks){
				lowestMarks = marks[i];
			}
			
		}
		return lowestMarks;
	}
	
	public static double calculateAverage(int[] marks){
		
		// variables
			int countMarks = 0;
			int total = 0;
			
			for(int i = 0 ; i < marks.length;i++){
				
				total+=marks[i];
				countMarks++;
			}
			
		double average = (double) total / countMarks;
		
		return average;
	}
	
	public static void main(String[] args){
		
	Scanner input = new Scanner(System.in);		
		//variables
		int[] marks = new int[5];
	
		//userinput
		for(int i = 0 ; i < marks.length;i++){
			
			System.out.print("Enter your marks: ");
			marks[i] = input.nextInt();	
		}
		
		//call methods
		int highestMarks = getHighest(marks);
		int lowestMarks = getLowest(marks);
		double average = calculateAverage(marks);
		
		//display
		System.out.println("Average marks: " + average);
		System.out.println("Highest marks: " + highestMarks);
		System.out.println("Lowest marks: " + lowestMarks);
		

	}
	
}
