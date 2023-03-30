package baitap08;

public class InCacPhanTuMangHaiChieu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
		//in mảng 2 chiều ra màn hình
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	

}
