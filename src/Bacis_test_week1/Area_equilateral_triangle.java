package Bacis_test_week1;
import java.util.Scanner;

public class Area_equilateral_triangle {

	public static void main(String[] args) {
		System.out.println("enter the side");
		Scanner kb = new Scanner(System.in);
		float side =kb.nextFloat();
		float area =(1.73f*side*side)/4;
		System.out.println("area of equilateral triangle is "+area);
		

	}

}
