package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.common.BaseDTO;
import com.rays.dto.ProductDetailsDTO;

@Repository
public class ProductDetailsDAOImpl extends BaseDAOImpl<ProductDetailsDTO> implements ProductDetailsDAOInt {

	@Override
	protected List<Predicate> getWhereClause(ProductDetailsDTO dto, CriteriaBuilder builder,
			Root<ProductDetailsDTO> qRoot) {
		List<Predicate> whereCondition = new ArrayList<Predicate>();

		if (!isEmptyString(dto.getName())) {

			whereCondition.add(builder.like(qRoot.get("name"), dto.getName() + "%"));
		}

		if (isNotNull(dto.getDateofpurchase())) {

			whereCondition.add(builder.equal(qRoot.get("dateofpurchase"), dto.getDateofpurchase()));
		}

		if (!isEmptyString(dto.getDescription())) {

			whereCondition.add(builder.like(qRoot.get("description"), dto.getDescription() + "%"));
		}

		if (!isEmptyString(dto.getPrice())) {

			whereCondition.add(builder.like(qRoot.get("price"), dto.getPrice() + "%"));
		}
		if (!isEmptyString(dto.getCategory())) {

			whereCondition.add(builder.like(qRoot.get("category"), dto.getCategory() + "%"));
		}


		return whereCondition;

	}

	@Override
	public Class<ProductDetailsDTO> getDTOClass() {
		// TODO Auto-generated method stub
		return ProductDetailsDTO.class;
	}

}
