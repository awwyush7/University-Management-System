import javax.swing.*;
import java.awt.*;
//multithreading
public class Splash extends JFrame implements Runnable{
    Thread t;
    Splash(){
        //i1 image
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/iitk.jpeg"));
       //i2 scaled image
        Image i2=i1.getImage().getScaledInstance(1000,700, Image.SCALE_DEFAULT);
        ImageIcon i3= new ImageIcon(i2);
        JLabel image= new JLabel(i3);
        add(image);
        t=new Thread(this);
        t.start(); // will call run
        setLocation(250,50 );
        setSize(1000,700);
        setVisible(true);
    }
    public void run(){
        try{
            Thread.sleep((5000));
            setVisible(false);
            //next frame
            new Login();
        } catch (Exception a){

        }
    }
    public static void main(String[] args){

       new Splash();
    }
}

