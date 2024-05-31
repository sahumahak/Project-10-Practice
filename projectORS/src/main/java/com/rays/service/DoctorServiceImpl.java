package com.rays.service;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rays.common.BaseServiceImpl;
import com.rays.common.UserContext;
import com.rays.dao.DoctorDAOInt;
import com.rays.dto.DoctorDTO;

@Service
@Transactional
public class DoctorServiceImpl extends BaseServiceImpl<DoctorDTO, DoctorDAOInt> implements DoctorServiceInt{

}
