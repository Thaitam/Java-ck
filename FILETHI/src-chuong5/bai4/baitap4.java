package bai4;

public class baitap4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String chuoi = "Trong        dam gi dep        bang sen";
		String result = chuoi.trim().replaceAll("\\s+", " ");
		
		System.out.println(result);
	}

}
