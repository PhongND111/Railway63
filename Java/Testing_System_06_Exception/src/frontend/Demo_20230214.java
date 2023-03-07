package frontend;

import java.util.Scanner;

import backend.ProgramBackend;

public class Demo_20230214 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap so thu 1");
		int aInput = scanner.nextInt();
		System.out.println("Nhap so thu 2");
		int bInput = scanner.nextInt();
//		int result = aInput / bInput;

		ProgramBackend programBackend = new ProgramBackend();
		int result = 0;
		try {
			result = programBackend.divide(aInput, bInput);
		} catch (Exception e) {
			System.out.println("Phep chia khong hop le");
		}

		try {
			programBackend.divide(1, 0);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Ket qua chia 2 so: " + result);
	}
}
