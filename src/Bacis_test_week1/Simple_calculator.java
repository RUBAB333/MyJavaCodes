package Bacis_test_week1;

import java.util.Scanner;

public class Simple_calculator {

	public static void main(String[] args) {
	System.out.println("enter the 1st number");
	Scanner kb=new Scanner(System.in);
	int a=kb.nextInt();
	System.out.println("enter the 2nd number");
	int b=kb.nextInt();
	System.out.println("1.addition\n2.substraction\n3.multiplication"
			+ "\n4.division");
	int op=kb.nextInt();
	switch(op)
	{
	case 1 : System.out.println(a+b);
	break;
	case 2 : System.out.println(a-b);
	break;
	case 3 : System.out.println(a*b);
	break;
	case 4 : System.out.println(a/b);
	default : System.out.println("invalid option");
	}
	}

}
