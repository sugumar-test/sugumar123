package PractProg;

import java.util.Scanner;

public class ArmstrongNumber {
	public static void checkNumberISArmstrong() {
		int a, n, i=0, j =0;
		Scanner input = new Scanner(System.in);		
		System.out.println("Enter any Number");//153,370,371,407,its only find 3 digits ..1634
		n = input.nextInt();
		System.out.println("Given Number is " +n);
		a=n;
		while (a>0) {
			i=a%10;
			j=j+(i*i*i);
			a=a/10;
		}
		if (n==j) {
			System.out.println("Given Number is Armstrong Number");
		}
			else {
				System.out.println("Given Number is Not Armstrong Number");
		}
	}
	public static void main(String[] args) {
	
		ArmstrongNumber num = new ArmstrongNumber();
		num.checkNumberISArmstrong();
	}

}
