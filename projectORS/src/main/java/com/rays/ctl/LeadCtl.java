package com.rays.ctl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
import com.rays.dto.LeadDTO;
import com.rays.form.LeadForm;
import com.rays.service.LeadServiceInt;

@RestController
@RequestMapping(value = "Lead")
public class LeadCtl extends BaseCtl<LeadForm, LeadDTO, LeadServiceInt> {

}
