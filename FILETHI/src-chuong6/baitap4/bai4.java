package baitap4;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;

public class bai4 extends JFrame{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bai4 obj = new bai4();
		obj.setVisible(true);
	}
	
	public bai4() {
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
