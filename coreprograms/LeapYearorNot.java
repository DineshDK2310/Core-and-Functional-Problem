package coreprograms.java;
import java.util.Scanner;
public class LeapYearorNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a year");
		int year = sc.nextInt();

		if (year % 400 == 0) {
			System.out.println(year + " is a Leap year");
		} else if (year % 100 == 0) {
			System.out.println(year + " is not a Leap year");
		} else if (year % 4 == 0) {
			System.out.println(year + " is a Leap year");
		}else  {
			System.out.println(year + " is not a Leap year");
		}
	}


}


