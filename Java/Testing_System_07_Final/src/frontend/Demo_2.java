package frontend;

import java.util.Scanner;

import utils.ScannerUtils;

public class Demo_2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// test nhập số nguyên
		System.out.println("Input your age");
		int age = ScannerUtils.inputInt();

		System.out.println("Input your class");
		int classname = ScannerUtils.inputInt();

		System.out.println("Your age: " + age);
		System.out.println("Your class: " + classname);

		// test nhập số nguyên dương
		System.out.println("Nhap so");
		int inputPositive = ScannerUtils.inputIntPositive();
		System.out.println("So nguyen duong vua nhap la: " + inputPositive);
	}
}
