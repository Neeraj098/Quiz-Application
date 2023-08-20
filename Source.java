package quiz.applicatioon;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.event.*;
import javax.swing.JButton;
import javax.swing.JFrame;
public class Source extends JFrame implements ActionListener{
        Source(String name,int score){
        setBounds(400,150,750,550);
        getContentPane().setBackground(Color.white);
        setLayout(null);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/download (2).jpeg"));
        Image i2 = i1.getImage().getScaledInstance(300, 250, Image.SCALE_DEFAULT);
        ImageIcon i3= new ImageIcon(i2);
        JLabel image = new JLabel(i1);
        image.setBounds(0,  200 ,300,250);
        add(image);
        JLabel heading= new JLabel("Thank You "+name+ " for playing Simple Minds");
        heading.setBounds(45,30,700,30);
        heading.setFont(new Font("Tahoma", Font.PLAIN,26));
        add(heading);
        JLabel lblscore= new JLabel("Your Score is "+score);
        lblscore.setBounds(350,200,300,30);
        lblscore.setFont(new Font("Tahoma", Font.PLAIN,26));
        add(lblscore);
        JButton submit = new JButton("Play Again");
        submit.setBounds(380,270,120,30);
       // submit.setFont(new Font(" Tahoma"  ,Font.PLAIN , 22));
        submit.setBackground( Color.BLUE);
        submit.setForeground(Color.white);
        submit.addActionListener(this);
        add(submit);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        setVisible(false);
        new Login();
    }
  
    public static void main(String[] args)
    {
        new Source("User",0);
    }
}
