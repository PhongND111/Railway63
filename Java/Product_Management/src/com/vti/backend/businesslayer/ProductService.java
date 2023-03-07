package com.vti.backend.businesslayer;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.vti.backend.datalayer.IProductRepository;
import com.vti.backend.datalayer.ProductRepository;
import com.vti.entity.Manufacturer;
import com.vti.entity.Product;

public class ProductService implements IProductService {
	private IProductRepository productRepository;

	public ProductService() throws FileNotFoundException, IOException {
		productRepository = new ProductRepository();
	}

	@Override
	public List<Product> getListProducts() throws ClassNotFoundException, SQLException {
		List<Product> listProducts = productRepository.getListProducts();
		return listProducts;
	}

	@Override
	public Manufacturer showManufacturerByID(int idShow) throws ClassNotFoundException, SQLException {
		return productRepository.showManufacturerByID(idShow);
	}

	@Override
	public boolean deleteProductByID(int id) throws ClassNotFoundException, SQLException {
		return productRepository.deleteProductByID(id);
	}

	@Override
	public Product showProductByID(int idShow) throws ClassNotFoundException, SQLException {
		return productRepository.showProductByID(idShow);
	}

	@Override
	public boolean createProduct(Product product) throws ClassNotFoundException, SQLException {
		if (productRepository.createProduct(product)) {
			return true;
		} else {
		}
		return false;
	}

	@Override
	public boolean isProductNameExists(String productName) throws ClassNotFoundException, SQLException {
		return productRepository.isProductNameExists(productName);
	}

}
