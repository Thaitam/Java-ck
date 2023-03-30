package baitap10;

public class Nhan2MaTran {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A[][] = {{1,2,3},{4,5,6},{7,8,9}};
		int B[][] = {{2,1,0},{9,0,5},{0,3,7}};
		
		int C[][] = new int[3][3];
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				for (int k = 0; k < 3; k++) {
					C[i][j] = C[i][j] + (A[i][k] * B[k][j]);
				}
			}
		}
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(C[i][j]+" ");
			}
			System.out.println();
		}
	}
}