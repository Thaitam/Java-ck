package pro05;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;

public class cAss13Pro05_2174802010677 extends JFrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cAss13Pro05_2174802010677 obj = new  cAss13Pro05_2174802010677();
		obj.setVisible(true);
	}
	
	public cAss13Pro05_2174802010677() {
		setTitle("Simple Graph");
		setSize(1000,500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(null);
		setLocationRelativeTo(null);
	}
	public void paint(Graphics g) {
		super.paint(g);
		g.setColor(Color.black);
		g.drawLine(50, 50, 50, 400);
		g.drawLine(50, 400, 700, 400);
		g.drawString("Bar Graph", 300, 65);
		g.drawString("Le Tran Thai Tam", 300, 55);
		g.setColor(Color.blue);
	    g.drawRect(100, 280, 100, 120);
	    g.drawRect(250, 240, 100, 160);
	    g.drawRect(400, 100, 100, 300);
	    g.drawRect(550, 160, 100, 240);
	    
	    g.setColor(Color.black);
	    g.drawString("120", 140, 420);
	    g.drawString("160", 295, 420);
	    g.drawString("300", 445, 420);
	    g.drawString("240", 595, 420);
	}

}
