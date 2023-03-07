package frontend;

public class Demo_20230107 {

	public static void main(String[] args) {

// If else		
		int a = 4;
		if (a == 1) {
			System.out.println("Day la so 1");
		} else if (a == 2) {
			System.out.println("Day la so 2");
		} else {
			System.out.println("Day khong phai la so 1");
		}

		int b = 4;
		if (b == 1) {
			System.out.println("Day la so 1");
		} else {
			System.out.println("Day khong phai la so 1");
		}

// Cách viết theo toán tử tenery (toán tử ba ngôi)
// Dùng trong trường hợp chỉ có if và else
		int c = 1;
		System.out.println(c == 1 ? "Day la so 1" : "Day khong phai la so 1");

//Switch case
		System.out.println("----------------Switch case--------------");
		int d = 5;
		switch (d) {
		case 1:
			System.out.println("Day la 1");
			break;
		case 2:
			System.out.println("Day la 2");
			break;
		default:
			System.out.println("Day la " + d);
			break;
		}

// For
		System.out.println("----------------For--------------");
		for (int i = 1; i < 10; i++) {
			System.out.println(i);
		}

// Foreach
		System.out.println("----------------Foreach--------------");
		String[] nameRailway63 = { "A", "B", "C" };
		for (String nameStudent : nameRailway63) {
			System.out.println(nameStudent);
		}

// While
		System.out.println("----------------While--------------");
		int i = 1;
		while (i < 11) {
			System.out.println(i);
			i++;
		}

// Break
		System.out.println("----------------Break--------------");
		for (int j = 0; j < 10; j++) {
			if (j == 3) {
				break;
			}
			System.out.println(j);
		}

// Continue
		System.out.println("----------------Continue--------------");
		for (int j = 0; j < 10; j++) {
			if (j == 3) {
				continue;
			}
			System.out.println(j);
		}

	}

}
