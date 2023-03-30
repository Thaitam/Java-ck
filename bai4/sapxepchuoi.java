package bai4;

import java.util.Arrays;

public class sapxepchuoi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] cars = {"Honda", "MERCEDES", "Ford", "HUNDAI"};
		
		Arrays.sort(cars);
		System.out.println("Mang sau khi duoc sap xep:");
		for (String car: cars) {
			System.out.println(car);
		}
	}

}
