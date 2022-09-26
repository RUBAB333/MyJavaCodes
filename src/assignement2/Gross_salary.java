package assignement2;

import java.util.Scanner;
//2500, 10000

public class Gross_salary {

	public static void main(String[] args) {
		System.out.println("enter the Basic salary of employee");
		Scanner kb = new Scanner(System.in);
		int bs = kb.nextInt();
		if(bs<=10000)
		{
			int HRA = (bs*20)/100 ;
			int DA = (bs*80)/100 ;
			int GS = bs+HRA+DA;
			System.out.println("Gross salary of employee is "+GS);
		}
		else if(bs<=20000)
		{
			int HRA = (bs*25)/100 ;
			int DA = (bs*90)/100 ;
			int GS = bs+HRA+DA;
			System.out.println("Gross salary of employee is "+GS);
		}
		else if(bs>20000)
		{
			int HRA = (bs*30)/100 ;
			int DA = (bs*95)/100 ;
			int GS = bs+HRA+DA;
			System.out.println("Gross salary of employee is "+GS);
		}
		

	}

}
