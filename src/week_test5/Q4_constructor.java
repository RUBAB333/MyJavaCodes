package week_test5;

public class Q4_constructor {
	int a,b;
	Q4_constructor(int b)
	{
		a=10;
		System.out.println(a);
	}
	Q4_constructor()
	{
		b=30;
		System.out.println(b);
	}

	public static void main(String[] args) {
		Q4_constructor c=new Q4_constructor(40);
		Q4_constructor d=new Q4_constructor();

	}

}
