package pro04;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;

public class cAss13Pro04_2174802010677 extends JFrame{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cAss13Pro04_2174802010677 obj = new cAss13Pro04_2174802010677();
		obj.setVisible(true);
	}
	
	public cAss13Pro04_2174802010677() {
		setTitle("Eight Parts");
		setSize(600,500);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public void paint(Graphics g) {
		g.drawArc(50, 50, 300, 300, 360, 360);
		g.drawLine(50, 200, 350, 200);
		g.drawLine(200, 350, 200, 50);
		g.drawLine(90, 300, 310, 100);
		g.drawLine(100,90,300,310);
		g.setColor(Color.WHITE);
		g.fillOval(150, 150, 100, 100);
	}

}
