package bai2;

public class Nhanvien {
	public int manv;
	public String hovaten;
	public String diachi;
	public long sdt;
	public double luong;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Nhanvien nv = new Nhanvien();
		System.out.println("Ma: "+nv.manv);
		System.out.println("HovaTen: "+nv.hovaten);
		System.out.println("Dia Chi: "+nv.diachi);
		System.out.println("So dt: "+nv.sdt);
		System.out.println("Luong: "+nv.luong);
	}
	public Nhanvien(){
		this.manv = 214548;
		this.hovaten = "Nguyen Van A";
		this.diachi = "TpHCM";
		this.sdt = 0124212415;
		this.luong = 5000000;
	}

}
