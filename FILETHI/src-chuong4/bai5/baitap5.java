package bai5;

import java.util.Scanner;

public class baitap5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String chuoi;
		
		
		System.out.print("Nhập vào một chuỗi: ");
		chuoi = sc.nextLine();
		
		
		String[] words = chuoi.split(" ");
		
		for (String word : words) {
			System.out.println(word);
		}
	}

}
