package com.rays.dto;

import java.util.Date;
import java.util.LinkedHashMap;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "st_FollowUp")
public class FollowUpDTO extends BaseDTO{
	
	@Column(name = "PATIENT", length = 50)
	private String patient;
	
	@Column(name = "DOCTOR", length = 50)
	private String doctor;
	
	@Column(name = "VISITDATE")
	private Date visitdate;
	
	@Column(name = "FEES", length = 50)
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

	
	public Date getVisitdate() {
		return visitdate;
	}

	public void setVisitdate(Date visitdate) {
		this.visitdate = visitdate;
	}

	public String getFees() {
		return fees;
	}

	public void setFees(String fees) {
		this.fees = fees;
	}

	@Override
	public String getValue() {
		// TODO Auto-generated method stub
		return  doctor;
	}

	@Override
	public LinkedHashMap<String, String> orderBY() {
		LinkedHashMap<String, String> map = new LinkedHashMap<String, String>();
		map.put("patient", "asc");
		return map;
	}

	@Override
	public LinkedHashMap<String, Object> uniqueKeys() {
		LinkedHashMap<String, Object> map = new LinkedHashMap<String, Object>();
		map.put("patient", patient);
		return map;
	}

	@Override
	public String getUniqueKey() {
		// TODO Auto-generated method stub
		return "patient";
	}

	@Override
	public String getUniqueValue() {
		// TODO Auto-generated method stub
		return patient;
	}

	@Override
	public String getLabel() {
		// TODO Auto-generated method stub
		return "";
	}

}
