import javax.swing.JButton;
import javax.swing.JFrame;

public class Calc {
	
	Calc(){
		
		JFrame jf=new JFrame("Calculator");
		jf.setSize(500,600);
		jf.setLocation(350, 80);
		jf.setLayout(null);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton jb = new JButton("0");
		jb.setBounds(10,480,60,60);
		jf.add(jb);
		jf.setVisible(true);
		
				
	}
	
	public static void main(String[] args) {
		
		/*Calc C=new Calc();*/
		
		new Calc();
	}

}
