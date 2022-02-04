package coreprograms.java;

import java.util.Scanner;

public class FindLargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c;
		System.out.println("Enter the Three Numbers");
		Scanner sc = new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		
		if(a>b && a>c)
		{
			System.out.println("a is the Largest Number "+a);
		}
		else if(b>a && b>c)
		{
			System.out.println("b is the Largest Number "+b);
		}
		else
		{
			System.out.println("c is the Largest Number "+c);
		}

	}

}
