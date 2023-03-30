package baitap2;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;

public class bai2 extends JFrame{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bai2 obj = new bai2();
		obj.setVisible(true);
		
	}
	
	public bai2() {
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
