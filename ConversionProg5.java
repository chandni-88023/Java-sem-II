import java.util.Scanner;
public class ConversionProg5
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the decimal number : ");
		int num = in.nextInt();
		String binary="";
		while(num!=0) {
			binary=(String.valueOf(num%2))+binary;
			num = num/2;
		}
		System.out.println("Binary equivalent of the number is : "+binary);
	}
}