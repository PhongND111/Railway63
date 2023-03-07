package backend;

public class ProgramBackend {
	public int divide(int a, int b) throws Exception {
//		try {
//			int resultDivide = a / b;
//			return resultDivide;
//		} catch (Exception e) {
//			System.out.println("Phep chia khong hop le");
//		}
//		return 0;
//
//		int resultDivide = a / b;
//		return resultDivide;
		try {
			int resultDivide = a / b;
			return resultDivide;
		} catch (Exception e) {
// không xử lý exception
			throw new Exception();
		}

	}
}
