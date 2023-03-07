package com.vti.backend.datalayer;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.vti.entity.Manufacturer;
import com.vti.entity.Product;
import com.vti.utils.ScannerUtils;
import com.vti.utils.jdbcUltis;

public class ProductRepository implements IProductRepository {

	private jdbcUltis jdbc;
	ScannerUtils scannerUtils = new ScannerUtils();

	public ProductRepository() throws FileNotFoundException, IOException {
		jdbc = new jdbcUltis();
	}

	@Override
	public List<Product> getListProducts() throws ClassNotFoundException, SQLException {
		String sqlSelectString = "SELECT product.ProductID, product.ProductName, product.ProductPrice, product.ProductDetail, product.RatingStar, manufacturer.ManufacturerName FROM productmanagement.product INNER JOIN manufacturer ON product.ManufacturerId = manufacturer.ManufacturerId ORDER BY product.ProductID ASC;";
		ResultSet resultSet = jdbc.executeQuery(sqlSelectString);
		List<Product> listProducts = new ArrayList<>();
		while (resultSet.next()) {
			Product product = new Product();
			product.setId(resultSet.getInt(1));
			product.setName(resultSet.getString(2));
			product.setPrice(resultSet.getString(3));
			product.setDetail(resultSet.getString(4));
			product.setRatingstar(resultSet.getInt(5));
			product.setManufacturerNameString(resultSet.getString(6));
			listProducts.add(product);

		}
		return listProducts;
	}

	@Override
	public Manufacturer showManufacturerByID(int idShow) throws ClassNotFoundException, SQLException {
		String sqlString = "SELECT * FROM productmanagement.manufacturer WHERE ManufacturerId = ?;";
		PreparedStatement preparedStatement = jdbc.createPrepareStatement(sqlString);
		preparedStatement.setInt(1, idShow);
		ResultSet resultSet = preparedStatement.executeQuery();
		if (resultSet.next()) {
			Manufacturer manufacturer = new Manufacturer();
			manufacturer.setId(resultSet.getInt(1));
			manufacturer.setName(resultSet.getString(2));

			return manufacturer;
		} else {
			return null;
		}
	}

	@Override
	public boolean deleteProductByID(int id) throws ClassNotFoundException, SQLException {
		String sqlDeleteID = "DELETE FROM productmanagement.product WHERE ProductID = ?;";
		PreparedStatement preparedStatement = jdbc.createPrepareStatement(sqlDeleteID);
		preparedStatement.setInt(1, id);
		int result = preparedStatement.executeUpdate();
		if (result == 1) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public Product showProductByID(int idShow) throws ClassNotFoundException, SQLException {
		String sqlString = "SELECT * FROM productmanagement.product WHERE ProductID = ?;";
		PreparedStatement preparedStatement = jdbc.createPrepareStatement(sqlString);
		preparedStatement.setInt(1, idShow);
		ResultSet resultSet = preparedStatement.executeQuery();
		if (resultSet.next()) {
			Product product = new Product();
			return product;
		} else {
			return null;
		}
	}

	@Override
	public boolean createProduct(Product product) throws ClassNotFoundException, SQLException {
		String sqlString = "INSERT INTO productmanagement.product (ProductId, ProductName, ProductPrice, ProductInfo, ProductDetail, RatingStar, ProductImageName, ManufacturerId, CategoryId) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?);";
		PreparedStatement preparedStatement = jdbc.createPrepareStatement(sqlString);
		preparedStatement.setInt(1, product.getId());
		preparedStatement.setString(2, product.getName());
		preparedStatement.setString(3, product.getPrice());
		preparedStatement.setString(4, product.getInfo());
		preparedStatement.setString(5, product.getDetail());
		preparedStatement.setInt(6, product.getRatingstar());
		preparedStatement.setString(7, product.getImageName());
		preparedStatement.setInt(8, product.getManufacturerId());
		preparedStatement.setInt(9, product.getCategoryId());

		int result = preparedStatement.executeUpdate();
		if (result == 1) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public boolean isProductNameExists(String productName) throws ClassNotFoundException, SQLException {
		String sql = "SELECT * FROM productmanagement.product WHERE ProductName = ?;";
		PreparedStatement preStatement = jdbc.createPrepareStatement(sql);
		preStatement.setString(1, productName);
		ResultSet result = preStatement.executeQuery();

		if (result.next()) {
			jdbc.disConnection();
			return true;
		} else {
			jdbc.disConnection();
			return false;
		}
	}

}
