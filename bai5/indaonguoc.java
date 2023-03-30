package bai5;

import java.util.Scanner;

public class indaonguoc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Nhap vap chuoi: ");
		String chuoi = sc.nextLine();
		
		StringBuilder builder = new StringBuilder(chuoi);
		
		System.out.println("chuoi da nhap: "+chuoi);
		System.out.println("chuoi sau khi dao nguoc: "+builder.reverse());
	}

}
