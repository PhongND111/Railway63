package com.vti.backend.datalayer;

import java.sql.SQLException;
import java.util.List;

import com.vti.entity.Manufacturer;
import com.vti.entity.Product;

public interface IProductRepository {

	List<Product> getListProducts() throws ClassNotFoundException, SQLException;

	Manufacturer showManufacturerByID(int idShow) throws ClassNotFoundException, SQLException;

	boolean deleteProductByID(int id) throws ClassNotFoundException, SQLException;

	Product showProductByID(int idShow) throws ClassNotFoundException, SQLException;

	boolean createProduct(Product product) throws ClassNotFoundException, SQLException;

	boolean isProductNameExists(String productName) throws ClassNotFoundException, SQLException;

}
