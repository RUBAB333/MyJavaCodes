package week_test4;

public class Print100_400 {
	public static void main(String[] args) {
		for(int i=100;i<=400;i++)
		{
			int a=i;
			boolean ans=true;
			while(a>0)
			{
				int r=a%10;
				if(r%2!=0)
				{
					ans=false;
					break;
				}
				a=a/10;
			}
			if(ans==true)
			{
				System.out.println(i);
			}
		}
	}

}
