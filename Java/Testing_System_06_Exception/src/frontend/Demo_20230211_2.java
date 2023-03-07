package frontend;

public class Demo_20230211_2 {
	public static void main(String[] args) {
		System.out.println("Code 1");
		System.out.println("Code 2");
		int a = 10;
		int b = 2;
		String cString = "ABC";
		try {
			String dString = "abc";
			int i = Integer.parseInt(dString);
			System.out.println("Kết quả phép chia là: " + (a / b));

			System.out.println(cString.length());
		} catch (ArithmeticException e) {
			System.out.println("Không tính được");
			e.printStackTrace();
		} catch (NullPointerException e) {
			System.out.println("Chuỗi của bạn là chuỗi rỗng");
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("Một exception nào đó đã xảy ra");
			e.printStackTrace();
		}
		System.out.println("Code 3");
		System.out.println("Code 4");

	}
}
