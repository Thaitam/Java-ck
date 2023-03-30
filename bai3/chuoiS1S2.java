package bai3;

import java.util.Scanner;

public class chuoiS1S2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String S1,s2;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Nhap vao mot chuoi: ");
		S1 = sc.nextLine();
		System.out.print("Nhap vao tu can tim: ");
		s2 = sc.nextLine();
		
		String[] chuoi = S1.split(" ");
		
		int count = 0;
		for (String s1 : chuoi) {
			if (s1.equals(s2)) {
				count++;
			}
		}
		System.out.println("so lan xuat hien tu '"+s2+"'trong chuoi '"+S1+"'la: '"+count+"' lan");
	}	

}
