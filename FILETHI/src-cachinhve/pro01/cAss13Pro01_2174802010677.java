package pro01;
import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;

public class cAss13Pro01_2174802010677 extends JFrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cAss13Pro01_2174802010677 obj = new cAss13Pro01_2174802010677();
		obj.setVisible(true);
	}
	
	public cAss13Pro01_2174802010677() {
		//Thiet ke giao dien
		setTitle("Line and Arc");
		setSize(500,300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(null);
		setLocationRelativeTo(null);
	}
	
	public void paint(Graphics g) {
		super.paint(g);	//cây viết
		g.setColor(Color.BLUE);
		g.drawArc(50, 50, 150, 150, 270, 270);
		g.drawLine(50, 125, 200, 125);
		g.drawLine(125, 200, 125, 50);	
		g.drawString("Le Tran Thai Tam", 300, 50);
	}

}
