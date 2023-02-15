package frontend;

public class Demo_20230211 {
	public static void main(String[] args) {
//		System.out.println(10 / 0);

// Các loại Exception
// ArimeticException: exception liên quan đến phép tính
// NullPointerException: exception liên quan đến các biến null 
		String aString = "Hermes";
		System.out.println("Số ký tự là: " + aString.length());

		String string = "1.3";
		int i = Integer.parseInt(string);
		System.out.println(i);
	}

}
