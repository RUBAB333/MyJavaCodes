package Bacis_test_week1;

import java.util.Scanner;

public class Even_odd {

	public static void main(String[] args) {
		System.out.println("enter the number");
		Scanner kb=new Scanner(System.in);
		int num=kb.nextInt();
		String ans =(num%2==0)?" is even":" is odd";
		System.out.println(num+ans);

	}

}
