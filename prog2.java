import java.util.Scanner;
public class prog2 
{
	public static void main(String args[])
	{
		int fact=1,num;
        	Scanner in=new Scanner(System.in);
        	System.out.println("enter the number that you want to have factorial of : ");
        	num=in.nextInt();
        	for(int i=1;i<=num;i++){
            		fact*=i;
        	}
        	System.out.println("factorial of the number is: "+fact);
    	}
}