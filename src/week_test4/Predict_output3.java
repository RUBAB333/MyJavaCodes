package week_test4;

public class Predict_output3 {
	static int x=2;
	int y;
	void add(int a)
	{
		x=a+1;
	}
	void add(int a,int b)
	{
		add(a);
		x+=a+2;
	}
	

	public static void main(String[] args) {
		Predict_output3 obj=new Predict_output3();
		int a=0;
		obj.add(6, 7);
		System.out.println(obj.x);

	}

}
