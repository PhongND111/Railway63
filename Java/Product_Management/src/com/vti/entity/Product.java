package com.vti.entity;

public class Product {
	private int id;
	private String name;
	private String price;
	private String info;
	private String detail;
	private int ratingstar;
	private String imageName;
	private int manufacturerId;
	private String manufacturerNameString;
	private int categoryId;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public int getRatingstar() {
		return ratingstar;
	}

	public void setRatingstar(int ratingstar) {
		this.ratingstar = ratingstar;
	}

	public String getImageName() {
		return imageName;
	}

	public String getManufacturerNameString() {
		return manufacturerNameString;
	}

	public void setManufacturerNameString(String manufacturerNameString) {
		this.manufacturerNameString = manufacturerNameString;
	}

	public void setImageName(String imageName) {
		this.imageName = imageName;
	}

	public int getManufacturerId() {
		return manufacturerId;
	}

	public void setManufacturerId(int manufacturerId) {
		this.manufacturerId = manufacturerId;
	}

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	public Product() {
		super();
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + ", info=" + info + ", detail=" + detail
				+ ", ratingstar=" + ratingstar + ", imageName=" + imageName + ", manufacturerId=" + manufacturerId
				+ ", manufacturerNameString=" + manufacturerNameString + ", categoryId=" + categoryId + "]";
	}

	public String showListProducts() {
		return "ID: " + id + "\n" + "Tên: " + name + "\n" + "Giá: " + price + "\n" + "Chi tiết sản phẩm: " + detail
				+ "\n" + "Số sao đánh giá: " + ratingstar + "\n" + "Nhà sản xuất: " + manufacturerNameString + "\n";

	}

}
