package com.ivtm.models;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Product {
	private String id;
	private String category;
	private String code;
	private String name;
	private String description;
	private Integer stock;
	private Integer otwNumber;
	private BigDecimal price;
	private BigDecimal cost;
	private Boolean isPreorder;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getStock() {
		return stock;
	}

	public void setStock(Integer stock) {
		this.stock = stock;
	}

	public Integer getOtwNumber() {
		return otwNumber;
	}

	public void setOtwNumber(Integer otwNumber) {
		this.otwNumber = otwNumber;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public BigDecimal getCost() {
		return cost;
	}

	public void setCost(BigDecimal cost) {
		this.cost = cost;
	}

	public Boolean getPreorder() {
		return isPreorder;
	}

	public void setPreorder(Boolean preorder) {
		isPreorder = preorder;
	}
}
