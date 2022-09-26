package week_test5;
class Person
{
	public int number;
}

public class Q15_Test {
	public void doThis(int i, Person p)
	{
		i=5;
		p.number=8;
	}

	public static void main(String[] args) {
		int x=0;
		Person p=new Person();
		new Q15_Test().doThis(x,p);
		System.out.println(x+" "+p.number);

	}

}
