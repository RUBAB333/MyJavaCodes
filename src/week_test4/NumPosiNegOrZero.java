package week_test4;

import java.util.Scanner;

public class NumPosiNegOrZero {

	public static void main(String[] args) {
		System.out.println("enter the number");
		Scanner kb=new Scanner(System.in);
		int num=kb.nextInt();
		String ans=num>0?"positive":num<0?"negative":"Zero";
		System.out.println(ans);

	}

}
