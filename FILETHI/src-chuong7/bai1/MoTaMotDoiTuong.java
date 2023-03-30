package bai1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import org.json.simple.JSONObject;


public class MoTaMotDoiTuong extends JFrame {
	JLabel jblbook_id = new JLabel("Book_id: ");
	JLabel jbltitle = new JLabel("Title: ");
	JLabel jblprice = new JLabel("Price: ");
	
	JTextField jtfbook_id = new JTextField();
	JTextField jtftitle = new JTextField();
	JTextField jtfprice = new JTextField();
	
	JButton jbtJson = new JButton("JSON");
	JTextArea jtaArea = new JTextArea();
	
	//Taọ dao diện
	public MoTaMotDoiTuong() { 
		setTitle("Mô tả một đối tượng"); //tạo khung 
		setSize(800, 500);
		setLayout(null);
		setLocationRelativeTo(null);
		
		add(jblbook_id); //tạo key 
		add(jbltitle);
		add(jblprice);
		
		add(jtfbook_id); // tạo input 
		add(jtftitle);
		add(jtfprice);
		
		add(jbtJson);
		add(jtaArea);
		
		jblbook_id.setBounds(10, 20, 100, 30); //20+30 tự động thêm 10 = 60 
		jbltitle.setBounds(10, 60, 100, 30); //60+30 tự động thêm 10 =100
		jblprice.setBounds(10, 100, 100, 30);
		
		jtfbook_id.setBounds(110, 20, 200, 30); 
		jtftitle.setBounds(110, 60, 200, 30); 
		jtfprice.setBounds(110, 100, 200, 30);
		
		jbtJson.setBounds(140, 140, 100, 30);
		jtaArea.setBounds(10, 180, 750, 60);
		
		//lập trình cho nút JSON
		jbtJson.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JSONObject obj = new JSONObject();
				
				String id = jtfbook_id.getText().trim();
				obj.put("Book_id", id);
				
				String title = jtftitle.getText().trim();
				obj.put("title", title);
				
				String price = jtfprice.getText().trim();
				obj.put("price", price);
				
				jtaArea.setText(obj.toJSONString());
			}
		});
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MoTaMotDoiTuong wMain = new MoTaMotDoiTuong();
		wMain.setDefaultCloseOperation(EXIT_ON_CLOSE);
		wMain.setVisible(true);
	}

}
