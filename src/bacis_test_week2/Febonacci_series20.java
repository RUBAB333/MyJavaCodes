package bacis_test_week2;

public class Febonacci_series20 {

	public static void main(String[] args) {
		int a=0;
		int b=1;
		for(int i=1;i<=20;i++)
		{
			int ans=a+b;
			a=b;
			b=ans;
			System.out.println(ans);
		}

	}

}
