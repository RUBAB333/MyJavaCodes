package week_test5;

public class Week5_Q1 {

	public static void main(String[] args) {
		int a=0,b=1,sum=0;
		System.out.print(a+" "+b);
		for(int i=0;i<8;i++)
		{
			sum=a+b;
			System.out.print(" "+sum);
			a=b;
			b=sum;
		}

	}

}
