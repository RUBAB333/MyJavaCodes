package week_test5;

class Animal
{
    String name="animal";
	String makeNoise()
	{
		return "generic noise";
	}
}
class Dog extends Animal
{
	String name;
	String show()
	{
		return name ;
	}
}

public class Demo_Q9 {

	public static void main(String[] args) {
		Dog a=new Dog();
		System.out.println(a.show());

	}

}
