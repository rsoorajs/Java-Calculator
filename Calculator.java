import javax.swing.JButton;
import javax.swing.JFrame;

public class Calc {
	
	Calc(){
		
		JFrame jf=new JFrame();
		jf.setSize(500,600);
		jf.setLayout(null);
		
		
		JButton jb = new JButton("0");
		jb.setBounds(10,480,60,60);
		jf.add(jb);
		jf.setVisible(true);
		
				
	}
	
	public static void main(String[] args) {
		
		Calc C=new Calc();
	}

}
