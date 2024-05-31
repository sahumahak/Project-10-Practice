package com.rays.ctl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
import com.rays.common.BaseServiceInt;
import com.rays.dto.SalaryDTO;
import com.rays.form.SalaryForm;
import com.rays.service.SalaryServiceInt;

@RestController
@RequestMapping(value = "Salary")
public class SalaryCtl extends BaseCtl<SalaryForm, SalaryDTO, SalaryServiceInt>{

}
