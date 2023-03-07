package com.vti.frontend;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

import com.vti.utils.ScannerUtils;

public class Program {
	public static void main(String[] args)
			throws FileNotFoundException, IOException, ClassNotFoundException, SQLException {
		ProductFunction productFunction = new ProductFunction();
		while (true) {
			String leftAlignFormat = "| %-72s |%n";
			System.out.format("+--------------------------------------------------------------------------+%n");
			System.out.format("|                        MỜI BẠN CHỌN CHỨC NĂNG                            |%n");
			System.out.format("+--------------------------------------------------------------------------+%n");
			System.out.format(leftAlignFormat, "1. Tìm kiếm nhà sản xuất theo ID");
			System.out.format(leftAlignFormat, "2. Xem danh sách thông tin sản phẩm trên hệ thống");
			System.out.format(leftAlignFormat, "4. Xóa sản phẩm theo ID");
			System.out.format(leftAlignFormat, "5. Cập nhật tên của sản phẩm đang có");
			System.out.format(leftAlignFormat, "6. Thêm mới sản phẩm");
			System.out.format(leftAlignFormat, "7. Chức năng kiểm tra Email");
			System.out.format(leftAlignFormat, "8. Exit");
			System.out.format("+--------------------------------------------------------------------------+%n");
			int chooseMenu = ScannerUtils.inputIntPositive();
			switch (chooseMenu) {
			case 1:
				productFunction.showManufacturerByID();
				break;
			case 2:
				productFunction.showProduct();
				break;
			case 4:
				productFunction.deleteProductByID();
				break;
			case 5:
				productFunction.updateProductByID();
				break;
			case 6:
				productFunction.createProduct();
				break;
			case 7:
				productFunction.checkEmail();
				break;
			case 8:
				System.out.println("Kết thúc");
				return;
			default:
				System.out.println("Chọn lại 1 trong các số sau: 1, 2, 4, 5, 6, 7, 8.");
				break;
			}
		}
	}
}
