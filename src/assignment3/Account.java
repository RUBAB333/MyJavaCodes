package assignment3;

public class Account {
	String name;
	int accountNo;
	String branch;
	public void insert(String n,int ac,String b)
	{
		name=n;
		accountNo=ac;
		branch=b;
	}
	public void display()
	{
		Account a=new Account();
		System.out.println(a.name);
		System.out.println(a.accountNo);
		System.out.println(a.branch);
		
	}
	

}
