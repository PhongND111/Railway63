package frontend;

import java.util.Scanner;

public class Demo_20230110 {

	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
//		while (true) {
//			System.out.println("Chon so. 1: Cong. 2: Tru. 3: Nhan");
//			int chooseMenu = scanner.nextInt();
//			switch (chooseMenu) {
//			case 1:
//				sum();
//				break;
//			case 2:
//				minus();
//				break;
//			case 3:
//
//				break;
//
//			default:
//				break;
//			}
//		}

// Nhập liệu trong chương trình
// Tính tổng 2 số
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("Hay nhap vao 1 so");
//		int a = scanner.nextInt();
//		System.out.println("Ban vua nhap vao so: " + a);
//
//		Scanner scanner2 = new Scanner(System.in);
//		System.out.println("Hay nhap vao ten cua ban");
//		String nameString = scanner2.next();
//		System.out.println("Ten cua ban la: " + nameString);
//		sum();
//		minus();
//		System.out.println("Hay nhap vao 1 so");
//
//	int x1 = scanner.nextInt();System.out.println("Hay nhap vao 1 so");
//	int y1 = scanner.nextInt();
//
//	System.out.println("Ket qua phep cong la: "+
//
//	sum_ab(x1, y1));

		// print f
//		String aString = "Hallo";
//		int b = 55;
//		System.out.printf("Ten toi la %s, tuoi la %d", aString, b);
		System.out.println("+----------------- Menu ----------------+");
		System.out.printf("|%-39s|", "Helloo");
	}

	public static int sum_ab(int a, int b) {
		int result_sum = a + b;
		return result_sum;
	}

	// Viết hàm sum
	public static void sum() {
		// Phép công 2 số
		Scanner scanner = new Scanner(System.in);
		System.out.println("+---------Menu tinh tong----------+");
		System.out.println("Hay nhap vao 1 so");
		int x2 = scanner.nextInt();
		System.out.println("Hay nhap vao 1 so");
		int y2 = scanner.nextInt();
		int resultSum = x2 + y2;
		System.out.println("Tong 2 so la");
		System.out.println("Ket qua la" + resultSum);
//		scanner.close();
	}

	public static void minus() {
		// Phép trừ 2 số
		Scanner scanner = new Scanner(System.in);
		System.out.println("Hay nhap vao 1 so");
		int x = scanner.nextInt();
		System.out.println("Hay nhap vao 1 so");
		int y = scanner.nextInt();
		int resultMinus = x - y;
		System.out.println("Hieu 2 so la");
		System.out.println("Ket qua la" + resultMinus);
//		scanner.close();
	}
}
