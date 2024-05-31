package com.rays.form;

import java.util.Date;

import javax.persistence.Column;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes;
import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.OrderDTO;
import com.rays.dto.SalaryDTO;

public class SalaryForm extends BaseForm {

	@NotEmpty(message = "EmployeeName is required")
	private String employee;

	@NotEmpty(message = "Amount is required")
	private String amount;

	@NotNull(message = "Date is required")
	@JsonFormat(shape = JsonFormat.Shape.STRING,pattern = "dd-MM-yyyy")
	private Date date;

	@NotEmpty(message = "Status is required")
	private String status;

	

	public String getEmployee() {
		return employee;
	}

	public void setEmployee(String employee) {
		this.employee = employee;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public BaseDTO getDto() {
		SalaryDTO dto = initDTO(new SalaryDTO());
		dto.setEmployee(employee);
		dto.setAmount(amount);
		dto.setDate(date);
		dto.setStatus(status);
		return dto;
	}
	
}
