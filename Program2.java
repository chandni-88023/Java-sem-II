/*  Save as TwoDim.java  */
package p1;
public class TwoDim {
  private int x;
  private int y;
  //Default constructor
  public TwoDim() {
    x = 0;
    y = 0;
  }
  //parametrized constructor
  public TwoDim(int a, int b) {
    x = a;
    y = b;
  }
  //Overriden toString() method
  public String toString() {
    return "Coordinate: x = " + x + " y = " + y;
  }
}

/*  Save as ThreeDim.java  */
package p2;
import p1.TwoDim;
public class ThreeDim extends TwoDim {
  private int z;
  //default constructor
  public ThreeDim() {
    z = 0;
  }
  //parametrized constructor
  public ThreeDim(int a, int b, int c) {
    super(a, b);
    z = c;
  }
  //Overriden toString() method
  public String toString() {
    return super.toString() + " z = " + z;
  }
}

/*  Save as Main.java  */
package p;
import p1.TwoDim;
import p2.ThreeDim;
public class Main{
  public static void main(String[] arg) {

    TwoDim ob;//Reference variable of type TwoDim

    ob = new TwoDim(2,3);
    System.out.println(ob);

    ob = new ThreeDim(2,3,4);
    System.out.println(ob);

  }
}