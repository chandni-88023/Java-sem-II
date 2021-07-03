import java.awt.*;
import java.awt.event.*;
public class ButtonExample extends Frame implements ActionListener {
  Button b, b1;
  ButtonExample() {
    super("Button Example");

    b = new Button("Red");
    b.setBounds(50, 150, 90, 40);
    b.addActionListener(this);

    b1 = new Button("Blue");
    b1.setBounds(150, 150, 90, 40);
    b1.addActionListener(this);


    this.add(b);
    this.add(b1);

    this.setSize(400, 400);
    this.setLayout(null);
    this.setVisible(true);
    this.addWindowListener(new WindowAdapter() {
      public void windowClosing(WindowEvent we) {
        System.exit(0);
      }
    });
  }
  @Override
  public void actionPerformed(ActionEvent e) {
    if (e.getSource() == b) {
      this.setBackground(Color.RED);
    }
    if (e.getSource() == b1) {
      this.setBackground(Color.BLUE);
    }
  }
  public static void main(String[] args) {
    new ButtonExample();
  }
}