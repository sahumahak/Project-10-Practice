package com.rays.service;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.rays.common.BaseServiceImpl;
import com.rays.dao.ProductDetailsDAOInt;
import com.rays.dto.ProductDetailsDTO;

@Service
@Transactional
public class ProductDetailsServiceImpl extends BaseServiceImpl<ProductDetailsDTO, ProductDetailsDAOInt> implements ProductDetailsServiceInt{

}
