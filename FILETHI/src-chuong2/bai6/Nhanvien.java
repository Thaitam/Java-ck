package bai6;

import java.util.Scanner;

public class Nhanvien {
	String name,address;
	int age;

	
	public Nhanvien(String ten, String diachi, int tuoi) {//contructor phương thức khởi tạo
		this.name = ten;
		this.address = diachi;
		this.age = tuoi;
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Nhanvien[] nVien = new Nhanvien[10];
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nhập vào mảng nhân viên: ");
		for (int i = 0; i < nVien.length; i++) {
			String ten = sc.nextLine();
			String diachi = sc.nextLine();
			int tuoi = sc.nextInt();
			
			nVien[i] = new Nhanvien(ten, diachi, tuoi);
			
			sc.nextLine();
		}
		System.out.println("Xuất mảng nhân viên: ");
		for (int i = 0; i < nVien.length; i++) {
			System.out.println(nVien[i].name +" "+nVien[i].address+" "+nVien[i].age);
		}
	}
	
}
