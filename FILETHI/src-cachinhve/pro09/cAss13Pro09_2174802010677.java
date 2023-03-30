package pro09;

import java.awt.BasicStroke;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JFrame;

import pro08.cAss13Pro08_2174802010677;

public class cAss13Pro09_2174802010677 extends JFrame{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cAss13Pro09_2174802010677 obj = new cAss13Pro09_2174802010677();
		obj.setVisible(true);
	}
	public cAss13Pro09_2174802010677() {
		//thiet ke do hoa
		setTitle("The Balancer");
		setSize(500,500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(null);
		setLocationRelativeTo(null);
	}
	public void paint(Graphics g) {
		super.paint(g);
		Graphics2D g2 = (Graphics2D) g;
		g2.setStroke(new BasicStroke(3));
		g.drawOval(50, 50, 200, 200);
		g.drawOval(150, 50, 200, 200);
		g.drawLine(198, 65, 110, 240);
		g.drawLine(110, 240, 290, 240);
		g.drawLine(198, 65, 290, 240);
		g.drawString("Le Tran Thai Tam", 300, 50);
	}
	
	
	
	

}
