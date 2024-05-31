package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.dto.LeadDTO;

@Repository
public class LeadDAOImpl extends BaseDAOImpl<LeadDTO> implements LeadDAOInt{

	@Override
	protected List<Predicate> getWhereClause(LeadDTO dto, CriteriaBuilder builder, Root<LeadDTO> qRoot) {
		List<Predicate> whereCondition = new ArrayList<Predicate>();
		System.out.println("lead date>>>>"+dto.getDate());
		if (!isEmptyString(dto.getName())){

			whereCondition.add(builder.like(qRoot.get("name"), dto.getName()+ "%"));
		}
		
	 	if (isNotNull(dto.getDate())) {
	 		System.out.println("lead date>>>>"+dto.getDate());

		whereCondition.add(builder.equal(qRoot.get("date"), dto.getDate()));
	}
	 	if (!isEmptyString(dto.getMobile())) {

			whereCondition.add(builder.equal(qRoot.get("mobile"), dto.getMobile()));
		}
	 	

	 	if (!isEmptyString(dto.getStatus())) {

		whereCondition.add(builder.like(qRoot.get("status"), dto.getStatus()+"%"));
	}
	 	return whereCondition;
		
	}

	@Override
	public Class<LeadDTO> getDTOClass() {
		// TODO Auto-generated method stub
		return LeadDTO.class;
	}

}
