package functionalproblems;

import java.util.Scanner;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]=new int[2][2];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Array Elements:");
		for (int i=0; i<2; i++) 
		{
			for (int j=0; j<2; j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("Matrix: \n");
		for (int i=0; i<2; i++) 
		{
			for (int j=0; j<2; j++)
			{
				System.out.println(a[i][j]+" ");
			}
			System.out.println("\n");
		}
	}
}


