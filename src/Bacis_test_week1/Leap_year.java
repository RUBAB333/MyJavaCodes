package Bacis_test_week1;

import java.util.Scanner;

public class Leap_year {

	public static void main(String[] args) {
		System.out.println("enter the year");
		Scanner kb=new Scanner(System.in);
		int num=kb.nextInt();
		/*if(num%400==0) {
			System.out.println(num+" is a leap yera");
		}else if(num%100==0) {
			System.out.println(num+" is not a leap yera"); 
		}else if(num%4==0) {
			System.out.println(num+" is a leap yera");
		}else {
			System.out.println(num+" is not a leap year");
		}*/
		
		String ans=(num%400==0)?"leap year":( (num%4==0)&&(num%100!=0))?"leap year":"not a leap year";
		System.out.println(ans);

	}

}
