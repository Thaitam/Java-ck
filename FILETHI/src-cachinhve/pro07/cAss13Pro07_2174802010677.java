package pro07;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;

public class cAss13Pro07_2174802010677 extends JFrame {
	public static void main(String[] args) {
			// TODO Auto-generated method stub
			cAss13Pro07_2174802010677 wMain = new cAss13Pro07_2174802010677();
			wMain.setVisible(true);
	
		}
	public cAss13Pro07_2174802010677() {
		setTitle("Come Together");
		setSize(500,500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(null);
		setLocationRelativeTo(null);

	}
	
	public void paint(Graphics g) {
		super.paint(g);
		g.setColor(Color.BLACK);
		g.drawString("Le Tran Thai Tam", 300, 50);
		g.drawOval(50, 50, 400, 400); // hinh tron ngoai cung
		g.drawOval(50, 215, 80, 80); // hinh tron nho ben trai
		g.drawOval(370, 205, 80, 80); // hinh tron nho ben phai
		g.drawOval(185, 185, 130, 130); // hinh tron o giua
		g.drawOval(185, 50, 135, 135); // hinh tron ben tren 
		g.drawOval(185, 315, 135, 135); // hinh tron ben duoi
		g.drawOval(115, 50, 265, 265); // hinh tron bao quat 2 hinh tron trong o tren
		g.drawOval(119, 185, 265, 265); // hinh tron bao quat 2 hinh tron trong o duoi
	}

	

}
