package com.vti.backend.businesslayer;

import java.sql.SQLException;
import java.util.List;

import com.vti.entity.Manufacturer;
import com.vti.entity.Product;

public interface IProductService {
	public List<Product> getListProducts() throws ClassNotFoundException, SQLException;

	public Manufacturer showManufacturerByID(int idShow) throws ClassNotFoundException, SQLException;

	public boolean deleteProductByID(int id) throws ClassNotFoundException, SQLException;

	public Product showProductByID(int idShow) throws ClassNotFoundException, SQLException;

	public boolean createProduct(Product product) throws ClassNotFoundException, SQLException;

	public boolean isProductNameExists(String productName) throws ClassNotFoundException, SQLException;

}
