package bai5;

public class baitap5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String diem = "9.5;7.2;6.7#8.0;7.3;8.1#8.1;7.5;8.2";
		
		String[] diemNamHoc = diem.split("#");
		
		String[] monHoc = {"Toán", "Lý", "Hóa"};
		String[] namHoc = {"Lớp 10", "Lớp 11", "Lớp 12"};
		
		double[][] diemSo = new double[3][3];
		double[] diemTBMon = new double[3];
		double[] diemTBNam = new double[3];
		
		for (int i = 0; i < diemNamHoc.length; i++) {
			String[] diemMon = diemNamHoc[i].split(";");
			for (int j = 0; j < diemMon.length; j++) {
				diemSo[j][i] = Double.parseDouble(diemMon[j]);
				diemTBMon[j] += diemSo[j][i];
				diemTBNam[i] += diemSo[j][i];
			}
		}
		System.out.println("Điểm của từng môn học theo từng năm: ");
		for (int i = 0; i < monHoc.length; i++) {
			System.out.println(monHoc[i] + ": ");
			for (int j = 0; j < namHoc.length; j++) {
				System.out.println(namHoc[j]+ " - "+ diemSo[i][j] + " ");
			}
			System.out.println();
		}
		for (int i = 0; i < diemTBMon.length; i++) {
			diemTBMon[i] /= 3.0;
		}
		for (int i = 0; i < diemTBNam.length; i++) {
			diemTBNam[i] /= 3.0;
		}
		System.out.println("\nDiem trung binh tung mon:");
		for (int i = 0; i < monHoc.length; i++) {
		    double tongDiemMon = 0;
		    for (int j = 0; j < namHoc.length; j++) {
		        tongDiemMon += diemSo[i][j];
		    }
		    double diemTrungBinhMon = tongDiemMon / namHoc.length;
		    System.out.println(monHoc[i] + ": " + diemTrungBinhMon);
		}

		System.out.println("\nDiem trung binh tung nam hoc:");
		for (int i = 0; i < namHoc.length; i++) {
		    double tongDiemNam = 0;
		    for (int j = 0; j < monHoc.length; j++) {
		        tongDiemNam += diemSo[j][i];
		    }
		    double diemTrungBinhNam = tongDiemNam / monHoc.length;
		    System.out.println(namHoc[i] + ": " + diemTrungBinhNam);
		}
	}

}
