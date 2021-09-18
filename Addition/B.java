package Addition;

import java.util.Scanner;

public class B {
	public void AddNumberNonStatic() {
		
		double n1 = 34.5;
		double n2 = 45.5;
		double s = n1 + n2;
		System.out.println("sum is" + s);
	}
	
	public static void AddTwoNumbersStatic() {
		Scanner scan = new Scanner(System.in);
		int num1 = scan.nextInt();
		System.out.println("Enter the second number");
		int num2 = scan.nextInt();
		
		int sum = num1 + num2;
		System.out.println("The sum of two numbers is" + sum);
		
		
		
	}

}
