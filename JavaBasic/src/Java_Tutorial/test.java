package Java_Tutorial;
import java.util.Scanner;
public class test {
	 public static void main(String[] args) {
		    float n;
		    boolean check;
		    check = true;
		    Scanner inPut = new Scanner(System.in);
		    System.out.print("n = ");
		    n = inPut.nextFloat();
		    if(n < 2)
		    {
		    	check = false;
		    }
		    else
		    {
		    	for(int i = 2;i <= n/2; i++)
		    	{
		    		if(n % i == 0)
		    		{
		    			check = false;
		    		}
		    	}
		    }
		    if(check == true)
		    {
		    	System.out.print("YES");
		    }
		    else
		    {
		    	System.out.print("NO");
		    }
		    int i = 0;
		    for(i = 0; i < n; i++)
		    {
		    	System.out.println("OK");
		    }
		    System.out.println("i = " + i);
		  }

}
