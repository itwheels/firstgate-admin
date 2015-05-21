/*******************************************************************************
 * Copyright (c) 2005, 2014 springside.github.io
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 *******************************************************************************/
package com.itwheel.service.account;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import org.springside.modules.utils.Clock;

import com.itwheel.entity.CCustomer;
import com.itwheel.entity.CStore;
import com.itwheel.entity.EdiOutlimit;
import com.itwheel.repository.CCustomerDao;
import com.itwheel.repository.CStoreDao;
import com.itwheel.repository.EdiOutlimitDao;

/**
 * 用户管理类.
 * 
 * @author calvin
 */
// Spring Service Bean的标识.
@Component
@Transactional
public class EdiOutlimitService {

	private static Logger logger = LoggerFactory.getLogger(EdiOutlimitService.class);

	private EdiOutlimitDao ediOutlimitDao;
	private CCustomerDao cCustomerDao;
	private CStoreDao cStoreDao;

	private Clock clock = Clock.DEFAULT;

	
	public List<EdiOutlimit> getAllEdiOutlimits() {
		return (List<EdiOutlimit>) this.ediOutlimitDao.findAll();
	}

	public EdiOutlimit getEdiOutlimit(Long id) {
		return this.ediOutlimitDao.findOne(id);
	}

	public void updateEdiOutlimit(EdiOutlimit ediOutlimit) {
		this.ediOutlimitDao.save(ediOutlimit);
	}

	public void deleteEdiOutlimit(Long id) {
		this.ediOutlimitDao.delete(id);
	}
	
	public List<CCustomer> getAllCust() {
		List<CCustomer> custList = (List<CCustomer>)this.cCustomerDao.findAll();
		CCustomer all = new CCustomer();
		all.setCode("all");
		all.setName("all");
		all.setDescription("all");
		custList.add(all);
		return custList;
	}
	
	public List<CStore> getStoresByCustCod(String custCode) {
		CStore all = new CStore();
		all.setCode("all");
		all.setName("all");
		all.setDescription("all");
		List<CStore> storeList = new ArrayList<CStore>();
		storeList.add(all);
		if(StringUtils.isNotBlank(custCode) && !"all".equalsIgnoreCase(custCode)) {
			storeList.addAll((List<CStore>)this.cStoreDao.findByCustomerCode(custCode));
		}
		return storeList;
	}
	@Autowired
	public void setEdiOutlimitDao(EdiOutlimitDao ediOutlimitDao) {
		this.ediOutlimitDao = ediOutlimitDao;
	}

	@Autowired
	public void setcCustomerDao(CCustomerDao cCustomerDao) {
		this.cCustomerDao = cCustomerDao;
	}

	@Autowired
	public void setcStoreDao(CStoreDao cStoreDao) {
		this.cStoreDao = cStoreDao;
	}
	
	public void setClock(Clock clock) {
		this.clock = clock;
	}
}
