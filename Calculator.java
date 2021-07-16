import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Calc {
	
	Calc(){
		
		JFrame jf=new JFrame("Calculator");
		jf.setSize(450,450);
		jf.setLocation(350, 80);
		jf.setLayout(null);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setVisible(true);
		
		JLabel Displaylabel=new JLabel("Sample Display");
		Displaylabel.setHorizontalAlignment(SwingConstants.RIGHT);
		Displaylabel.setBounds(20,20,440,50);
		Displaylabel.setBackground(Color.white);
		Displaylabel.setForeground(Color.black);
		Displaylabel.setOpaque(true);
		jf.add(Displaylabel);
		
		JButton Mcbutton = new JButton("MC");
		Mcbutton.setBounds(20,120,60,60);
		jf.add(Mcbutton);
		
		JButton Sevenbutton = new JButton("7");
		Sevenbutton.setBounds(100,120,60,60);
		jf.add(Sevenbutton);
		
		JButton Eightbutton = new JButton("8");
		Eightbutton.setBounds(180,120,60,60);
		jf.add(Eightbutton);
		
		JButton Ninebutton = new JButton("9");
		Ninebutton.setBounds(260,120,60,60);
		jf.add(Ninebutton);
		
		JButton Divisionbutton = new JButton("/");
		Divisionbutton.setBounds(340,120,60,60);
		jf.add(Divisionbutton);
		
		JButton Plusorminusbutton = new JButton("+/-");
		Plusorminusbutton.setBounds(20,190,60,60);
		jf.add(Plusorminusbutton);
		
		JButton Fourbutton = new JButton("4");
		Fourbutton.setBounds(100,190,60,60);
		jf.add(Fourbutton);
		
		JButton Fivebutton = new JButton("5");
		Fivebutton.setBounds(180,190,60,60);
		jf.add(Fivebutton);
		
		
		
		JButton Sixbutton = new JButton("6");
		Sixbutton.setBounds(260,190,60,60);
		jf.add(Sixbutton);
		
		JButton Multibutton = new JButton("X");
		Multibutton.setBounds(340,190,60,60);
		jf.add(Multibutton);
		
		
		JButton Cebutton = new JButton("CE");
		Cebutton.setBounds(20,260,60,60);
		jf.add(Cebutton);
		
		
		JButton Onebutton = new JButton("1");
		Onebutton.setBounds(100,260,60,60);
		jf.add(Onebutton);
		
		JButton Twobutton = new JButton("2");
		Twobutton.setBounds(180,260,60,60);
		jf.add(Twobutton);
		
		JButton Threebutton = new JButton("3");
		Threebutton.setBounds(260,260,60,60);
		jf.add(Threebutton);
		
		JButton Subtractbutton = new JButton("-");
		Subtractbutton.setBounds(340,260,60,60);
		jf.add(Subtractbutton);
		
		JButton Acbutton = new JButton("AC");
		Acbutton.setBounds(20,330,60,60);
		jf.add(Acbutton);
		
		JButton Zerobutton = new JButton("0");
		Zerobutton.setBounds(100,330,60,60);
		jf.add(Zerobutton);
		
		JButton Pointbutton = new JButton(".");
		Pointbutton.setBounds(180,330,60,60);
		jf.add(Pointbutton);
		
		JButton Equalbutton = new JButton("=");
		Equalbutton.setBounds(260,330,60,60);
		jf.add(Equalbutton);
		
		JButton Plusbutton = new JButton("+");
		Plusbutton.setBounds(340,330,60,60);
		jf.add(Plusbutton);
		
		
		
				
	}
	
	public static void main(String[] args) {
		
		/*Calc C=new Calc();*/
		
		new Calc();
	}

}
