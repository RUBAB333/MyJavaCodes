package Bacis_test_week1;

import java.util.Scanner;

public class Greatest_3 {

	public static void main(String[] args) {
		System.out.println("enter the 1st number");
		Scanner kb=new Scanner(System.in);
		int num1=kb.nextInt();
		System.out.println("enter the 2st number");
		int num2=kb.nextInt();
		System.out.println("enter the 2st number");
		int num3=kb.nextInt();
		int ans = (num1>num2)&&(num1>num3)?num1:(num2>num3)?num2:num3;
		System.out.println(ans+" is greater");
	}

}
