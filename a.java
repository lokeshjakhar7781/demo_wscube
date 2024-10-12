import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.lang.Exception;
import java.util.Timer;
import java.util.TimerTask;
class login extends JFrame implements ActionListener
{
    JButton b1,b2;
    JPanel newPanel;
    JLabel userLabel, passLabel;
    final JTextField  textField1, textField2;
    login()
    {
        userLabel = new JLabel();
        userLabel.setText("    Enter Name :");
        textField1 = new JTextField(15);
        passLabel = new JLabel();
        passLabel.setText("    Enter Phone Number :");
        textField2 = new JTextField(8);
        b1 = new JButton("   SUBMIT   ");
        b2 = new JButton("   CANCEL   ");
        newPanel = new JPanel(new GridLayout(3, 1));
        newPanel.add(userLabel);
        newPanel.add(textField1);
        newPanel.add(passLabel);
        newPanel.add(textField2);
        newPanel.add(b1);newPanel.add(b2);
        add(newPanel, BorderLayout.CENTER);
        b1.addActionListener(this);
        b2.addActionListener(null);
        setTitle("Login Form ");
    }
    public void actionPerformed(ActionEvent ae)
    {
        String userValue = textField1.getText();
        String passValue = textField2.getText();
        if(!passValue.equals(""))
            new OnlineTestBegin(userValue);
        else{
            textField2.setText("Enter Phone Number");
            JOptionPane.showMessageDialog(this,"Instructions :- \n 1. Attempt all questions \n 2. All questions are of 1 points \n 3. Passing Score is 5 \n 4. Once you entered your answer it will not changed, so you choose correct option \n 5. Time is 70 Seconds");

            actionPerformed(ae);
        }
    }
}
class OnlineTestBegin extends JFrame implements ActionListener
{
    JLabel l;
    JLabel l1;
    JRadioButton jb[]=new JRadioButton[6];
    JButton b1,b2,log;
    ButtonGroup bg;
    int count=0,current=0,x=1,y=1,now=0;
    int m[]=new int[10];
    Timer timer = new Timer();
    OnlineTestBegin(String s)
    {
        super(s);
        l=new JLabel();
        l1 = new JLabel();
        add(l);
        add(l1);
        bg=new ButtonGroup();
        for(int i=0;i<5;i++)
        {
            jb[i]=new JRadioButton();
            add(jb[i]);
            bg.add(jb[i]);
        }
        b1=new JButton("NEXT");
        b2=new JButton("SKIP");
        b1.addActionListener(this);
        b2.addActionListener(this);
        add(b1);add(b2);
        set();
        l.setBounds(30,40,450,20);
        l1.setBounds(20,20,450,20);
        jb[0].setBounds(50,80,100,20);
        jb[1].setBounds(50,110,100,20);
        jb[2].setBounds(50,140,100,20);
        jb[3].setBounds(50,170,100,20);
        b1.setBounds(95,240,140,30);
        b2.setBounds(270,240,150,30);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setLocation(250,100);
        setVisible(true);
        setSize(600,350);
        timer.scheduleAtFixedRate(new TimerTask() {
            int i = 70;
            public void run() {
                l1.setText("Time left: " + i);
                i--;
                if (i < 0) {
                    timer.cancel();
                    JOptionPane.showMessageDialog(rootPane, "Time Over");
                    System.exit(0);
                }
            }
        }, 0, 1000);
    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==b1)
        {
            if(check())
                count=count+1;
            current++;
            set();
            if(current==9)
            {
                b1.setEnabled(false);
                b2.setText("Result");
            }
        }
        if(e.getActionCommand().equals("SKIP"))
        {
            JButton bk=new JButton("Review"+x);
            bk.setBounds(480,20+30*x,100,30);
            add(bk);
            bk.addActionListener(this);
            m[x]=current;
            x++;
            current++;
            set();
            if(current==9)
                b2.setText("Result");
            setVisible(false);
            setVisible(true);
        }
        for(int i=0,y=1;i<x;i++,y++)
        {
            if(e.getActionCommand().equals("Review"+y))
            {
                if(check())
                    count=count+1;
                now=current;
                current=m[y];
                set();
                ((JButton)e.getSource()).setEnabled(false);
                current=now;
            }
        }
        if(e.getActionCommand().equals("Result"))
        {
            if(check())
                count=count+1;
            current++;
            JOptionPane.showMessageDialog(this,"Score = " +count + " Out Of 10");
            if(count>=5) {
                JOptionPane.showMessageDialog(this,"Passed");
            }
            else {
                JOptionPane.showMessageDialog(this,"Failed");
            }
            JOptionPane.showMessageDialog(this,"Thanks For Using");
            System.exit(0);
        }
    }
    void set()
    {
        jb[4].setSelected(true);
        if(current==0)
        {
            l.setText("1: How much memory takes by the Float?");
            jb[0].setText("2 Bytes");jb[1].setText("3 Bytes");jb[2].setText("4 Bytes");jb[3].setText("5 Bytes");
        }
        if(current==1)
        {
            l.setText("2: What makes java Platform Independent?");
            jb[0].setText("Message Code");jb[1].setText("Byte Code");jb[2].setText("Machine Code");jb[3].setText("Assembly code");
        }
        if(current==2)
        {
            l.setText("3: Which one of the following is a non linear data structure?");
            jb[0].setText("Tree");jb[1].setText("Linked List");jb[2].setText("Stack");jb[3].setText("Queue");
        }
        if(current==3)
        {
            l.setText("4: Which primitive data type in java stores a single value or character?");
            jb[0].setText("Boolean");jb[1].setText("Char");jb[2].setText("Int");jb[3].setText("Double");
        }
        if(current==4)
        {
            l.setText("5: Java was developed in which year?");
            jb[0].setText("1990");jb[1].setText("1995");jb[2].setText("1992");jb[3].setText("1991");
        }
        if(current==5)
        {
            l.setText("6: How much memory taken by the boolean data type?");
            jb[0].setText("1 Byte");jb[1].setText("2 Bytes");jb[2].setText("3 Bytes");jb[3].setText("4 Bytes");
        }
        if(current==6)
        {
            l.setText("7: Which keyword in java used to break the code in the switch case statement? ");
            jb[0].setText("break");jb[1].setText("abstract");jb[2].setText("Interface");
            jb[3].setText("class");
        }
        if(current==7)
        {
            l.setText("8: How much memory take by the Double data type?");
            jb[0].setText("3 Bytes");jb[1].setText("4 Bytes");jb[2].setText("8 Bytes");
            jb[3].setText("7 Bytes");
        }
        if(current==8)
        {
            l.setText("9: Which Software Development Kit(SDK) is required for developing java apps?");
            jb[0].setText("JDK");jb[1].setText("JRE");jb[2].setText("IntelliJ IDEA");jb[3].setText("JVM");
        }
        if(current==9)
        {
            l.setText("10:  Which of these are conditional statements in java ?");
            jb[0].setText("for()");jb[1].setText("if()");jb[2].setText("break");
            jb[3].setText("continue");
        }
        l.setBounds(30,40,450,20);
        for(int i=0,j=0;i<=90;i+=30,j++)
            jb[j].setBounds(50,80+i,200,20);
    }
    boolean check()
    {
        if(current==0)
            return(jb[2].isSelected());
        if(current==1)
            return(jb[1].isSelected());
        if(current==2)
            return(jb[0].isSelected());
        if(current==3)
            return(jb[1].isSelected());
        if(current==4)
            return(jb[3].isSelected());
        if(current==5)
            return(jb[0].isSelected());
        if(current==6)
            return(jb[0].isSelected());
        if(current==7)
            return(jb[2].isSelected());
        if(current==8)
            return(jb[0].isSelected());
        if(current==9)
            return(jb[1].isSelected());
        return false;
    }
}
class a
{
    public static void main(String args[])
    {
        try
        {
            login form = new login();
            form.setSize(400,150);
            form.setVisible(true);
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
}