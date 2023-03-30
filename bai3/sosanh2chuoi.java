package bai3;

import java.util.Scanner;

public class sosanh2chuoi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s1,s2;
		
		System.out.print("Nhap mot chuoi s1: ");
		s1 = sc.nextLine();
		System.out.print("Nhap mot chuoi s2: ");
		s2 = sc.nextLine();
		
		int result = s1.compareTo(s2);
		if (result > 0) {
			System.out.println("Chuoi s1 lon hon chuoi s2");
		} else if (result < 0) {
			System.out.println("Chuoi s1 nho hon chuoi s2");
		} else if (result == 0) {
			System.out.println("Chuoi s1 bang chuoi s2");
		}
		
	}

}
