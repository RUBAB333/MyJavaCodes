package bacis_test_week2;

public class Pattern1 {

	public static void main(String[] args) {
		int a=1;
		int c=7;
		for(int i=1;i<=4;i++)
		{
		    for(int k=c;k>i;k--)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=a;j++)
			{
				System.out.print(i+" ");
			}
			a=a+2;
			c--;System.out.println();
		}

	}

}
