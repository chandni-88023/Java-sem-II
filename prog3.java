import java.util.Scanner;
public class prog3 
{
    public static void main(String args[])
    {
    	int a[]=new int[10],size;
        Scanner in =new Scanner(System.in);
        System.out.println("enter the size of array: ");
        size=in.nextInt();
        System.out.println("enter the elements of array: ");
        for(int i=0;i<size;i++)
	{
            a[i]=in.nextInt();

        }
        for(int x=0;x<size;x++)
	{
           a[x]=a[x]+5;
        }
        System.out.println("after adding 5 in each element: ");
        for(int j=0;j<size;j++)
	{
        	System.out.print(a[j]+" ");
        }
    }
}
