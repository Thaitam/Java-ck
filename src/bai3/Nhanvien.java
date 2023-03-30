package bai3;


public class Nhanvien {
	public int manv;
	public String hovaten;
	public String diachi;
	public long sdt;
	public double luong;
	public static void main(String[] args) {
		Nhanvien nv1 = new Nhanvien();
		Nhanvien nv2 = new Nhanvien(23457);
		System.out.println("Ma1: "+nv1.manv);
		System.out.println("Ma2: "+nv2.manv);
	}
	
	Nhanvien(){
		this.manv = 12456;
	}
	
	Nhanvien(int id){
		this.manv = id;
	}
	
}
