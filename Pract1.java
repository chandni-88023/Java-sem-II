public class Pract1 {
  public static void main(String args[])throws CloneNotSupportedException { 
    
    try
    {
    Distance d1=new Distance(13,21);
    System.out.println("First distance object:");
    d1.display();
    Distance d2=d1;
    System.out.println("Second distance object(reference for first object):");
    d2.display();
    Distance d3=(Distance)d1.clone();
    System.out.println("Third distance object(clone of first object):");
    d3.display();
    }catch(CloneNotSupportedException e){ System.out.println("error");  }
} 
}
class Distance implements Cloneable{
  
 int feet,inches;
 Distance(int f,int i)
 {
   this.feet=f;
   this.inches=i;
 }
 void display()
 {
  System.out.print("feet:  "+feet);
  System.out.println("\tinches:   "+inches);
   
 }  
  public Object clone() throws CloneNotSupportedException
  {
     return super.clone(); 
  } 
}