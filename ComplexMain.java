import java.util.Scanner;
class Complex
{
	double real, imaginary;
	Complex() {
		real=0.0;
		imaginary=0.0;
	}
	Complex(double r,double i) {
		real=r;
		imaginary=i;
	}
	public void input() {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter real part of complex number : ");
		real = in.nextDouble();
		System.out.print("Enter imaginary part of complex number : ");
		imaginary = in.nextDouble();
	}
	public Complex add(Complex c) {
		return new Complex(this.real + c.real,this.imaginary + c.imaginary);
	}
	public Complex multiply(Complex c) {
		return new Complex(this.real*c.real - this.imaginary*c.imaginary,
				this.real*c.imaginary + this.imaginary*c.real);
	}
	@Override
	public String toString() {
		return (real+" + "+imaginary+"i");
	}
}
public class ComplexMain
{
	public static void main(String[] args) {
		Complex c1 = new Complex();
		Complex c2 = new Complex();
		c1.input();
		c2.input();
		System.out.println("First Complex number : "+c1);
		System.out.println("Second Complex number : "+c2);
		System.out.println("Sum of the complex numbers : "+c1.add(c2));
		System.out.println("Multiplication of the complex numbers : "+c1.multiply(c2));
	}
}