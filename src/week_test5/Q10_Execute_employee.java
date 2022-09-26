package week_test5;

class Department
{
	private String dept;
	public void setDept(String dept)
	{
		this.dept=dept;
	}
    public String getDept()
    {
    	return dept ;
    }
}


class Employee
{
	private int id;
	private String name="HI";
	private boolean isManager;
	private float salary;
	Department dept ;
	
	public void setId(int id)
	{
		this.id=id;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public void setIsManager(boolean s)
	{
		this.isManager=s;
	}
	public void setSalary(float salary)
	{
		this.salary=salary;
	}
	public  void setDept(Department dept)
	{
		this.dept=dept;
	}
	
	
	public int getId()
	{
		return id;
	}
	public String getName()
	{
		return name;
	}
	public boolean getIsManager()
	{
		return isManager;
	}
	public float getSalary()
	{
		return salary;
	}
	public Department getDept()
	{
		return dept ;
	}
}

public class Q10_Execute_employee {

	public static void main(String[] args) {
		Employee a=new Employee();
		a.setId(33333);
		a.setName("rohit");
		a.setIsManager(true);
		a.setSalary(65000.456f);
	    a.setDept(new Department());
	    a.getDept().setDept("Development");
        System.out.println(a.getId()+"\n"+a.getName()+"\n"+a.getSalary()+
        		"\n"+a.getDept().getDept()+"\n"+a.getIsManager());
	}

}
