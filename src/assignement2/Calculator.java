package assignement2;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		System.out.println("enter the 1st number");
		Scanner kb = new Scanner(System.in);
		int num1 = kb.nextInt();
		System.out.println("enter the 2st number");
		int num2 = kb.nextInt();
		System.out.println("selet from below\n1.addition\n2.substraction"
				+ "\n3.division\n4.multiplication");
		int op = kb.nextInt();
		switch(op)
		{
		case 1 : System.out.println("addition of "+num1+" and "+num2+" is "+num1+num2);
		break ;
		case 2 : System.out.println("substraction of "+num1+" and "+num2+" is "+(num1-num2));
		break ;
		case 3 : System.out.println("division of "+num1+" and "+num2+" is "+num1/num2);
		break ;
		case 4 : System.out.println("multiplication of "+num1+" and "+num2+" is "+num1*num2);
		break ;
		}

	}

}
