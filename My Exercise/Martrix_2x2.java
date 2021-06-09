import java.util.Scanner; // Scanner is in the java.util package
import java.text.DecimalFormat;

public class Martrix_2x2 {
	public static void main(String[] args) {
		double a1,b1,c1,a2,b2,c2;
		double x,y;
		DecimalFormat decimalFormat = new DecimalFormat("#.##");
		Scanner input = new Scanner(System.in);  // Create scanner
		
		// Prompt the user to enter the variable
		System.out.println("Click the variable a1: ");
		a1 = input.nextDouble();
		System.out.println("Click the variable b1: ");
		b1 = input.nextDouble();
		System.out.println("Click the variable c1: ");
		c1 = input.nextDouble();
		System.out.println("Click the variable a2: ");
		a2 = input.nextDouble();
		System.out.println("Click the variable b2: ");
		b2 = input.nextDouble();
		System.out.println("Click the variable c2: ");
		c2 = input.nextDouble();
		
		// Enter 2 equations to the variable
		System.out.println("The 1st equation: " + a1 + "x + " + b1 + "y = " + c1);
		System.out.println("The 2nd equation: " + a2 + "x + " + b2 + "y = " + c2);
		
		x = (c1 * b2 - b1 * c2) / (a1 * b2 - b1 * a2);
		y = (a1 * c2 - c1 * a2) / (a1 * b2 - b1 * a2);
		double number = c1 - c2;
		if (a1 * b2 - b1 * a2 == 0 || a1 - a2 == 0 && b1 - b2 == 0 && c1 - c2 == number) {
			System.out.println("The equation has no solution!");
		} else if 
			(a1 - a2 == 0 && b1 - b2 == 0 && c1 - c2 == 0) {
			System.out.println("The equation has many solution!");
		}
			else {
			System.out.println("The equation has solution for x = " + decimalFormat.format(x));
			System.out.println("The equation has solution for y = " + decimalFormat.format(y));
			}
		}	
	}