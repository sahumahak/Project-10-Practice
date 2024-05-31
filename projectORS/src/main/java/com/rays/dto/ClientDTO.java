package com.rays.dto;

import java.util.LinkedHashMap;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "st_Client")

public class ClientDTO extends BaseDTO {
	
	@Column(name = "NAME", length = 50)
	private String clientName;

	@Column(name = "ADDRESS", length = 50)
	private String clientAddress;

	@Column(name = "PHONE", length = 50)
	private String clientPhone;

	@Column(name = "PRIORITY_NAME", length = 20)
	private String priorityName = null;

	@Column(name = "PRIORITY_ID")
	private Long priorityId;
	
	

	public String getClientName() {
		return clientName;
	}

	public void setClientName(String clientName) {
		this.clientName = clientName;
	}

	public String getClientAddress() {
		return clientAddress;
	}

	public void setClientAddress(String clientAddress) {
		this.clientAddress = clientAddress;
	}

	public String getClientPhone() {
		return clientPhone;
	}

	public void setClientPhone(String clientPhone) {
		this.clientPhone = clientPhone;
	}

	public String getPriorityName() {
		return priorityName;
	}

	public void setPriorityName(String priorityName) {
		this.priorityName = priorityName;
	}

	public Long getPriorityId() {
		return priorityId;
	}

	public void setPriorityId(Long priorityId) {
		this.priorityId = priorityId;
	}

	@Override
	public LinkedHashMap<String, String> orderBY() {
		LinkedHashMap<String, String> map = new LinkedHashMap<String, String>();
		map.put("clientAddress", "asc");
		
		return map;
	}

	@Override
	public LinkedHashMap<String, Object> uniqueKeys() {
		LinkedHashMap<String, Object> map = new LinkedHashMap<String, Object>();
		map.put("clientName", clientName);
		return map;
	}

	

	@Override
	public String getUniqueKey() {
		return "clientName";
	}

	@Override
	public String getUniqueValue() {
		// TODO Auto-generated method stub
		return clientName;
	}

	@Override
	public String getLabel() {
		// TODO Auto-generated method stub
		return "clientName";
	}

	@Override
	public String getValue() {
		// TODO Auto-generated method stub
		return null;
	}
}