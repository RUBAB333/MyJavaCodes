package assignment2;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		System.out.println("enter the number of student");
		Scanner keyboard = new Scanner(System.in);
		int num = keyboard.nextInt();
		switch(num)
		{
		case 100 : System.out.println("book the bus");
		           break ;
		          
		case 50 : System.out.println("book the traveller");
		          break ;
		         
		case 20 : System.out.println("book the cars");
	            	break ;
		default : System.out.println("cancel the trip");
		          break ;  
		}

	}

}
