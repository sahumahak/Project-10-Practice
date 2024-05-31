package com.rays.form;

import javax.validation.constraints.NotEmpty;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.ClientDTO;

public class ClientForm extends BaseForm {
	
	@NotEmpty(message = "clientName is required")
	private String clientName;

	@NotEmpty(message = "clientAddress is required")
	private String clientAddress;

	@NotEmpty(message = "clientPhone is required")
	private String clientPhone;

	@NotEmpty(message = "priorityName is required")
	private String priorityName;

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
	public BaseDTO getDto() {
		ClientDTO dto = initDTO(new ClientDTO());
		dto.setId(id)
;
		dto.setClientName(clientName);
		dto.setClientAddress(clientAddress);
		dto.setClientPhone(clientPhone);
		dto.setPriorityName(priorityName);
		dto.setPriorityId(priorityId);
		return dto;
	}
}
