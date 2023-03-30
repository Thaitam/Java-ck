package bai7_2;
import bai7.hinhtron;
import bai7_2.*;

public class main {
	public static void main(String[] args) {
		hinhtron ht = new hinhtron(12);
		ht.tinhdientich();
		ht.tinhchuvi();
		
		float chuvi = ht.getchuvi();
		float dientich = ht.getdientich();
		
		System.out.println("Diện tích hình tròn là: "+ dientich);
		System.out.println("Chu vi hình tròn là: "+ chuvi);
	}
}
