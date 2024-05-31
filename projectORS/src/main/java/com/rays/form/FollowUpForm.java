package com.rays.form;

import java.util.Date;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.FollowUpDTO;

public class FollowUpForm extends BaseForm {
	
	@NotEmpty(message = "Patient is required")
	private String patient;
	
	@NotEmpty(message = "Doctor is required")
	private String doctor;

	@NotNull(message = "VisitDate is required")
	private Date visitdate;

	public Date getVisitdate() {
		return visitdate;
	}

	public void setVisitdate(Date visitdate) {
		this.visitdate = visitdate;
	}

	@NotEmpty(message = "Fees is required")
	private String fees;

	public String getPatient() {
		return patient;
	}

	public void setPatient(String patient) {
		this.patient = patient;
	}

	public String getDoctor() {
		return doctor;
	}

	public void setDoctor(String doctor) {
		this.doctor = doctor;
	}

	

	public String getFees() {
		return fees;
	}

	public void setFees(String fees) {
		this.fees = fees;
	} 
	
	@Override
	public BaseDTO getDto() {
		FollowUpDTO dto = initDTO(new FollowUpDTO());
		dto.setPatient(patient);
		dto.setDoctor(doctor);
		dto.setVisitdate(visitdate);
		dto.setFees(fees);
		return dto;
	}



}
