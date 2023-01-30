package backend;

import java.util.Scanner;

public class Calculate {

	public static Scanner scanner = new Scanner(System.in);

	public void sum() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("+---------Menu tinh tong----------+");
		System.out.println("Hay nhap vao 1 so");
		int x2 = scanner.nextInt();
		System.out.println("Hay nhap vao 1 so");
		int y2 = scanner.nextInt();
		int resultSum = x2 + y2;
		System.out.println("Tong 2 so la: " + resultSum);

	}
}
