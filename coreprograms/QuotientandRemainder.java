package coreprograms.java;

import java.util.Scanner;

public class QuotientandRemainder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b;
		System.out.println("Enter the Numbers");

		Scanner sc = new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		
		int quo = a/b;
		int rem = a%b;

		System.out.println("Quotient :"+quo);
		System.out.println("Remainder :"+rem);


	}

}
