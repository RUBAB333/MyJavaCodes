package week_test5;

class CreditCard
{
	public void doTrancition(CreditCard c)
	{
		System.out.println("you got 15% discount");
	}
}
class DebitCard extends CreditCard
{
	public void doTransiction(DebitCard d)
	{
		System.out.println("no discount");
	}
}

public class Shopping extends DebitCard {

	public static void main(String[] args) {
		Shopping a=new Shopping();
		a.doTrancition(new CreditCard());

	}

}
