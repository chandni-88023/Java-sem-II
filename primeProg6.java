import java.util.Scanner;
public class primeProg6
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the number for checking whether it is prime or not:");
		int num = in.nextInt();
		int i;
		for(i=2;i<num;i++){
			if(num%i==0)
				break;
		}
		if(i!=num)
			System.out.println(num+" is not a prime number");
		else
			System.out.println(num+" is prime number");
	}
}