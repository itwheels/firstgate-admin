/*******************************************************************************
 * Copyright (c) 2005, 2014 springside.github.io
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 *******************************************************************************/
package com.itwheel.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.itwheel.entity.CCustomer;

public interface CCustomerDao extends PagingAndSortingRepository<CCustomer, Long> {
}
