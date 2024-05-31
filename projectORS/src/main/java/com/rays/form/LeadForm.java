package com.rays.form;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.persistence.Column;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.LeadDTO;
import com.rays.dto.SalaryDTO;

public class LeadForm extends BaseForm{

	@NotEmpty(message = "Name is Required")
	private String name;
	
	//@NotNull(message = "Date is Required")
	@Pattern(regexp = "^\\d{4}-\\d{2}-\\d{2}$", message = "Date format must be yyyy-MM-dd")
	private String date;
	
	@NotEmpty(message = "Mobile is Required")
	private String mobile;
	
	@NotEmpty(message = "Status is Required")
	private String status;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public LeadDTO getDate(String dateee) {
		LeadDTO dto = new LeadDTO();
		if(dateee != null) {
			System.out.println("date>>>>>>>>>>"+dto.getDate());
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		try {
			System.out.println("date>>>>>>===="+dateee);
			Date date = sdf.parse(dateee);
			dto.setDate(date);
			System.out.println("date>>>>>>>>>>"+date);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}else {
			System.out.println("dto is null");
		}
		return dto;
	}
	
	@Override
	public BaseDTO getDto() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		LeadDTO dto = initDTO(new LeadDTO());
		dto.setName(name);
		
		getDate(date);
		
		
		dto.setMobile(mobile);
		dto.setStatus(status);
		return dto;
}
}
