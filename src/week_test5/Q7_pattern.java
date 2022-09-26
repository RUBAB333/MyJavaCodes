package week_test5;

public class Q7_pattern {

	public static void main(String[] args) {
		for(int i=1;i<=7;i++)
		{
			if(i%2!=0)
			{
				for(int s=7;s>i;s--)
				{
					System.out.print(" ");
				}
				for(int j=1;j<=i;j++)
				{
					System.out.print(j+" ");
				}
				System.out.println();
			}
		}

	}

}
