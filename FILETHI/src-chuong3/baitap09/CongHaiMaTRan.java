package baitap09;

public class CongHaiMaTRan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][] = { { 1, 2, 4 }, { 3, 4, 5 } };
		int b[][] = { { 1, 3, 5 }, { 3, 3, 3 } };
		//tạo ma trận khác để lưu kết quả
		
		int c[][] = new int[2][3];
		
		for (int i = 0; i < 2; i++) {
			for(int j = 0; j < 3; j++) {
				c[i][j] = a[i][j] + b[i][j];
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
	
	}

}
