public class Pract2 {
  public static void main(String args[]){
    Distance d1=new Distance(1.0,20);
    System.out.println("First Object with parameter of type float and int");
    d1.display();
    Distance d2=new Distance('a','A');
    System.out.println("Second Object with parameter of type char and char");
    d2.display();
  }
}
class Distance {
 float feet,inches;
 Distance(double f,double i)
 {
   this.feet=(float)f;
   this.inches=(float)i;
 }
 Distance(int f,int i)
 {
   this.feet=f;
   this.inches=i;
 }
 void display()
 {
  System.out.print("feet=  "+feet);
  System.out.println("\tinches=   "+inches);
 }   
}