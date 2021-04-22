import java.io.*;
public class SumElements 
{
    public static void main(String args[])
    { 
    	int num,sum=0;
    	System.out.print("Command line Arguments are ");
    	for(int i=0;i<args.length;i++)
    	{
    		num=Integer.parseInt(args[i]);
		System.out.print(num+" ");
    		sum=sum+num;
    	}
    	System.out.println("\nSum of Elements is : "+sum);
    }  
}