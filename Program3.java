/* Save as Shape.java  */
package p1;
abstract public class Shape {
  public abstract void getData();
  public abstract double area();
}

/*  Save as Rectangle.java  */
package p2;
import p1.Shape;
import java.util.Scanner;
public class Rectangle extends Shape {
    private double length;
    private double breadth;
    public void getData(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter length and breadth of rectangle");
        length = in.nextDouble();
        breadth = in.nextDouble();
    }
    public double area(){
        getData();
        return length*breadth;
    }
}

/*  Save as Circle.java  */
package p3;
import p1.Shape;
import java.util.Scanner;
public class Circle extends Shape {
    private double radius;
    public void getData(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter radius of circle");
        radius = in.nextDouble();
    }
    public double area(){
        getData();
        return (3.14*radius*radius);
    }
}


/*  Save as Main.java   */
import p1.Shape;
import p2.Rectangle;
import p3.Circle;
import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter 1 for rectangle shape and 2 for circle shape.\nEnter your choice");
    int choice = in.nextInt();
    Shape ob;
    boolean flag = false;
    while (!flag) {
      switch (choice) {
      case 1:
        flag = true;
        ob = new Rectangle();
        System.out.println("Area: " + ob.area() + " sq unit.");
        break;
      case 2:
        flag = true;
        ob = new Circle();
        System.out.println("Area: " + ob.area() + " sq unit.");
        break;
      default:
        System.out.println("Invalid Input");
        break;
      }
    }
  }
}