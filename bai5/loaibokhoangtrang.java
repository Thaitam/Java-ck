package bai5;

public class loaibokhoangtrang {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String chuoi = "Trong        dam gi dep        bang sen";
		String result = chuoi.trim().replaceAll("\\s+"," ");
		
		System.out.println("truoc khi xoa khoang trang: \n"+chuoi+"\n");
		
		System.out.println("sau khi xoa khoang trang: \n"+result);
	}

}
