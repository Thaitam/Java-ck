package bai2;

import java.util.Scanner;

public class SanPham {
    String tenSp;
    double donGia;
    double giamGia;
    int namSX;
    

    public SanPham(String tensp,double dongia, double giamgia, int namsx) {
        tenSp = tensp;
        donGia = dongia;
        giamGia = giamgia;
        namSX = namsx;
    }
    
    public double getThueNhapKhau() {
        double giathue = donGia * 0.17;
        System.out.println("Gia sau thue: " + giathue);
        return giathue;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so san pham can nhap: ");
        int n = sc.nextInt();

        SanPham[] nSp = new SanPham[n];
        sc.nextLine();

        for (int i = 0; i < nSp.length; i++) {
            System.out.print("Nhap vao ten sp: ");
            String tensp = sc.nextLine();
            System.out.print("Nhap vao don gia sp: ");
            double dongia = sc.nextDouble();
            System.out.print("Nhap vao giam gia sp: ");
            double giamgia = sc.nextDouble();
            System.out.print("Nhap vao nam san xuat sp: ");
            int namsx = sc.nextInt();

            nSp[i] = new SanPham(tensp, dongia, giamgia, namsx);
            sc.nextLine();

        }
        System.out.println("Xuat Mang SP");
        for (int i = 0; i < nSp.length; i++) {
            System.out.println("ten sp: " + nSp[i].tenSp);
            System.out.println("don gia: " + nSp[i].donGia);
            System.out.println("gia giam: " + nSp[i].giamGia);
            System.out.println("nam san xuat: " + nSp[i].namSX);
            System.out.println("gia sau thue: " + nSp[i].getThueNhapKhau());
        }
    }
}
