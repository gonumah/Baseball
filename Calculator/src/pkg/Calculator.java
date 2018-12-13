package pkg;

import java.util.Scanner;

public class Calculator {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);
		
		System.out.print("Enter player's name: ");
		input.next();
		
		System.out.print("Enter AB: ");
		int AB = input.nextInt();

		System.out.print("Enter H: ");
		int H = input.nextInt();
		
		System.out.print("Enter 2B: ");
		int DoubleB = input.nextInt();
				
		System.out.print("Enter 3B: ");
		int TripleB = input.nextInt();
		
		System.out.print("Enter HR: ");
		int HR = input.nextInt();
		
		System.out.print("Enter R: ");
		input.nextInt();
		
		System.out.print("Enter BB: ");
		int BB = input.nextInt();
		
		short BA = (short) (H/AB);
		short OBP = (short) ((H+BB)/(AB+BB));
		short SLG = (short) (H+DoubleB+2*TripleB+3*HR);
		short OBS = (short) (OBP + SLG);
		short TB = (short) (H+2*DoubleB+3*TripleB+4*HR);
		
		System.out.printf("BA is: %d%n", BA);
		System.out.printf("OBP is: %d%n", OBP);
		System.out.printf("SLG is: %d%n", SLG);
		System.out.printf("OBS is: %d%n", OBS);
		System.out.printf("TB is: %d%n", TB);
		
	}
	
}	
	
	
