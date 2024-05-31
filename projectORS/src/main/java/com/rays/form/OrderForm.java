package com.rays.form;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.OrderDTO;

public class OrderForm extends BaseForm {

	@NotNull(message = "orderId is required")
	@Min(value = 1, message = "orderId is required")
	private long orderId;

	@NotEmpty(message = "OrderName is required")
	private String orderName;

	@NotEmpty(message = "OrderQuantity is required")
	private String orderQuantity;

	@NotEmpty(message = "OrderAddress is required")
	private String orderAddress;

	@NotEmpty(message = "OrderAmount is required")
	private String orderAmount;

	public long getOrderId() {
		return orderId;
	}

	public void setOrderId(long orderId) {
		this.orderId = orderId;
	}

	public String getOrderName() {
		return orderName;
	}

	public void setOrderName(String orderName) {
		this.orderName = orderName;
	}

	public String getOrderQuantity() {
		return orderQuantity;
	}

	public void setOrderQuantity(String orderQuantity) {
		this.orderQuantity = orderQuantity;
	}

	public String getOrderAddress() {
		return orderAddress;
	}

	public void setOrderAddress(String orderAddress) {
		this.orderAddress = orderAddress;
	}

	public String getOrderAmount() {
		return orderAmount;
	}

	public void setOrderAmount(String orderAmount) {
		this.orderAmount = orderAmount;
	}

	@Override
	public BaseDTO getDto() {
		OrderDTO dto = initDTO(new OrderDTO());
		dto.setOrderId(orderId);
		dto.setOrderName(orderName);
		dto.setOrderQuantity(orderQuantity);
		dto.setOrderAddress(orderAddress);
		dto.setOrderAmount(orderAmount);
		return dto;
	}

}
