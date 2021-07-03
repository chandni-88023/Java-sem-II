import java.awt.*;
import java.awt.event.*;
public class MyMainFrame extends Frame implements ActionListener{
  Button btnInfo, btnCgpa;
  MyMainFrame() {
    super("Student Details");

    btnInfo=new Button("A");
    btnInfo.setBounds(25, 125, 450, 50);
    btnInfo.addActionListener(this);
    this.add(btnInfo);

    btnCgpa=new Button("B");
    btnCgpa.setBounds(25, 300, 450, 50);
    btnCgpa.addActionListener(this);
    this.add(btnCgpa);

    this.setSize(500, 500);
    this.setBackground(Color.WHITE);
    this.setLayout(null);
    this.setVisible(true);
    this.setLocationRelativeTo(null);
    this.addWindowListener(new WindowAdapter() {
      public void windowClosing(WindowEvent we) {
        System.exit(0);
      }
    });
  }
  @Override
  public void actionPerformed(ActionEvent e) {
    if (e.getSource() == btnInfo) {
      new InformationFrame("Anjali","Bsc.(Hons) Computer Science","20/88000","ARSD College");
    }
    if (e.getSource() == btnCgpa) {
      new CgpaFrame("9.4");
    }
  }
  public static void main(String[] args) {
    new MyMainFrame();
  }
}

class InformationFrame extends Frame{
    Button btnClose;
    Panel panelForm;
    Label name,course,rollNo,college;
    TextField nameF,courseF,rollNoF,collegeF;
    InformationFrame(String n,String c,String r,String clg){
        super("Personal Information");

        name=new Label("Name:");
        name.setBounds(20,20,80,30);
        course=new Label("Course:");
        course.setBounds(20,50,80,30);
        rollNo=new Label("Roll No:");
        rollNo.setBounds(20,80,80,30);
        college=new Label("College:");
        college.setBounds(20,110,80,30);
        
        nameF=new TextField(n);
        nameF.setBounds(100,22,200,24);
        nameF.setEditable(false);
        courseF=new TextField(c);
        courseF.setBounds(100,52,200,24);
        courseF.setEditable(false);
        rollNoF=new TextField(r);
        rollNoF.setBounds(100,82,200,24);
        rollNoF.setEditable(false);
        collegeF=new TextField(clg);
        collegeF.setBounds(100,112,200,24);
        collegeF.setEditable(false);
        
        btnClose=new Button("Close");
        btnClose.setBounds(100,150,125,30);
        btnClose.setBackground(Color.RED);
        btnClose.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                dispose();
            }
        });
        
        panelForm = new Panel();
        panelForm.setLayout(null);
        panelForm.add(name);
        panelForm.add(nameF);
        panelForm.add(course);
        panelForm.add(courseF);
        panelForm.add(rollNo);
        panelForm.add(rollNoF);
        panelForm.add(college);
        panelForm.add(collegeF);
        panelForm.add(btnClose);
        
        this.add(panelForm);
        this.setSize(350,250);
        this.setVisible(true);
        this.setLayout(null);
        this.setLocationRelativeTo(null);
        this.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                dispose();
            }
        });
    }
}

class CgpaFrame extends Frame{
    Label cgpa;
    Button btnClose;
    CgpaFrame(String c){
        super("Previous Year CGPA");
        
        cgpa=new Label("CGPA: "+c);
        cgpa.setBounds(10,50,280,30);
        cgpa.setAlignment(Label.CENTER);
        btnClose=new Button("Close");
        btnClose.setBounds(20,85,260,30);
        btnClose.setBackground(Color.RED);
        btnClose.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                dispose();
            }
        });
        this.add(cgpa);
        this.add(btnClose);
        this.setSize(300,150);
        this.setLayout(null);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                dispose();
            }
        });
    }
}