package coreprograms.java;

import java.util.Scanner;

public class SwapTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int temp,a,b;
		System.out.println( "Enter the Two Numbers");

		Scanner sc = new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.println("Before Swapping "+ a+" "+b);  
		
		temp=a;
		a=b;
		b=temp;
		System.out.println("After Swapping "+ a+" "+b);
	}
}

