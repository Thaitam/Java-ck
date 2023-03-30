package pro10;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;

import pro09.cAss13Pro09_2174802010677;

public class cAss13Pro010_2174802010677 extends JFrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cAss13Pro010_2174802010677 obj = new cAss13Pro010_2174802010677();
		obj.setVisible(true);
	}
	
	public cAss13Pro010_2174802010677() {
		//thiet ke do hoa
		setTitle("Comes from Mars");
		setSize(600,500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(null);
		setLocationRelativeTo(null);
	}
	
	public void paint(Graphics g) {
		super.paint(g);
		g.setColor(Color.BLACK);
		g.drawOval(50, 50, 400, 400);
		g.drawOval(100, 100, 300, 300);
		g.drawOval(50, 230, 50, 50); 
		g.drawOval(74, 315, 50, 50); 
		g.drawOval(135, 374, 50, 50); 
		g.drawOval(225, 400, 50, 50); 
		g.drawOval(310, 378, 50, 50); 
		g.drawOval(225, 50, 50, 50); 
		g.drawOval(135, 76, 50, 50); 
		g.drawOval(72, 140, 50, 50); 
		g.drawOval(318, 78, 50, 50); 
		g.drawOval(400, 230, 50, 50); 
		g.drawOval(380, 143, 50, 50); 
		g.drawOval(374, 315, 50, 50); 
		g.drawLine(50, 256, 448, 256);
		g.drawLine(76, 154, 421, 354);
		g.drawLine(148, 80, 347, 423);
		g.drawLine(78, 353, 425, 158);
		g.drawLine(250, 50, 250, 450);
		g.drawLine(147, 422, 355, 84);
		g.drawLine(140, 418, 223, 281); 
		g.drawLine(156, 423, 240, 292);
		g.drawLine(82, 360, 223, 281); 
		g.drawLine(240, 450, 240, 292); 
		g.drawLine(276, 230, 365, 85); 
		g.drawLine(260, 220, 350, 77); 
		g.drawLine(260, 50, 260, 220); 
		g.drawLine(420, 151, 276, 230); 
		g.drawLine(432, 163, 292, 245); 
		g.drawLine(450, 245, 292, 245); 
		g.drawLine(450, 268, 300, 268); 
		g.drawLine(425, 340, 300, 268); 
		g.drawLine(413, 362, 292, 298); 
		g.drawLine(358, 418, 292, 298); 
		g.drawLine(335, 427, 262, 302); 
		g.drawLine(260, 450, 262, 302); 
		g.drawLine(50, 265, 200, 270); 
		g.drawLine(75, 345, 200, 270); 
		g.drawLine(50, 248, 200, 240);
		g.drawLine(70, 165, 200, 240); 
		g.drawLine(80, 140, 210, 215); 
		g.drawLine(140, 90, 210, 215); 
		g.drawLine(160, 75, 238, 195); 
		g.drawLine(240, 50, 238, 195); 
		g.drawString("Le Tran Thai Tam", 300, 50);
	
	}

}
