package com.rays.form;

import java.util.Date;

import javax.persistence.Column;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.DoctorDTO;

public class DoctorForm extends BaseForm {


	@NotEmpty(message = "Name is required")
	private String name;

	@NotNull(message = "DateOfBirth is required")
	private Date dateOfBirth;

	@NotEmpty(message = "Mobile is required")
	private String mobile;

	@NotEmpty(message = "Expertise is required")
	private String expertise;

	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getExpertise() {
		return expertise;
	}

	public void setExpertise(String expertise) {
		this.expertise = expertise;
	}
	@Override
	public BaseDTO getDto() {
		DoctorDTO dto = initDTO(new DoctorDTO());
		dto.setId(id);
		dto.setName(name);
		dto.setDateOfBirth(dateOfBirth);
		dto.setMobile(mobile);
		dto.setExpertise(expertise);
		return dto;
		
	}	
	
}


