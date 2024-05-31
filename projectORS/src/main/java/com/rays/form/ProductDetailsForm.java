package com.rays.form;

import java.util.Date;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.ProductDetailsDTO;
import com.rays.dto.SalaryDTO;

public class ProductDetailsForm extends BaseForm{
	

	@NotEmpty(message = "Name is required")
	private String name;
	
	@NotEmpty(message = "Description is required")
	private String description;
	
	@NotEmpty(message = "Price is required")
	private String price;
	
	@NotNull(message = "DateOfPurchase is required")
	private Date dateofpurchase;
	
	@NotEmpty(message = "Category is required")
	private String category;

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

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public Date getDateofpurchase() {
		return dateofpurchase;
	}

	public void setDateofpurchase(Date dateofpurchase) {
		this.dateofpurchase = dateofpurchase;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}
	@Override
	public BaseDTO getDto() {
		ProductDetailsDTO dto = initDTO(new ProductDetailsDTO());
		dto.setName(name);
		dto.setDescription(description);
		dto.setPrice(price);
		dto.setDateofpurchase(dateofpurchase);
		dto.setCategory(category);
		return dto;
	}

	
}

