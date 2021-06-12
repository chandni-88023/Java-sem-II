/*  Save as UnderAge.java  */
public class UnderAge extends Exception {
	final private int age;
	public UnderAge(int age) {
		this.age = age;
	}@Override
	public String getMessage() {
		return "UnderAge: " + age + " is less than 18";
	}
}


/*  Save as ExceptionDemo.java  */
import java.util.Scanner;
class ExceptionDemo {
	static void test(int age) throws UnderAge {
		if (age < 18) 
			throw new UnderAge(age);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System. in );
		System.out.print("Enter Age: ");
		int age = sc.nextInt();
		try {
			test(age);
			System.out.println("Test Successful");
		} catch(UnderAge e) {
			System.err.println(e.getMessage());
			System.out.println("Test Unsuccessful");
		} finally {
			sc.close();
		}
	}
}