package baitap12;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class bai12 extends JFrame {
	int R = 230;
	int x = 250;
	int y = 250;
	int R1 = 150;
	int x1 = 290;
	int y1 = 290;
	JButton btIN = new JButton("Zoom in");
	JButton btOut = new JButton("Zoom out");
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bai12 obj = new bai12();
		obj.setVisible(true);
		obj.ZoomIN();
		obj.ZoomOUT();
	}
	
	public bai12() {
		setTitle("Bai 12");
		setSize(800,800);
		setLayout(null);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		add(btIN);
		add(btOut);
		btIN.setBounds(270,10,100,70);
		btOut.setBounds(380,10,100,70);
		
	}
	
	public void paint(Graphics g) {
		super.paint(g);
		g.setColor(Color.RED);
		g.fillOval(x,y,R,R);
		g.setColor(Color.white);
		g.fillOval(x1, y1, R1, R1);
		g.setColor(Color.black);
		g.drawString("LE TRAN THAI TAM", 340, 350);
	}
	
	public void ZoomIN() {
		btIN.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				R-=10;
				x+=5;
				y+=5;
				x1+=5;
				y1+=5;
				R1-=10;
				repaint();
			}
		});
	}
	public void ZoomOUT() {
		btOut.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				R+=10;
				x-=5;
				y-=5;
				x1-=5;
				y1-=5;
				R1+=10;
				repaint();
			}
		});
	}
}
