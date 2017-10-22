import javax.swing.*;
public class HelloWorld
extends JFrame
{
public static void
main(String[] args)
{
new HelloWorld();
}
public HelloWorld()
{
JPanel panel1 = new
JPanel();
JLabel label1 = new
JLabel ("Hello, World, this is my first Java program on GitHub");
JButton button1 = new
JButton("Make everything OK");
JSlider slider1 = new
JSlider();
panel1.add(label1);
panel1.add(button1);
panel1.add(slider1);
this.add(panel1);
this.setTitle("The OK Button");
this.setSize(500,350);
this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
this.setVisible(true);
}
}
