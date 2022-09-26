package week_test3;

public class Pattern1 {

	public static void main(String[] args) {
		for(int i=1;i<=5;i++)
		{
			for(int j=i;j>=1;j--)
			{
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();
		System.out.println();
		
		for(int i=1;i<=5;i++)
		{
			for(int k=i;k<5;k++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
		       if(j%2!=0)
		       {
		    	   System.out.print("1");
		       }else {
		    	   System.out.print("0");
		       }
			}
			System.out.println();
		}

	}

}
