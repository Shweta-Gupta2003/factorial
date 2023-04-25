import java.util.*;
import java.awt.*;
import java.awt.event.*;

class Operation1 extends Frame implements ActionListener
{
TextField tf1,tf2;
Label l1,l2;
Button b;

public Operation1()
{
setLayout(new FlowLayout());
l1=new Label("Please enter the number:");
l2=new Label("Factorial of the number is:");
tf1=new TextField(10);
tf2=new TextField(10);
b=new Button("Factorial");

add(l1);
add(tf1);
add(b);
add(l2);
add(tf2);

b.addActionListener(this);
addWindowListener(new MyWindowAdapter());
}

public void actionPerformed(ActionEvent ae)
{
if(ae.getSource()==b)
{
int n,fact=1,i;
n=Integer.parseInt(tf1.getText());
for(i=1;i<=n;i++)
{
fact=fact*i;
}
tf2.setText(" "+fact);
}
}

public static void main(String args[])
{
Operation1 o=new Operation1();
o.setSize(400,400);
o.setVisible(true);
}

}

class MyWindowAdapter extends WindowAdapter
{
public void windowClosing(WindowEvent we)
{
System.exit(0);
}
}
