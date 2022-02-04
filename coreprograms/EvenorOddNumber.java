package coreprograms.java;

import java.util.Scanner;

public class EvenorOddNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the Number");

		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();

		int rem = number%2;
		if(rem==0)
		{
			System.out.println("Even Number");
		}
		else if(rem==1)
		{
			System.out.println("Odd Number");
		}
	}
}

