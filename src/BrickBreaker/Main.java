package BrickBreaker;

import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame jf = new JFrame();
		Gameplay gp = new Gameplay();
		
		jf.setBounds(10,10,700,600);
		jf.setTitle("Brick Breaker");
		jf.setResizable(false);
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		jf.add(gp);


	}

}
