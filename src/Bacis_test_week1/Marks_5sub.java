package Bacis_test_week1;

import java.util.Scanner;

public class Marks_5sub {
	public static void main(String[] args) {
		System.out.println("enter marks in english");
		Scanner kb=new Scanner(System.in);
		int en=kb.nextInt();
		System.out.println("enter marks in marathi");
		int ma=kb.nextInt();
		System.out.println("enter marks in maths");
		int mt=kb.nextInt();
		System.out.println("enter marks in science");
		int sc=kb.nextInt();
		System.out.println("enter marks in history");
		int hi=kb.nextInt();
		int total=en+ma+sc+hi+mt;
		System.out.println("total marks are "+total);
		System.out.println("average marks are "+total/5);
		System.out.println("percentage is "+total*100f/500);
		
		
		
	}
	
}
