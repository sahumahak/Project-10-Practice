package com.rays.ctl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
import com.rays.common.DropdownList;
import com.rays.common.ORSResponse;
import com.rays.dto.DoctorDTO;
import com.rays.dto.ProductDetailsDTO;
import com.rays.form.ProductDetailsForm;
import com.rays.service.ProductDetailsServiceInt;

@RestController
@RequestMapping(value = "ProductDetails")
public class ProductDetailsCtl extends BaseCtl<ProductDetailsForm, ProductDetailsDTO, ProductDetailsServiceInt>{

	@Autowired
	ProductDetailsServiceInt pService;

	@GetMapping("/preload")
	public ORSResponse preload() {
		System.out.println("inside preload Rahul");
		ORSResponse res = new ORSResponse(true);
		ProductDetailsDTO dto=new ProductDetailsDTO();
		List<DropdownList> list = pService.search(dto, userContext);
		res.addResult("pList", list);
		return res;
	}
}
