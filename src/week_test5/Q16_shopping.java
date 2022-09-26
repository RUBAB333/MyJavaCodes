package week_test5;

public class Q16_shopping {
	
	void doTransication(String a)
	{
		System.out.println("15% discount on bill on credit card trsication");
	}
	void doTransication(int b)
	{
		System.out.println("No discount on bill on debit card trsication");
	}

	public static void main(String[] args) {
		Q16_shopping a=new Q16_shopping();
		a.doTransication("creditcard");
		a.doTransication(45);

	}

}
