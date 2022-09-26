package patterns;

public class Day1 {

	public static void main(String[] args) {
		//print 1234  
		//      123                             
	   //       12                               
		//      1                                
		
		for(int i=4;i>=1;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j);
			}
			System.out.println( );
		}
		System.out.println(" ");
		

	}

}
