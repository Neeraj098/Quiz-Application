package quiz.applicatioon;
import java.awt.*;
import javax.swing.*;
import java.awt.Color;
import java.awt.event.*;
public class Login extends JFrame implements ActionListener{
    JButton rules,back;
    JTextField tframe;
    Login(){
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/quiz.jpg"));
        JLabel image = new JLabel(i1);
        image.setBounds(0,  0 ,600,500);
        add(image);
        JLabel heading = new JLabel ("SMART MINDS");
        heading.setBounds ( 750,60,400,50);
        heading.setFont(new Font ("Viner Hand ITC",Font.BOLD,40));
        heading.setForeground( Color.BLUE);
        add(heading);
        JLabel name = new JLabel ("ENTER YOUR NAME ");
        name.setBounds ( 810,150,300,20);
        name.setFont(new Font ("SimSun",Font.BOLD,20));
        name.setForeground(new Color(30,144,254));
        add(name);
        tframe = new JTextField();
        tframe.setBounds(735,200,300,25);
        tframe.setFont(new Font("Times New Roman", Font.BOLD , 20));
        add(tframe);
         rules = new JButton("Rules");
        rules.setBounds(735,270,120,25);
        rules.setBackground(new Color(30,144,254));
        rules.setForeground(Color.white);
        rules.addActionListener(this);
        add(rules);
         back = new JButton("Black");
        back.setBounds(925,270,120,25);
        back.setBackground(new Color(30,144,254));
        back.setForeground(Color.white);
        back.addActionListener(this);
        add(back);
        setSize(1200,500);
        setLocation(150,150);
        setVisible(true);
    }
       public void actionPerformed(ActionEvent ae){
          if(ae.getSource() == rules){
            String name=tframe.getText();
            setVisible(false);
            new Rules(name);
        }
        else if(ae.getSource() == back){
            setVisible(false);
        }
    }
         public static void main(String [] args){
        
         new Login();
    }
    
}
