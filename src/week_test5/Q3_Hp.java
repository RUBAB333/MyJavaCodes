package week_test5;
class Laptop
{
	int Ram=256;
	public void Price()
	{
		int p=50000;
		System.out.println("price = "+p);
	}
}
class Dell extends Laptop
{
	String a= "INVIDIA";
	void graphicsCard()
	{
		System.out.println("2 GB");
	}
}
public class Q3_Hp extends Dell{
	String h="Hard drive";
	void hardDrive()
	{
		System.out.println(h+" 1TB");
	}

	public static void main(String[] args) {
		Q3_Hp t=new Q3_Hp();
		System.out.println("Ram = "+t.Ram);
		t.Price();
		System.out.println("graphicscard = "+t.a);
		t.graphicsCard();
		System.out.println("Hard drive = "+t.h);
		t.hardDrive();

	}

}
