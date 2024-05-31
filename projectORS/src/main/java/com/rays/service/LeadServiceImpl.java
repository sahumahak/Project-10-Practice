package com.rays.service;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.rays.common.BaseServiceImpl;
import com.rays.dao.LeadDAOInt;
import com.rays.dto.LeadDTO;

@Service
@Transactional
public class LeadServiceImpl extends BaseServiceImpl<LeadDTO, LeadDAOInt>implements LeadServiceInt{

}
