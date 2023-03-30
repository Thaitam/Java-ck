package bai5;

public class Nhanvien {
	public int manv;
	public String hovaten;
	public String diachi;
	public long sdt;
	public double luong;
	
	void inNhanVien(int id, String name,String address, long phone, double salary){
		System.out.println(this.manv = id);
		System.out.println(this.hovaten = name);
		System.out.println(this.diachi = address);
		System.out.println(this.sdt = phone);
		System.out.println(this.luong = salary);
	}
	
	public static void main(String[] args) {
		Nhanvien nv = new Nhanvien();
		nv.inNhanVien(1245, "NguyenVanB", "Tay Ninh", 01241541, 5000000);
	}
}
