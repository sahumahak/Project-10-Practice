package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.dto.DoctorDTO;

@Repository
public class DoctorDAOImpl extends BaseDAOImpl<DoctorDTO> implements DoctorDAOInt {

	@Override
	protected List<Predicate> getWhereClause(DoctorDTO dto, CriteriaBuilder builder, Root<DoctorDTO> qRoot) {
		List<Predicate> whereCondition = new ArrayList<Predicate>();

		if (!isEmptyString(dto.getName())) {

			whereCondition.add(builder.like(qRoot.get("name"), dto.getName() + "%"));
		}
		
		if (!isEmptyString(dto.getMobile())) {

			whereCondition.add(builder.like(qRoot.get("mobile"), dto.getMobile()+ "%"));
		}
		
		if (!isEmptyString(dto.getExpertise())) {

			whereCondition.add(builder.like(qRoot.get("expertise"), dto.getExpertise()+ "%"));
		}
		
		if (isNotNull(dto.getDateOfBirth())) {

			whereCondition.add(builder.equal(qRoot.get("dateOfBirth"), dto.getDateOfBirth()));
		}
		return whereCondition;
	}
	@Override
	public Class<DoctorDTO> getDTOClass() {
		return DoctorDTO.class ;
	}

}
