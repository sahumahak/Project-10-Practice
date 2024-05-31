package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.dto.SalaryDTO;

@Repository
public class SalaryDAOImpl extends BaseDAOImpl<SalaryDTO> implements SalaryDAOInt {

	@Override
	protected List<Predicate> getWhereClause(SalaryDTO dto, CriteriaBuilder builder, Root<SalaryDTO> qRoot) {
		List<Predicate> whereCondition = new ArrayList<Predicate>();

		if (!isEmptyString(dto.getEmployee())){

			whereCondition.add(builder.like(qRoot.get("employee"), dto.getEmployee()+ "%"));
		}
		
	 	if (isNotNull(dto.getDate())) {

		whereCondition.add(builder.equal(qRoot.get("date"), dto.getDate()));
	}
	 	

	 	if (!isEmptyString(dto.getStatus())) {

		whereCondition.add(builder.equal(qRoot.get("status"), dto.getStatus()));
	}
	 	return whereCondition;
		
		
	}
	
	@Override
	public Class<SalaryDTO> getDTOClass() {
		// TODO Auto-generated method stub
		return SalaryDTO.class;
	}

}