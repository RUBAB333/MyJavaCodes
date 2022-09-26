package assignment2;

import java.util.Scanner;

public class Vowel_using_logic {

	public static void main(String[] args) {
		System.out.println("enter the character");
		Scanner keyboard = new Scanner(System.in);
		char x = keyboard.next().charAt(0);
		if((x=='a'||x=='A') || (x=='e'||x=='E') || (x=='i'||x=='I') ||
				(x=='o'||x=='O') || (x=='u'||x=='U'))
		{
			System.out.println("character is Vowel");
		}
		else
		{
			System.out.println("character is consonent");
		}
	}

}
