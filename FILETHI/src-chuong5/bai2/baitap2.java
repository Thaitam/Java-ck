package bai2;
import java.util.Scanner;

public class baitap2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String chuoi;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Nhập vào một chuỗi: ");
		chuoi = sc.nextLine();
		StringBuilder builder = new StringBuilder(chuoi);
		
		System.out.println("Chuỗi đã nhập là: "+chuoi);
		System.out.println("Chuỗi sau khi đảo ngược: "+builder.reverse());
	}

}
