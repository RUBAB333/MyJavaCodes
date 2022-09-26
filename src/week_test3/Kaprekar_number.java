package week_test3;

import java.util.Scanner;

public class Kaprekar_number {

	public static void main(String[] args) {
		System.out.println("Enter the number");
		Scanner kb=new Scanner(System.in);
		int num=kb.nextInt();
		int ans1=num*num;
		int temp1=ans1;
		int ans=0;
		int b=0;
		int ans2=0;
		int ans3=0;
		while(ans1>0)
		{
			//int r=ans1%10;
			b++;
			ans1=ans1/10;
		}
		if(b%2==0)
		{
		       ans2=temp1/(int)Math.pow(10, (b/2));
		       ans3=temp1%(int)Math.pow(10, (b/2));
		       ans= ans2+ans3;
		}else{
			   b=b+1;
			   ans2=temp1/(int)Math.pow(10, (b/2));
			   ans3=temp1%(int)Math.pow(10, (b/2));
			   ans= ans2+ans3;
		}
		if(num==ans)
		{
			System.out.println("number is kaprekar number");
		}else {
			System.out.println("number is not a kaprekar number");
		}
		

	}

}
