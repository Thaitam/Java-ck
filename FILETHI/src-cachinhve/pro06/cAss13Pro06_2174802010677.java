package pro06;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JFrame;
public class cAss13Pro06_2174802010677 extends JFrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cAss13Pro06_2174802010677 obj = new cAss13Pro06_2174802010677();
		obj.setVisible(true);
	}
	
	public cAss13Pro06_2174802010677() {
		//thiet ke do hoa
		setTitle("The Clock");
		setSize(500,500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(null);
		setLocationRelativeTo(null);
	}
	public void paint(Graphics g) {
		
		
        
		g.drawArc(50, 50, 300, 300, 360, 360);
		g.drawArc(35, 35, 330, 330, 360, 360);
		g.drawLine(50, 200, 350, 200);
		g.drawLine(200, 350, 200, 50);
		g.drawLine(70, 270, 330, 130);
		g.drawLine(130,330,270,70);
		g.drawString("Lê Trần Thái Tâm", 50,50);
		g.drawLine(130,70,270,330);
		g.drawLine(330,270,70,130);
		g.setColor(Color.BLACK);
		g.drawArc(125, 125, 150, 150, 360, 360);
		g.setColor(Color.WHITE);
		g.fillOval(125, 125, 150, 150);
		
	}
	
}
