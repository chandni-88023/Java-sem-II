import java.util.Scanner;
public class sumProg7
{
	public static void main(String[] args){
		if(args.length==0){
			System.out.println("Enter no. of elements as command line argument");
			System.exit(0);
		}
		int sum=0;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter numbers");
		for(int i=1;i<= Integer.parseInt(args[0]);i++)
		{
			sum=sum + in.nextInt();
		}
		System.out.println("Sum of the numbers : "+sum);
	}
}