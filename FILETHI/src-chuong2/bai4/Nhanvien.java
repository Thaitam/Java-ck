package bai4;

public class Nhanvien {
	public int manv;
	public String hovaten;
	public String diachi;
	public long sdt;
	public double luong;
	
	
	Nhanvien(int id, String name,String address, long phone, double salary){
		this.manv = id;
		this.hovaten = name;
		this.diachi = address;
		this.sdt = phone;
		this.luong = salary;
	}
	
	void inthongtin(){
		System.out.println("Ma: "+this.manv);
		System.out.println("HovaTen: "+this.hovaten);
		System.out.println("Dia Chi: "+this.diachi);
		System.out.println("So dt: "+this.sdt);
		System.out.println("Luong: "+this.luong);
	}
	
	public static void main(String[] args) {
		Nhanvien nv = new Nhanvien(1234,"Nguyen Van B","Go Vap",012451234,500000);
		nv.inthongtin();
	}
	
}
