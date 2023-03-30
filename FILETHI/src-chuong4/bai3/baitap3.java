package bai3;

import java.util.Scanner;

public class baitap3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		String chuoi1, chuoi2;
		int result;
		
		System.out.print("Nhập vào chuỗi 1: ");
		chuoi1 = sc.nextLine();
		System.out.print("Nhập vào chuỗi 2: ");
		chuoi2 = sc.nextLine();
		
		result = chuoi1.compareTo(chuoi2);
		
		if (result == 0) {
			System.out.println("Chuỗi ký tự bằng nhau");
		} else if (result < 0) {
			System.out.println("Chuỗi 1 bé hơn chuỗi 2");
		} else if (result > 0) {
			System.out.println("Chuỗi 1 lớn hơn chuỗi 2");
		}
		
	}

}
