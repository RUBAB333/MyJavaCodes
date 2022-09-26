package assignement2;

import java.util.Scanner;

public class Vowel_constant {

	public static void main(String[] args) {
		//by using logical operator
		System.out.println("enter the character");
		Scanner kb = new Scanner(System.in);
		char ch = kb.next().charAt(5);
		System.out.println(ch);
		if((ch=='a')||(ch=='A')||(ch=='e')||(ch=='E')||(ch=='i')||(ch=='I')
				    ||(ch=='o')||(ch=='O')||(ch=='u')||(ch=='U'))
		{
			System.out.println("vowel");
		}
		else
		{
			System.out.println("consonant");
		}

		//using if else operator for capital letters
		char  x = kb.next().charAt(0) ;
		if(x=='A')
		{
			System.out.println("character is vowel");
		}
		else if(x=='E')
		{
			System.out.println("character is vowel");
		}
		else if(x=='I')
		{
			System.out.println("character is vowel");
		}
		else if(x=='O')
		{
			System.out.println("character is vowel");
		}
		else if(x=='U')
		{
			System.out.println("character is vowel");
		}
		else
		{
			System.out.println("character is consonent");
		}
		
	}

}
