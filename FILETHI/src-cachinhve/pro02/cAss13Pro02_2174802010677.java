package pro02;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;

public class cAss13Pro02_2174802010677 extends JFrame{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cAss13Pro02_2174802010677 obj = new cAss13Pro02_2174802010677();
		obj.setVisible(true);
		
	}
	
	public cAss13Pro02_2174802010677() {
		//Thiet ke giao dien
		setTitle("Circe of Life");
		setSize(500,300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(null);
		setLocationRelativeTo(null);
	}
	
	public void paint(Graphics g) {
		g.setColor(Color.RED);
		g.fillOval(50, 50, 200, 200);
		g.setColor(Color.WHITE);
		g.fillOval(75, 75, 150, 150);		
	}

}
