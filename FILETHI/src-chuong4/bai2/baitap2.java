package bai2;

import java.util.Scanner;

public class baitap2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String chuoi;
		
		int kytuinhoa = 0;
		int kytuthuong = 0;
		int kytuso = 0;
		System.out.println("Nhập vào một chuỗi: ");
		chuoi = sc.nextLine();
		
		for (int i = 0; i < chuoi.length(); i++) {
			var ch = chuoi.charAt(i);
			if (Character.isUpperCase(ch)) {
				kytuinhoa++;
			} else if (Character.isLowerCase(ch)) {
				kytuthuong++;
			} else if (Character.isDigit(ch)) {
				kytuso++;
			}
		}
		
		System.out.println("Số ký tự in hoa có trong chuỗi '"+chuoi+"' là: "+kytuinhoa);
		System.out.println("Số ký tự thường có trong chuỗi '"+chuoi+"' là: "+kytuthuong);
		System.out.println("Số ký tự là số có trong chuỗi '"+chuoi+"' là: "+kytuso);
	}

}
