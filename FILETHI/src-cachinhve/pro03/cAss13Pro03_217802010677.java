package pro03;
import java.awt.Graphics;

import javax.swing.JFrame;

public class cAss13Pro03_217802010677 extends JFrame{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cAss13Pro03_217802010677 obj = new cAss13Pro03_217802010677();
		obj.setVisible(true);
	}
	
	public cAss13Pro03_217802010677() {
		setTitle("Four Corner");
		setSize(600,500);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public void paint(Graphics g) {
		
		g.drawArc(50, 50, 80, 80, 360, 360);
		g.drawLine(50, 90, 130, 90);
		g.drawLine(90, 130, 90, 50);
		
		g.drawArc(200, 50, 80, 80, 360, 360);
		g.drawLine(200, 90, 280, 90);
		g.drawLine(240,50,240,130);
		
		g.drawArc(50, 200, 80, 80, 360, 360);
		g.drawLine(50, 240, 130, 240);
		g.drawLine(90,280,90,200);
		
		g.drawArc(200, 200, 80, 80, 360, 360);
		g.drawLine(200, 240, 280, 240);
		g.drawLine(240, 280, 240, 200);
		
		g.drawLine(50, 165, 280, 165);
		g.drawLine(165, 280, 165, 50);
		
		
	}

}
