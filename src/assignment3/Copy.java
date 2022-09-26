package assignment3;

public class Copy {
	int mobileNumber;
	String name;
	
	public int getMobileNumber()
	{
		return mobileNumber;
	}
	public void setMobileNumber(int m)
	{
		mobileNumber=m;
	}
	public static void main(String[] args) {
		Copy a=new Copy();
		a.mobileNumber=8000705;
		a.setMobileNumber(751346);
		System.out.println(a.mobileNumber);
		
		Copy b=new Copy();
		b.mobileNumber=a.mobileNumber;
		System.out.println(b.mobileNumber);
		
	}

}
