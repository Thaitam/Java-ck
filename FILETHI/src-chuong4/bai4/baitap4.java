package bai4;

import java.util.Scanner;

public class baitap4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String chuoi;
		
		System.out.print("Nhập vào một chuỗi: ");
		chuoi = sc.nextLine();
		
		int count = 0;
		for (int i = 0; i < chuoi.length(); i++) {
			if(chuoi.charAt(i) == ' ') {
				count++;
			}
		}
		System.out.println("Số lần khoảng trắng xuất hiện trong chuỗi '"+chuoi+"' là: "+count);
	}

}
