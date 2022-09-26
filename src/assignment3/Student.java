package assignment3;

public class Student {
	
	/*Student a=new Student();
	Student b=new Student();*/
	
	int id=12345;
	String name="rohit";
	
	public int getId()
	{
		return id;
	}
	public void setId(int n)
	{
		
	}
	public void displayData()
	{
		Student c=new Student();
		c.getId();
		c.setId(5421);
	}
	public void display()
	{
		id=45721;
		name="keshav";
		System.out.println(id+" "+name);
	}
	
	
	public static void main(String[] args) {
		
		//System.out.println(id+" "+name);
		
		Student a=new Student();
		a.id=64789;
		a.name="rahul";
		System.out.println(a.id+" "+a.name);
		
		Student b=new Student();
		b.id=3333;
		b.name="vaibhav";
		System.out.println(b.id+"  "+b.name);
		
		b.display();
	
		
		
	}

}
