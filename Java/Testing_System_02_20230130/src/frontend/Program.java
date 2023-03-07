package frontend;

import java.util.Scanner;

import backend.Exercise1;

public class Program {
	public static void main(String[] args) {
		System.out.println("Chọn bài tập: 1 = Exercise 1");
		Scanner scanner = new Scanner(System.in);
		int in = scanner.nextInt();
		switch (in) {
		case 1:
			doExercise1();
			break;
		default:
			break;
		}
	}

	static void doExercise1() {
		System.out.println("Chọn câu hỏi: 1 = Question 1, 2 = Question 2");
		Exercise1 exercise1 = new Exercise1();
		Scanner scannerEx1 = new Scanner(System.in);
		int in = scannerEx1.nextInt();
		switch (in) {
		case 1:
			exercise1.question1();
			break;
		case 2:
			exercise1.question2();
			break;
		default:
			break;
		}
	}
}
