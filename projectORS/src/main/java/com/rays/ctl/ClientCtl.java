package com.rays.ctl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
import com.rays.common.ORSResponse;
import com.rays.dto.ClientDTO;
import com.rays.form.ClientForm;
import com.rays.service.ClientServiceInt;

@RestController
@RequestMapping(value = "Client")
public class ClientCtl extends BaseCtl<ClientForm, ClientDTO, ClientServiceInt> {

	/*
	 * @Autowired PriorityServiceInt priorityService = null;
	 * 
	 * @GetMapping("/preload") public ORSResponse preload() {
	 * System.out.println("inside preload Kapil"); ORSResponse res = new
	 * ORSResponse(true); PriorityDTO dto= new PriorityDTO();
	 * //dto.setStatus(RoleDTO.ACTIVE); List<DropdownList> list =
	 * priorityService.search(dto, userContext); res.addResult("clientList", list);
	 * return res; }
	 */
	
}
