package coreprograms.java;
import java.util.Scanner;
public class AlphabetisVowelorConsonant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char ch;
		System.out.println("Enter any Characters");
		Scanner sc=new Scanner(System.in);
		ch=sc.next().charAt(0);

		if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
		{
			System.out.println("Character is Vowel");
		}
		else
		{
			System.out.println("Character is Consonant");
		}
	}
}


