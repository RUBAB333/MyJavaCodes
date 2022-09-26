package assignment2;

import java.util.Scanner;

public class Greatest_three_using_ternery {
	public static void main(String[] args) {
		System.out.println("enter the 1st number");
		Scanner kb = new Scanner(System.in);
	    int a = kb.nextInt();
	    System.out.println("enter the 2nd number");
	    int b = kb.nextInt();
	    System.out.println("enter the 3rd number");
	    int c = kb.nextInt();
		int ans = (a>b)&&(a>c)? a : (b>c)? b:c ;
		System.out.println(ans+" is greater");
	}

}
