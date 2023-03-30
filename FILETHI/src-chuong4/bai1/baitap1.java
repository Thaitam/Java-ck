package bai1;

import java.util.Scanner;

public class baitap1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập chuỗi: ");
        String str = scanner.nextLine();

        System.out.print("Nhập ký tự để tìm: ");
        char ch = scanner.next().charAt(0);

        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                count++;
            }
        }

        System.out.println("Số lần xuất hiện của ký tự '" + ch + "' trong chuỗi '" + str + "' là: " + count +" lần" );
    }
}

