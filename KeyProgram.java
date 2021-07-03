import java.awt.*;
import java.awt.event.*;
class MyKeyAdapter extends KeyAdapter{
    Label l;
    MyKeyAdapter(Label l){
        this.l=l;
    }
    @Override
    public void keyTyped(KeyEvent e){
        l.setText("Typed Character is "+e.getKeyChar());
    }
}
public class KeyProgram extends Frame {
  Label l;
  KeyProgram() {
    super("KEY");
    l=new Label("");
    l.setBounds(25,50,250,30);
    l.setAlignment(Label.CENTER);
    this.addKeyListener(new MyKeyAdapter(l));
    this.add(l);
    this.setSize(400, 300);
    this.setLayout(null);
    this.setVisible(true);
    this.addWindowListener(new WindowAdapter() {
      public void windowClosing(WindowEvent we) {
        System.exit(0);
      }
    });
  }
  public static void main(String[] args) {
    new KeyProgram();
  }
}