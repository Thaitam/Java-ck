package baitap07;
import java.util.Arrays;
public class CacPhuongThucTienIch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//khai báo mảng có 5 phần tử
		
		
		int[] arr = {15, 5, 10, 20, 25};
		System.out.println("Gọi hàm toString để hiển thị mảng: ");
		//Chuyển mảng thành chuỗi
		System.out.println(Arrays.toString(arr));
		//Sắp xếp mảng
		Arrays.sort(arr);
		System.out.println("Sau khi gọi hàm soft");
		//Chuyển một mảng thành chuỗi(string)
		System.out.println(Arrays.toString(arr));
		
		//Tìm kiếm chỉ số của một giá trị trong mảng
		//Mảng phải được sắp xếp trước khi gọi hàm binarySearch
		int index = Arrays.binarySearch(arr, 10);
		if (index < 0) {
			System.out.println("Không tìm thấy giá trị");
		} else {
			System.out.println("Tìm thấy giá trị tại: "+index);
		}
		
		//gán giá trị 49 cho tất cả các phần tử trong chuỗi
		Arrays.fill(arr,49);
		
		System.out.println("Sau khi gọi hàm fill:");
		//Chuyển mảng thành chuỗi (string)
		System.out.println(Arrays.toString(arr));
		
	}

}
