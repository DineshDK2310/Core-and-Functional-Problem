package functionalproblems;

import java.util.Scanner;

public class Distance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x,y;
		double distance;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the X value : ");
		x=sc.nextInt();
		System.out.println("Enter the y value : ");
		y=sc.nextInt();

		distance=Math.sqrt( Math.pow(x, 2) + Math.pow(y, 2));
		System.out.println("Distance between x and y cordinates is : " + distance);

	}

}
