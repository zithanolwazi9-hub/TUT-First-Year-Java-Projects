import java.util.Scanner;
import java.lang.Math;
import java.text.DecimalFormat;
import java.util.Random;


public class StudentMarkCalculator
{
	public static void main(String[] args)
	{
		
	Scanner input = new Scanner(System.in);
	DecimalFormat df = new DecimalFormat("0.00");
	Random rand = new Random();
	int randNum = rand.nextInt(11)+1;
	
	
	System.out.print("Enter your student name: ");
	String studentName = input.nextLine();
	System.out.print("Enter your test mark: ");
	double testMark = input.nextDouble();
	System.out.print("Enter your assigment mark: ");
	double assigMark = input.nextDouble();
	
	double average = Math.round((testMark + assigMark)/2);
	double finalMark = average + randNum;
	
	System.out.println("Average Mark: " + average);
	System.out.println("Rounded Average Mark: " + df.format(average));
	System.out.println("Bonous Mark: " + randNum);
	System.out.println("Final Average Mark: " + finalMark);


					input.close();

	
	}
}