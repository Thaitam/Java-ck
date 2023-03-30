package pro08;

import java.awt.BasicStroke;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JFrame;

public class cAss13Pro08_2174802010677 extends JFrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cAss13Pro08_2174802010677 obj = new cAss13Pro08_2174802010677();
		obj.setVisible(true);
	}
	
	public cAss13Pro08_2174802010677() {
		//thiet ke do hoa
		setTitle("I Am Computer");
		setSize(500,500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(null);
		setLocationRelativeTo(null);
	}
	
	public void paint(Graphics g) {
		
		super.paint(g);
		Graphics2D g2 = (Graphics2D) g;
		g2.setStroke(new BasicStroke(5));
		g.drawRoundRect(50, 50, 150, 180, 15, 15);
		g.drawRoundRect(70, 70, 110, 80, 20, 20);
		g.drawLine(100, 85, 100, 100); // duong ben trai con mat
		g.drawLine(150, 85, 150, 100); // duong ben phai con mat
		g.drawLine(125, 85, 125, 120); // duong thang o giua
		g.drawLine(115, 120, 125, 120); // duong ngang ngan ngay mui
		g.drawLine(110, 135, 130, 135); // duong ngang dai ngay mieng
		g.drawLine(103, 131, 105, 131); // duong ngang ngan ben trai mieng
		g.drawLine(134, 131, 136, 131); // duong ngang ngan ben phai mieng
		g.drawLine(70, 200, 80, 200); // duong ngang ngan ben duoi
		g.drawLine(137, 190, 180, 190); // duong ngang dai ben duoi
		g.drawRect(55, 230, 138, 20); // ve hcn o duoi cung
		g.drawString("Le Tran Thai Tam", 300, 50);
	}

}
