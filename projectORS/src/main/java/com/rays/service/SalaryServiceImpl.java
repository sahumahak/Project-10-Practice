package com.rays.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.rays.common.BaseServiceImpl;
import com.rays.common.UserContext;
import com.rays.dao.SalaryDAOInt;
import com.rays.dto.OrderDTO;
import com.rays.dto.SalaryDTO;

@Service
@Transactional
public class SalaryServiceImpl extends BaseServiceImpl<SalaryDTO, SalaryDAOInt> implements SalaryServiceInt {

	
	

}
