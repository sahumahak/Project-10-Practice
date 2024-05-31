package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.dto.OrderDTO;

@Repository
public class OrderDAOImpl extends BaseDAOImpl<OrderDTO> implements OrderDAOInt {

	@Override
	protected List<Predicate> getWhereClause(OrderDTO dto, CriteriaBuilder builder, Root<OrderDTO> qRoot) {
		List<Predicate> whereCondition = new ArrayList<Predicate>();

		if (!isEmptyString(dto.getOrderName())) {

			whereCondition.add(builder.like(qRoot.get("orderName"), dto.getOrderName() + "%"));
		}
		

		if (!isEmptyString(dto.getOrderAddress())) {

			whereCondition.add(builder.like(qRoot.get("orderAddress"), dto.getOrderAddress() + "%"));
		}
		
		if (!isEmptyString(dto.getOrderAmount())) {

			whereCondition.add(builder.like(qRoot.get("orderAmount"), dto.getOrderAmount() + "%"));
		}
		
		if (!isEmptyString(dto.getOrderQuantity())) {

			whereCondition.add(builder.like(qRoot.get("orderQuantity"), dto.getOrderQuantity() + "%"));
		}
		
		return whereCondition;
	}

	@Override
	public Class<OrderDTO> getDTOClass() {
		
		return OrderDTO.class;
	}

}
