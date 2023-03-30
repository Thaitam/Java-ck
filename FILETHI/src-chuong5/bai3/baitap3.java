package bai3;
import java.util.Scanner;

public class baitap3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String chuoi,s2;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Nhập vào s1: ");
		chuoi = sc.nextLine();
		String[] s1s = chuoi.split(" ");
		
		System.out.print("Nhập từ cần tra s2: ");
		s2 = sc.nextLine();
		
		int count = 0;
		for (String s1 : s1s) {
			if(s1.equals(s2)) {
				count++;
			}
		}
		System.out.println("Số lần xuất hiện từ '"+s2+"' trong chuỗi '"+chuoi+"' là "+count+" lần");
	}

}
