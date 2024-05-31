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
import com.rays.dto.FollowUpDTO;
import com.rays.dto.RoleDTO;
import com.rays.form.FollowUpForm;
import com.rays.service.DoctorServiceInt;
import com.rays.service.FollowUpServiceInt;
import com.rays.service.RoleServiceInt;

@RestController
@RequestMapping(value = "FollowUp")
public class FollowUpCtl extends BaseCtl<FollowUpForm, FollowUpDTO, FollowUpServiceInt>{
	
	
	@Autowired
	DoctorServiceInt doctorService = null;
	
	@GetMapping("/preload")
	public ORSResponse preload() {
		System.out.println("inside preload Rahul");
		ORSResponse res = new ORSResponse(true);
		DoctorDTO dto=new DoctorDTO();
		List<DropdownList> list = doctorService.search(dto, userContext);
		res.addResult("doctorList", list);
		return res;
	}

}
