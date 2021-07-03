import java.awt.*;
import java.awt.event.*;
class MyFrame extends Frame {
  MyFrame(){

    Label l=new Label("This is label");
    l.setBounds(25,50,250,30);
    l.setAlignment(Label.CENTER);
    this.add(l);

    this.setSize(400, 400);
    this.setBackground(Color.pink);
    this.setLayout(null);
    this.setVisible(true);
    this.addWindowListener(new WindowAdapter() {
      public void windowClosing(WindowEvent we) {
        System.exit(0);
      }
    });
  }
  
/*public void paint(Graphics g) {
    g.drawString("Using paint methods", 150, 200);
  }*/
  public static void main(String[] args) {
    MyFrame ob = new MyFrame();
  }
}