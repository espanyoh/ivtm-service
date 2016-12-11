package com.ivtm.models;

public class Category {

	private String id;
	private String code;
	private String name;
	private String description;
	private String color;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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

	public String getColor() {return color;	}

	public void setColor(String color) {this.color = color;	}
}
