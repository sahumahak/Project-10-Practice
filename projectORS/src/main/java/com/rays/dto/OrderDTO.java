package com.rays.dto;

import java.util.LinkedHashMap;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "St_Order")
public class OrderDTO extends BaseDTO{
	
	@Column(name = "ORDER_ID",length = 50)
	private long orderId;
	
	@Column(name = "ORDER_NAME",length = 50)
	private String orderName;
	
	@Column(name = "ORDER_QUANTITY",length = 50)
	private String orderQuantity;
	
	@Column(name = "ORDER_ADDRESS",length = 50)
	private String orderAddress;
	
	@Column(name = "ORDER_AMOUNT",length = 50)
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
	public String getValue() {
		// TODO Auto-generated method stub
		return orderAddress;
	}


	@Override
	public LinkedHashMap<String, String> orderBY() {
		LinkedHashMap<String, String> map = new LinkedHashMap<String, String>();
		map.put("orderName", "asc");
		return map;
	}

	@Override
	public LinkedHashMap<String, Object> uniqueKeys() {
		LinkedHashMap<String, Object> map = new LinkedHashMap<String, Object>();
		map.put("orderName", orderName);
		return map;
	}

	@Override
	public String getUniqueKey() {
		// TODO Auto-generated method stub
		return "orderName";
	}

	@Override
	public String getUniqueValue() {
		// TODO Auto-generated method stub
		return orderName;
	}

	@Override
	public String getLabel() {
		// TODO Auto-generated method stub
		return "";
	}

}
