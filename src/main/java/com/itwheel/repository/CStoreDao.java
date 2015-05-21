/*******************************************************************************
 * Copyright (c) 2005, 2014 springside.github.io
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 *******************************************************************************/
package com.itwheel.repository;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.itwheel.entity.CStore;

public interface CStoreDao extends PagingAndSortingRepository<CStore, Long> {
	List<CStore> findByCustomerCode(String customerCode);
}
