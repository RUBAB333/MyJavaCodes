package Bacis_test_week1;

import java.util.Scanner;

public class Chara_alpha_digit {

	public static void main(String[] args) {
		System.out.println("enter the character");
		Scanner kb=new Scanner(System.in);
		char ch=kb.next().charAt(0);
		String ans =(ch>='0'&&ch<='9')?" it is a digit":
			((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z'))?"it is a character"
					:"it is a symbol";
		System.out.println(ans);
		

	}

}
