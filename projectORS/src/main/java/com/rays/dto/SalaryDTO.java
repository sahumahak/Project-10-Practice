package com.rays.dto;

import java.util.Date;
import java.util.LinkedHashMap;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "salary")
public class SalaryDTO extends BaseDTO{
	
	@Column(name = "EMPLOYEE_NAME", length = 50)
	private String employee;
	
	@Column(name = "AMOUNT", length = 50)
	private String amount;
	
	@Column(name = "DATE")
	private Date date;
	
	@Column(name = "STATUS", length = 50)
	private String status;

	
	public String getEmployee() {
		return employee;
	}

	

	public String getAmount() {
		return amount;
	}



	public void setAmount(String amount) {
		this.amount = amount;
	}



	public void setEmployee(String employee) {
		this.employee = employee;
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
	public String getValue() {
		// TODO Auto-generated method stub
		return employee;
	}
		@Override
		public LinkedHashMap<String, String> orderBY() {
			LinkedHashMap<String, String> map = new LinkedHashMap<String, String>();
			map.put("employee", "asc");
			return map;
		}

		@Override
		public LinkedHashMap<String, Object> uniqueKeys() {
			LinkedHashMap<String, Object> map = new LinkedHashMap<String, Object>();
			map.put("employee", employee);
			return map;
		}

		@Override
		public String getUniqueKey() {
			// TODO Auto-generated method stub
			return "employee";
		}

		@Override
		public String getUniqueValue() {
			// TODO Auto-generated method stub
			return employee;
		}

		@Override
		public String getLabel() {
			// TODO Auto-generated method stub
			return "";
		}

	}

