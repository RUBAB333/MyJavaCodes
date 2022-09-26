package week_test5;

import java.util.Scanner;

public class Q14_Game {

	public static void main(String[] args) {
		System.out.println("enter the country name");
		Scanner kb=new Scanner(System.in);
		String name=kb.nextLine();
		switch(name)
		{
		case "India": 
		case "india": System.out.println("India's national game is Hockey");
		break;
		case "China":
		case "china": System.out.println("Chain's national game is Table tennis");
		break;
		case "Bangladesh":
		case "bangladesh": System.out.println("Bangladesh's national game is Kabaddi");
		break;
		case "Itly":
		case "itly": System.out.println("Itly's national game is Football");
		break;
		case "United State": 
		case "united state": 
		case "United state": 
		case "united State": System.out.println("United state's national game is Baseball");
		break;
		default:System.out.println("Error");
		}

	}

}
