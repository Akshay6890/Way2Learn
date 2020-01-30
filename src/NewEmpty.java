import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.util.*;
class NewEmpty1 extends JFrame implements ActionListener
{
	JTextField t;
	JButton b[]=new JButton[16];
	JButton b1,b2;
	JPanel p1,p2;
	static double a=0,q=0,result=0;
	static int operator=0;
	NewEmpty1()
	{
		p1=new JPanel(new GridLayout(4,4));
		p2=new JPanel(new GridLayout(1,2));
		t=new JTextField();
		p1.setBounds(0,100,300,300);
		p2.setBounds(0,400,300,100);
		t.setBounds(0,0,300,100);
		b[0]=new JButton("1");
		b[1]=new JButton("2");
		b[2]=new JButton("3");
		b[3]=new JButton("+");
		b[4]=new JButton("4");
		b[5]=new JButton("5");
		b[6]=new JButton("6");
		b[7]=new JButton("-");
		b[8]=new JButton("7");
		b[9]=new JButton("8");
		b[10]=new JButton("9");
		b[11]=new JButton("*");
		b[12]=new JButton(".");
		b[13]=new JButton("0");
		b[14]=new JButton("=");
		b[15]=new JButton("/");
		b1=new JButton("DEL");
		b2=new JButton("CLR");
		add(p1);
		add(p2);
		add(t);
		for(int i=0;i<16;i++)
		{
			p1.add(b[i]);
			b[i].addActionListener(this);
		}
		b1.addActionListener(this);
		b2.addActionListener(this);
		p2.add(b1);
		p2.add(b2);
		setSize(300,500);
		setLayout(null);
		setVisible(true);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b[0])
			t.setText(t.getText().concat("1"));
		if(e.getSource()==b[1])
			t.setText(t.getText().concat("2"));
		if(e.getSource()==b[2])
			t.setText(t.getText().concat("3"));
		if(e.getSource()==b[4])
			t.setText(t.getText().concat("4"));
		if(e.getSource()==b[5])
			t.setText(t.getText().concat("5"));
		if(e.getSource()==b[6])
			t.setText(t.getText().concat("6"));
		if(e.getSource()==b[8])
			t.setText(t.getText().concat("7"));
		if(e.getSource()==b[9])
			t.setText(t.getText().concat("8"));
		if(e.getSource()==b[10])
			t.setText(t.getText().concat("9"));
		if(e.getSource()==b[13])
			t.setText(t.getText().concat("0"));
		if(e.getSource()==b[12])
			t.setText(t.getText().concat("."));
		if(e.getSource()==b[3])
		{
			a=Double.parseDouble(t.getText());
			operator=1;
			t.setText("");
		}
		if(e.getSource()==b[7])
		{
			a=Double.parseDouble(t.getText());
			operator=2;
			t.setText("");
		}
		if(e.getSource()==b[11])
		{
			a=Double.parseDouble(t.getText());
			operator=3;
			t.setText("");
		}
		if(e.getSource()==b[15])
		{
			a=Double.parseDouble(t.getText());
			operator=4;
			t.setText("");
		}
		if(e.getSource()==b[14])
		{
			q=Double.parseDouble(t.getText());
			switch(operator)
			{
				case 1: result=a+q;
						break;
				case 2: result=a-q;
						break;
				case 3: result=a*q;
						break;
				case 4: result=a/q;
						break;
				default: result=0;
			}
			t.setText(""+result);
		}
		if(e.getSource()==b2)
			t.setText("");
		if(e.getSource()==b1)
		{
			String s=t.getText();
			t.setText("");
			for(int i=0;i<s.length()-1;i++)
			t.setText(t.getText()+s.charAt(i));
		}
	}
	
}
public class NewEmpty
{
    public static void main(String[] args)
	{
		NewEmpty1 c=new NewEmpty1();
	}
}