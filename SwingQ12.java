import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class SwingQ12 implements ActionListener {
    JButton btnInfo, btnCGPA;
    SwingQ12() {
        JFrame f = new JFrame("Student Details");
        btnInfo = new JButton("A");
        btnInfo.setBounds(18, 100, 450, 100);
        btnInfo.addActionListener(this);
        f.add(btnInfo);
        btnCGPA = new JButton("B");
        btnCGPA.setBounds(18, 270, 450, 100);
        btnCGPA.addActionListener(this);
        f.add(btnCGPA);
        f.setSize(500, 500);
        f.setLayout(null);
        f.setVisible(true);
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new SwingQ12();
            }
        });
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnInfo) {
            new Information(
                "SUDIPTO GHOSH", 
                "BSc (Hons) Computer Science", 
                "19/78003", 
                "ARSD College"
            );
        } else if (e.getSource() == btnCGPA) {
            new CGPA("9.73");
        }
    }
}
 
/** Information.java **/
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class Information {
    JButton btnClose;
    JPanel panelForm;
    JLabel labelName, labelCourse, labelRollNo, labelCollege;
    JTextField fieldName, fieldCourse, fieldRollNo, fieldCollege;
    Information(String name, String course, String rollNo, String college) {
        JFrame f = new JFrame("Personal Information");
        labelName = new JLabel("Name:");
        labelName.setBounds(30, 30, 90, 23);
        labelCourse = new JLabel("Course:");
        labelCourse.setBounds(30, 60, 100, 23);
        labelRollNo = new JLabel("Roll No.:");
        labelRollNo.setBounds(30, 90, 80, 23);
        labelCollege = new JLabel("College:");
        labelCollege.setBounds(30, 120, 90, 23);
        fieldName = new JTextField(name);
        fieldName.setBounds(120, 30, 210, 23);
        fieldName.setEditable(false);
        fieldCourse = new JTextField(course);
        fieldCourse.setBounds(120, 60, 210, 23);
        fieldCourse.setEditable(false);
        fieldRollNo = new JTextField(rollNo);
        fieldRollNo.setBounds(120, 90, 210, 23);
        fieldRollNo.setEditable(false);
        fieldCollege = new JTextField(college);
        fieldCollege.setBounds(120, 120, 210, 23);
        fieldCollege.setEditable(false);
        btnClose = new JButton("Close");
        btnClose.setBounds(110, 160, 140, 30);
        btnClose.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.dispose();
            }
        });
        panelForm = new JPanel();
        panelForm.setLayout(null);
        panelForm.add(labelName);
        panelForm.add(fieldName);
        panelForm.add(labelCourse);
        panelForm.add(fieldCourse);
        panelForm.add(labelRollNo);
        panelForm.add(fieldRollNo);
        panelForm.add(labelCollege);
        panelForm.add(fieldCollege);
        panelForm.add(btnClose);
        f.add(panelForm);
        f.setSize(380, 250);
        f.setVisible(true);
        f.setLayout(null);
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
}
 
/** CGPA.java **/
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class CGPA {
    JLabel l;
    JButton btnClose;
    CGPA(String cgpa) {
        JFrame f = new JFrame("Previous Year CGPA");
        l = new JLabel("Your CGPA was: " + cgpa, SwingConstants.CENTER);
        l.setBounds(20, 20, 250, 30);
        btnClose = new JButton("Close");
        btnClose.setBounds(90, 60, 100, 30);
        btnClose.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.dispose();
            }
        });
        f.add(l);
        f.add(btnClose);
        f.setSize(310, 150);
        f.setLayout(null);
        f.setVisible(true);
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
}