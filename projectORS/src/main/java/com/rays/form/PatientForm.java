package com.rays.form;

import java.util.Date;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.PatientDTO;
import com.rays.dto.SalaryDTO;

public class PatientForm extends BaseForm{

	@NotEmpty(message = "Name is required")
	private String name;
	
	@NotNull(message = "Date is required")
	private Date dateofvisit;
	
	@NotEmpty(message = "Mobile is required")
	private String mobile;
	
	@NotEmpty(message = "Decease is required")
	private String decease;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDateofvisit() {
		return dateofvisit;
	}

	public void setDateofvisit(Date dateofvisit) {
		this.dateofvisit = dateofvisit;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getDecease() {
		return decease;
	}

	public void setDecease(String decease) {
		this.decease = decease;
	}
	
	@Override
	public BaseDTO getDto() {
		PatientDTO dto = initDTO(new PatientDTO());
		dto.setName(name);
		dto.setDateofvisit(dateofvisit);
		dto.setMobile(mobile);
		dto.setDecease(decease);
		return dto;
	
}
}