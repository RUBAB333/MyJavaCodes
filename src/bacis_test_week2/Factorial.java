package bacis_test_week2;

import javax.sound.midi.SysexMessage;

public class Factorial {

	public static void main(String[] args) {
		int sum=0;
		int ans=1;
	  for(int i=1;i<=5;i++)
	  {
	      ans=ans*i;
	      sum=sum+ans;
	  }
	  System.out.println(sum);

	}
	

}
