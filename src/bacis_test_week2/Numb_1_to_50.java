package bacis_test_week2;

public class Numb_1_to_50 {

	public static void main(String[] args) {
		for(int i=1;i<=50;i++)
		{
			if(i%2==0)
			{
				System.out.println(i);
			}else
			{
				System.out.println(-i+","+i*i);
			}
		}

	}

}
