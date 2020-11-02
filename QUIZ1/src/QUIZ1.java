import java.util.Scanner;

public class QUIZ1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter your height(feet):");
		int feet = scan.nextInt();
		System.out.print("Enter your height(inches):");
		int inches = scan.nextInt();
		
		int inch = feet*12+inches;
		int male=50+(6*(inch-60));
		int female=40+(5*(inch-60));
		
		System.out.println("The the ideal weight for a male : "+male+"kg");
		System.out.println("The the ideal weight for a female : "+female+"kg");
		
		
		
		
		
	}

}
