package Bacis_test_week1;

import java.util.Scanner;

public class Vowel_consonant {

	public static void main(String[] args) {
		System.out.println("enter the character");
		Scanner kb=new Scanner(System.in);
		char ch=kb.next().charAt(0);
		String ans =(ch=='a'||ch=='A'||ch=='e'||ch=='E'||
				ch=='I'||ch=='i'||ch=='o'||ch=='O'||ch=='u'||ch=='U')?
						" is vowel":" is consonant";
		System.out.println(ch+ans);

	}

}
