package assignement2;

import java.util.Scanner;

public class Day_of_week {
	public static void main(String[] args) {
		System.out.println("enter the number between 1 to 7");
		Scanner kb = new Scanner(System.in);
		int num = kb.nextInt();
		switch(num)
		{
		case 1 : System.out.println("maonday");
		break ;
		case 2 : System.out.println("tuesday");
		break ;
		case 3 : System.out.println("wednesday");
		break ;
		case 4 : System.out.println("thursday");
		break ;
		case 5 : System.out.println("friday");
		break ;
		case 6 : System.out.println("saturday");
		break ;
		case 7 : System.out.println("sunday");
		break ;
		default : System.out.println("error,dya does not exist");
		}
	}

}
