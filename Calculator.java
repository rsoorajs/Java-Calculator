import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;



public class Calc implements ActionListener {
	JFrame jf;
	JLabel Displaylabel;
	JButton Mcbutton;
	JButton Percentagebutton;
	JButton Mrbutton;
	JButton Sevenbutton;
	JButton Mminusbutton;
	JButton Eightbutton;
	JButton Mplusbutton;
	JButton Ninebutton;
	JButton Rootbutton;
	JButton Divisionbutton;
	JButton Plusorminusbutton;
	JButton Fourbutton;
	JButton Fivebutton;
	JButton Sixbutton;
	JButton Multibutton;
	JButton Cebutton;
	JButton Onebutton;
	JButton Twobutton;
	JButton Threebutton;
	JButton Subtractbutton;
	JButton Acbutton;
	JButton Zerobutton;
	JButton Pointbutton;
	JButton Equalbutton;
	JButton Plusbutton;
	
	
	boolean check=false;
	
	String oldnum;
	String newnum;
	Float oldnum2;
	Float newnum2;
	Float result;
	float temp;
	float temp2;


	
	int select=0;

	Calc(){
		jf=new JFrame("Java Calculator");
		jf.setSize(450,510);
		jf.setLocation(350, 80);
		jf.setLayout(null);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setVisible(true);
		
		
		Displaylabel=new JLabel();
		Displaylabel.setHorizontalAlignment(SwingConstants.RIGHT);
		Displaylabel.setBounds(20,20,400,70);
		Displaylabel.setBackground(Color.gray);
		Displaylabel.setForeground(Color.white);
		Displaylabel.setOpaque(true);
		jf.add(Displaylabel);
		Displaylabel.setFont(new Font("Serif", Font.BOLD, 50));
		
		JButton Mcbutton = new JButton("MC");
		Mcbutton.setBounds(20,120,60,60);
		jf.add(Mcbutton);
		Mcbutton.addActionListener(this);
		
		
		JButton Percentagebutton = new JButton("%");
		Percentagebutton.setBounds(20,190,60,60);
		jf.add(Percentagebutton);
		Percentagebutton.setFont(new Font("Arial", Font.PLAIN, 20));
		Percentagebutton.addActionListener(this);
		
		
		JButton Mrbutton = new JButton("MR");
		Mrbutton.setBounds(100,120,60,60);
		jf.add(Mrbutton);
		Mrbutton.addActionListener(this);
		
		
		Sevenbutton = new JButton("7");
		Sevenbutton.setBounds(100,190,60,60);
		jf.add(Sevenbutton);
		Sevenbutton.setFont(new Font("Arial", Font.PLAIN, 30));
		Sevenbutton.addActionListener(this);
		
		
		Mminusbutton = new JButton("M-");
		Mminusbutton.setBounds(180,120,60,60);
		jf.add(Mminusbutton);
		Mminusbutton.addActionListener(this);
		
		
		Eightbutton = new JButton("8");
		Eightbutton.setBounds(180,190,60,60);
		jf.add(Eightbutton);
		Eightbutton.setFont(new Font("Arial", Font.PLAIN, 30));
		Eightbutton.addActionListener(this);
		
		
		Mplusbutton = new JButton("M+");
		Mplusbutton.setBounds(260,120,60,60);
		jf.add(Mplusbutton);
		Mplusbutton.addActionListener(this);
		
		
		Ninebutton = new JButton("9");
		Ninebutton.setBounds(260,190,60,60);
		jf.add(Ninebutton);
		Ninebutton.setFont(new Font("Arial", Font.PLAIN, 30));
		Ninebutton.addActionListener(this);
		
		
		Rootbutton = new JButton("R");
		Rootbutton.setBounds(340,120,60,60);
		jf.add(Rootbutton);
		Rootbutton.setFont(new Font("Arial", Font.PLAIN, 30));
		Rootbutton.addActionListener(this);
		
		
		Divisionbutton = new JButton("/");
		Divisionbutton.setBounds(340,190,60,60);
		jf.add(Divisionbutton);
		Divisionbutton.setFont(new Font("Arial", Font.PLAIN, 30));
		Divisionbutton.addActionListener(this);
		
		
		Plusorminusbutton = new JButton("+/-");
		Plusorminusbutton.setBounds(20,260,60,60);
		jf.add(Plusorminusbutton);
		Plusorminusbutton.setFont(new Font("Arial", Font.PLAIN,20));
		Plusorminusbutton.addActionListener(this);
		
		
		Fourbutton = new JButton("4");
		Fourbutton.setBounds(100,260,60,60);
		jf.add(Fourbutton);
		Fourbutton.setFont(new Font("Arial", Font.PLAIN, 30));
		Fourbutton.addActionListener(this);
		
		
		Fivebutton = new JButton("5");
		Fivebutton.setBounds(180,260,60,60);
		jf.add(Fivebutton);
		Fivebutton.setFont(new Font("Arial", Font.PLAIN, 30));
		Fivebutton.addActionListener(this);
			
		
		Sixbutton = new JButton("6");
		Sixbutton.setBounds(260,260,60,60);
		jf.add(Sixbutton);
		Sixbutton.setFont(new Font("Arial", Font.PLAIN, 30));
		Sixbutton.addActionListener(this);
		
		
		Multibutton = new JButton("X");
		Multibutton.setBounds(340,260,60,60);
		jf.add(Multibutton);
		Multibutton.setFont(new Font("Arial", Font.PLAIN, 30));
		Multibutton.addActionListener(this);
		
		
		
		Cebutton = new JButton("CE");
		Cebutton.setBounds(20,330,60,60);
		jf.add(Cebutton);
		Cebutton.addActionListener(this);
		
		
		
		Onebutton = new JButton("1");
		Onebutton.setBounds(100,330,60,60);
		jf.add(Onebutton);
		Onebutton.setFont(new Font("Arial", Font.PLAIN, 30));
		Onebutton.addActionListener(this);
		
		
		Twobutton = new JButton("2");
		Twobutton.setBounds(180,330,60,60);
		jf.add(Twobutton);
		Twobutton.setFont(new Font("Arial", Font.PLAIN, 30));
		Twobutton.addActionListener(this);
		
		
		Threebutton = new JButton("3");
		Threebutton.setBounds(260,330,60,60);
		jf.add(Threebutton);
		Threebutton.setFont(new Font("Arial", Font.PLAIN, 30));
		Threebutton.addActionListener(this);
		
		
		Subtractbutton = new JButton("-");
		Subtractbutton.setBounds(340,330,60,60);
		jf.add(Subtractbutton);
		Subtractbutton.setFont(new Font("Arial", Font.PLAIN, 30));
		Subtractbutton.addActionListener(this);
		
		
		Acbutton = new JButton("AC");
		Acbutton.setBounds(20,400,60,60);
		jf.add(Acbutton);
		Acbutton.addActionListener(this);
		
		
		Zerobutton = new JButton("0");
		Zerobutton.setBounds(100,400,60,60);
		jf.add(Zerobutton);
		Zerobutton.setFont(new Font("Arial", Font.PLAIN, 30));
		Zerobutton.addActionListener(this);
		
		
		Pointbutton = new JButton(".");
		Pointbutton.setBounds(180,400,60,60);
		jf.add(Pointbutton);
		Pointbutton.setFont(new Font("Arial", Font.PLAIN, 30));
		Pointbutton.addActionListener(this);
		
		
		
		Equalbutton = new JButton("=");
		Equalbutton.setBounds(260,400,60,60);
		jf.add(Equalbutton);
		Equalbutton.setFont(new Font("Arial", Font.PLAIN, 30));
		Equalbutton.addActionListener(this);
		
		
		Plusbutton = new JButton("+");
		Plusbutton.setBounds(340,400,60,60);
		jf.add(Plusbutton);
		Plusbutton.setFont(new Font("Arial", Font.PLAIN, 30));
		Plusbutton.addActionListener(this);
		
	}
	public static void main(String[] args) {
		new Calc();
	}
	
	@Override
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()== Mcbutton) {
			}
		
		else if(e.getSource() == Percentagebutton) {
			select=5;
			check = true;
			oldnum=Displaylabel.getText();
				}

		else if(e.getSource() == Mrbutton) {
			}
		
		else if(e.getSource() == Sevenbutton) {
			if(check==true) {
				Displaylabel.setText("7");
				check=false;
			}
			else {
				
			Displaylabel.setText(Displaylabel.getText()+"7");
			}
		}
		
		else if(e.getSource() == Mminusbutton) {
			check = true;
			}
		
		else if(e.getSource() == Eightbutton) {
			if(check==true) {
				Displaylabel.setText("8");
				check=false;
			}
			else {
				
			Displaylabel.setText(Displaylabel.getText()+"8");
			}
		}
		
		else if(e.getSource() == Mplusbutton) {
			}
		
		else if(e.getSource() == Ninebutton) {
			if(check==true) {
				Displaylabel.setText("9");
				check=false;
			}
			else {
				
			Displaylabel.setText(Displaylabel.getText()+"9");
			}
		}
		
		else if(e.getSource() == Rootbutton) {
			
			select=6;
			check = true;
			oldnum=Displaylabel.getText();
			}
		
		
		
		else if(e.getSource() == Plusorminusbutton) {
			check = true;
			}
		
		else if(e.getSource() == Fourbutton) {
			if(check==true) {
				Displaylabel.setText("4");
				check=false;
			}
			else {
				
			Displaylabel.setText(Displaylabel.getText()+"4");
			}
		}
		
		else if(e.getSource() == Fivebutton) {
			if(check==true) {
				Displaylabel.setText("5");
				check=false;
			}
			else {
				
			Displaylabel.setText(Displaylabel.getText()+"5");
			}
		}
		
		else if(e.getSource() == Sixbutton) {
			if(check==true) {
				Displaylabel.setText("6");
				check=false;
			}
			else {
				
			Displaylabel.setText(Displaylabel.getText()+"6");
			}
		}
		
		
		
		else if(e.getSource() == Cebutton) {
			Displaylabel.setText("0");}
		
		else if(e.getSource() == Onebutton) {
			if(check==true) {
				Displaylabel.setText("1");
				check=false;
			}
			else {
				
			Displaylabel.setText(Displaylabel.getText()+"1");
			}
		}
		
		else if(e.getSource() == Twobutton) {
			if(check==true) {
				Displaylabel.setText("2");
				check=false;
			}
			else {
				
			Displaylabel.setText(Displaylabel.getText()+"2");
			}
		}
		
		else if(e.getSource() == Threebutton) {
			if(check==true) {
				Displaylabel.setText("3");
				check=false;
			}
			else {
				
			Displaylabel.setText(Displaylabel.getText()+"3");
			}
		}
		
		
		
		else if(e.getSource() == Acbutton) { 
			Displaylabel.setText("");}
		
		else if(e.getSource() == Zerobutton) {
			if(check==true) {
				Displaylabel.setText("0");
				check=false;
			}
			else {
				
			Displaylabel.setText(Displaylabel.getText()+"0");
			}
		}
		
		else if(e.getSource() == Pointbutton) {
			if(check==true) {
				Displaylabel.setText(".");
				check=false;
			}
			else {
				
			Displaylabel.setText(Displaylabel.getText()+".");
			}
		}
		
		else if(e.getSource() == Equalbutton) {
			switch(select) {
			
			case 1:		
				newnum=Displaylabel.getText();
				oldnum2=Float.parseFloat(oldnum);
				newnum2=Float.parseFloat(newnum);
				result=temp2+newnum2;
				Displaylabel.setText(result +"");
				temp2=0;
				break;
			case 2:
				newnum=Displaylabel.getText();
				oldnum2=Float.parseFloat(oldnum);
				newnum2=Float.parseFloat(newnum);
				result=(temp2-newnum2);
				Displaylabel.setText(result +"");
				temp2=0;
				break;
			case 3:
				newnum=Displaylabel.getText();
				oldnum2=Float.parseFloat(oldnum);
				newnum2=Float.parseFloat(newnum);
				result=oldnum2*newnum2;
				Displaylabel.setText(result +"");
				temp2=0;
				break;
			case 4:
				newnum=Displaylabel.getText();
				oldnum2=Float.parseFloat(oldnum);
				newnum2=Float.parseFloat(newnum);
				result=oldnum2/newnum2;
				Displaylabel.setText(result +"");
				temp2=0;
				break;
				
				
			default:
				Displaylabel.setText("Access Prohibited");		
			}
			}
		
		else if(e.getSource() == Plusbutton) {
			select=1;
			check = true;
			oldnum=Displaylabel.getText();
			temp=Float.parseFloat(oldnum);
			temp2=temp+temp2;}
			
		else if(e.getSource() == Subtractbutton) {
			select=2;
			check = true;
			oldnum=Displaylabel.getText();
			temp=Float.parseFloat(oldnum);
			temp2=temp+temp2;
				}			

		else if(e.getSource() == Multibutton){

			select=3;
			check = true;
			oldnum=Displaylabel.getText();
			temp=Float.parseFloat(oldnum);

			}
		else if(e.getSource() == Divisionbutton) {
			select=4;
			check = true;
			oldnum=Displaylabel.getText();
			}
		
			
		
	}
}
