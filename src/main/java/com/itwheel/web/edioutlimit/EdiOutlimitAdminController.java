/*******************************************************************************
 * Copyright (c) 2005, 2014 springside.github.io
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 *******************************************************************************/
package com.itwheel.web.edioutlimit;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.itwheel.entity.EdiOutlimit;
import com.itwheel.service.account.EdiOutlimitService;

/**
 * 接口供应商及店仓过滤管理Controller.
 * 
 * @author laolu
 */
@Controller
@RequestMapping(value = "/admin/edioutlimit")
public class EdiOutlimitAdminController {

	@Autowired
	private EdiOutlimitService ediOutlimitService;

	@RequestMapping(method = RequestMethod.GET)
	public String list(Model model) {
		List<EdiOutlimit> ediOutlimits = ediOutlimitService.getAllEdiOutlimits();
		model.addAttribute("ediOutlimits", ediOutlimits);

		return "edioutlimit/adminEdiOutlimitList";
	}

	@RequestMapping(value = "create", method = RequestMethod.GET)
	public String createForm(Model model) {
		model.addAttribute("ediOutlimit", new EdiOutlimit());
		model.addAttribute("action", "create");
		model.addAttribute("allCustomers", this.ediOutlimitService.getAllCust());
		model.addAttribute("stores", this.ediOutlimitService.getStoresByCustCod("all"));
		return "edioutlimit/adminEdiOutlimitForm";
	}

	@RequestMapping(value = "create", method = RequestMethod.POST)
	public String create(@Valid @ModelAttribute("ediOutlimit") EdiOutlimit ediOutlimit, RedirectAttributes redirectAttributes) {
		ediOutlimitService.updateEdiOutlimit(ediOutlimit);
		redirectAttributes.addFlashAttribute("message", "创建接口供应商-店仓过滤成功");
		return "redirect:/admin/edioutlimit";
	}
	
	@RequestMapping(value = "update/{id}", method = RequestMethod.GET)
	public String updateForm(@PathVariable("id") Long id, Model model) {
		model.addAttribute("action", "update");
		model.addAttribute("ediOutlimit", ediOutlimitService.getEdiOutlimit(id));
		model.addAttribute("allCustomers", this.ediOutlimitService.getAllCust());
		
		EdiOutlimit ediOutlimit = (EdiOutlimit)model.asMap().get("ediOutlimit");
		String custCode = ediOutlimit.getCustomerCode();
		model.addAttribute("stores", this.ediOutlimitService.getStoresByCustCod(custCode));
		return "edioutlimit/adminEdiOutlimitForm";
	}

	@RequestMapping(value = "update", method = RequestMethod.POST)
	public String update(@Valid @ModelAttribute("ediOutlimit") EdiOutlimit ediOutlimit, RedirectAttributes redirectAttributes) {
		ediOutlimitService.updateEdiOutlimit(ediOutlimit);
		redirectAttributes.addFlashAttribute("message", "更新接口供应商-店仓过滤 " + ediOutlimit.getCustomerCode() + "-"+ediOutlimit.getStoreCode() + " 成功");
		return "redirect:/admin/edioutlimit";
	}

	@RequestMapping(value = "delete/{id}")
	public String delete(@PathVariable("id") Long id, RedirectAttributes redirectAttributes) {
		EdiOutlimit ediOutlimit = ediOutlimitService.getEdiOutlimit(id);
		ediOutlimitService.deleteEdiOutlimit(id);
		redirectAttributes.addFlashAttribute("message", "删除接口供应商-店仓过滤 " + ediOutlimit.getCustomerCode() + "-"+ediOutlimit.getStoreCode()  + " 成功");
		return "redirect:/admin/edioutlimit";
	}

	/**
	 * 所有RequestMapping方法调用前的Model准备方法, 实现Struts2 Preparable二次部分绑定的效果,先根据form的id从数据库查出User对象,再把Form提交的内容绑定到该对象上。
	 * 因为仅update()方法的form中有id属性，因此仅在update时实际执行.
	 */
	@ModelAttribute
	public void getEdiOutlimit(@RequestParam(value = "id", defaultValue = "-1") Long id, Model model) {
		if (id != -1) {
			model.addAttribute("ediOutlimit", ediOutlimitService.getEdiOutlimit(id));
		}
	}
}
