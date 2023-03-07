package com.vti.frontend;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.vti.backend.presentationlayer.ProductController;
import com.vti.entity.Manufacturer;
import com.vti.entity.Product;
import com.vti.utils.ScannerUtils;

public class ProductFunction {

	private ProductController productController;

	public ProductFunction() throws FileNotFoundException, IOException {
		productController = new ProductController();
	}

	public void showProduct() throws ClassNotFoundException, SQLException {
		System.out.println("Danh sách sản phẩm");
		List<Product> listProducts = productController.getListProducts();

		for (Product product : listProducts) {
			System.out.println(product.showListProducts());
		}
	}

	public void showManufacturerByID() throws FileNotFoundException, IOException {
		System.out.println("Nhập ID của nhà sản xuất cần tìm");
		int idShow = ScannerUtils.inputIntPositive();
		ProductController productController = new ProductController();
		Manufacturer manufacturer = productController.showManufacturerByID(idShow);
		if (manufacturer != null) {
			System.out.println(manufacturer.toString());
		} else {
			System.out.println("Không có nhà sản xuất này trong hệ thống");
		}
	}

	public void updateProductByID() {
		System.out.println("Cập nhật tên của sản phẩm đang có");
	}

	public void createProduct() throws FileNotFoundException, IOException, ClassNotFoundException, SQLException {
		try {
			Product product = new Product();
			System.out.println("Thêm mới sản phẩm");
			System.out.println("Nhập ID");
			product.setId(ScannerUtils.inputIntPositive());
			System.out.println("Nhập tên sản phẩm");
			product.setName(ScannerUtils.inputString());
			System.out.println("Nhập giá sản phẩm");
			product.setPrice(ScannerUtils.inputString());
			System.out.println("Nhập thông tin sản phẩm");
			product.setInfo(ScannerUtils.inputString());
			System.out.println("Nhập chi tiết sản phẩm");
			product.setDetail(ScannerUtils.inputString());
			System.out.println("Nhập số sao đánh giá");
			product.setRatingstar(ScannerUtils.inputInt());
			System.out.println("Nhập image name");
			product.setImageName(ScannerUtils.inputString());
			System.out.println("Nhập ID nhà sản xuất");
			product.setManufacturerId(ScannerUtils.inputInt());
			System.out.println("Nhập id loại sản phẩm");
			product.setCategoryId(ScannerUtils.inputInt());

			ProductController productController = new ProductController();
			ProductFunction productFunction = new ProductFunction();
			if (productFunction.isProductNameExists(product.getName())) {
				System.out.println("Sản phẩm đã có tên trong hệ thống");
			} else {
				if (productController.createProduct(product)) {
					System.out.println("Tạo sản phẩm thành công");
				} else {
					System.out.println("Tạo sản phẩm không thành công");
				}
			}
		} catch (Exception e) {
			System.out.println("Đã có lỗi ở thông tin nhập vào.");
		}
	}

	public void checkEmail() {
		System.out.println("Chức năng kiểm tra Email");
	}

	public void deleteProductByID() throws ClassNotFoundException, FileNotFoundException, SQLException, IOException {
		int id = getID();
		if (productController.deleteProductByID(id)) {
			System.out.println("Xóa thành công");
		} else {
			System.out.println("Không xóa thành công");
		}
	}

	public void showProductByID() throws FileNotFoundException, IOException {
		System.out.println("Tìm kiếm sản phẩm theo ID");
		System.out.println("Nhập ID của sản phẩm cần tìm");
		int idShow = ScannerUtils.inputIntPositive();
		ProductController productController = new ProductController();
		Product product2 = productController.showProductByID(idShow);
		if (product2 != null) {
			System.out.println(product2.toString());
		} else {
			System.out.println("Không có sản phẩm này trong hệ thống");
		}
	}

	public int getID() throws ClassNotFoundException, SQLException, FileNotFoundException, IOException {
		ProductController productController = new ProductController();
		while (true) {
			System.out.println("Nhập ID của sản phẩm muốn xóa");
			int idDelete = ScannerUtils.inputIntPositive();
			Product productByID = productController.showProductByID(idDelete);
			if (productByID != null) {
				return idDelete;
			} else {
				System.out.println("ID vừa nhập không đúng. Mời nhập lại");
			}
		}
	}

	public boolean isProductNameExists(String productName)
			throws ClassNotFoundException, SQLException, FileNotFoundException, IOException {
		ProductController productController = new ProductController();
		if (productController.isProductNameExists(productName)) {
			return true;
		} else {
			return false;
		}

	}

}
