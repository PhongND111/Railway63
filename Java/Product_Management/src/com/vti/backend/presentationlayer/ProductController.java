package com.vti.backend.presentationlayer;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.vti.backend.businesslayer.IProductService;
import com.vti.backend.businesslayer.ProductService;
import com.vti.entity.Manufacturer;
import com.vti.entity.Product;

public class ProductController {

	private IProductService productService;

	public ProductController() throws FileNotFoundException, IOException {
		productService = new ProductService();
	}

	public List<Product> getListProducts() throws ClassNotFoundException, SQLException {
		List<Product> listProducts = productService.getListProducts();
		return listProducts;
	}

	public Manufacturer showManufacturerByID(int idShow) {
		try {
			return productService.showManufacturerByID(idShow);
		} catch (Exception e) {
			return null;
		}
	}

	public boolean deleteProductByID(int id) throws ClassNotFoundException, SQLException {
		return productService.deleteProductByID(id);
	}

	public Product showProductByID(int idShow) {
		try {
			return productService.showProductByID(idShow);
		} catch (Exception e) {
			return null;
		}
	}

	public boolean createProduct(Product product) throws ClassNotFoundException, SQLException {
		if (productService.createProduct(product)) {
			return true;
		} else {
			return false;
		}
	}

	public boolean isProductNameExists(String productName) throws ClassNotFoundException, SQLException {
		return productService.isProductNameExists(productName);
	}

}
