/*******************************************************************************
 * Copyright (c) 2005, 2014 springside.github.io
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 *******************************************************************************/
package com.itwheel.web.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.itwheel.entity.CStore;
import com.itwheel.service.account.EdiOutlimitService;

@Controller
@RequestMapping(value = "/api")
public class ApiListController {
	@Autowired
	private EdiOutlimitService ediOutlimitService;
	
	@RequestMapping(method = RequestMethod.GET)
	public String list() {
		return "api/list";
	}
	
	@ResponseBody
	@RequestMapping(value="/ccustomer")
	public Object getStoreListByCCustomerId(@RequestParam(value="ccustomer",defaultValue="all") String ccustomer) {
		
		System.out.println(ccustomer);
		List<CStore> StoreList = ediOutlimitService.getStoresByCustCod(ccustomer);
		
		StatusDto result = StatusDto.buildDataSuccessStatusDto();
		result.setData(StoreList);
		return result;
	}
}
