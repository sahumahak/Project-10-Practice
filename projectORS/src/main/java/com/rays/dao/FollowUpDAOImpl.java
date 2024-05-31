package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.dto.FollowUpDTO;
import com.rays.service.FollowUpServiceInt;

@Repository
public class FollowUpDAOImpl extends BaseDAOImpl<FollowUpDTO> implements FollowUpDAOInt {

	@Override
	protected List<Predicate> getWhereClause(FollowUpDTO dto, CriteriaBuilder builder, Root<FollowUpDTO> qRoot) {
		// Create where conditions
		List<Predicate> whereCondition = new ArrayList<Predicate>();

		if (!isEmptyString(dto.getPatient())) {

			whereCondition.add(builder.like(qRoot.get("patient"), dto.getPatient() + "%"));
		}
		
		if (!isEmptyString(dto.getDoctor())) {

			whereCondition.add(builder.like(qRoot.get("doctor"), dto.getDoctor()+ "%"));
		}
		
		if (isNotNull(dto.getVisitdate())) {

			whereCondition.add(builder.equal(qRoot.get("visitdate"), dto.getVisitdate()));
		}
		
		if (!isEmptyString(dto.getFees())) {

			whereCondition.add(builder.like(qRoot.get("fees"), dto.getFees()+ "%"));
		}
		
		
		return whereCondition;

	}

	@Override
	public Class<FollowUpDTO> getDTOClass() {
		return FollowUpDTO.class;
	}

}
