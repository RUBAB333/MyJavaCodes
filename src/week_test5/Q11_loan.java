package week_test5;

import java.util.Scanner;

class Loan
{
	public void iRate(int iRate)
	{
		System.out.println("Housing Loan");
		System.out.println("enter the principal amount");
		Scanner kb=new Scanner(System.in);
		int amount=kb.nextInt();
		int loan=amount*(iRate+100);
		System.out.println("loan = "+loan);
	}
	public void iRate(int iRate1,int iRate2 )
	{
		System.out.println("Commercial Loan");
		System.out.println("enter the principal amount");
		Scanner kb=new Scanner(System.in);
		int amount=kb.nextInt();
		int loanAmount=amount*(iRate1+iRate2+100);
		System.out.println("loan = "+loanAmount);
	}
}

public class Q11_loan {

	public static void main(String[] args) {
		Loan a=new Loan();
		a.iRate(8);
		a.iRate(12, 7);
		
		

	}

}
