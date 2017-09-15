package com.paris.backend.controller;
import java.util.Arrays;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.ModelAndView;

import com.paris.backend.constants.OrganizationType;
import com.paris.backend.model.Organization;
import com.paris.backend.service.BasicInfoService;

@Controller
public class BasicInfoController {
	
	@Autowired
	private BasicInfoService basicInfoService;
	
	

	@RequestMapping(value="/organizations", method = RequestMethod.GET)
	public ModelAndView getOrganizations(){
		ModelAndView modelAndView = new ModelAndView();
		List<Organization> organizations=basicInfoService.findAllOrganization();
		//List<OrganizationType> organizationTypes = Arrays.asList(OrganizationType.values());
		modelAndView.addObject("organizations", organizations);
		//modelAndView.addObject("organizationTypes", organizationTypes);
		modelAndView.setViewName("organizations");
		return modelAndView;
	}

	@RequestMapping(value="/newOrganization", method = RequestMethod.GET)
	public ModelAndView newOrganization(){
		ModelAndView modelAndView = new ModelAndView();
		List<OrganizationType> organizationTypes = Arrays.asList(OrganizationType.values());
		modelAndView.addObject("organizationTypes", organizationTypes);

		Organization organization = new Organization();
		modelAndView.addObject("organization", organization);
		modelAndView.setViewName("newOrganization");
		return modelAndView;
	}
	
	@RequestMapping(value = "/newOrganization", method = RequestMethod.POST)
	public ModelAndView newOrganization(@Valid Organization organization, BindingResult bindingResult) {
		ModelAndView modelAndView = new ModelAndView();
		List<OrganizationType> organizationTypes = Arrays.asList(OrganizationType.values());
		modelAndView.addObject("organizationTypes", organizationTypes);
		if (bindingResult.hasErrors()) {
			modelAndView.setViewName("newOrganization");
		} else {

			basicInfoService.saveOrganization(organization);
			modelAndView.addObject("successMessage", "Organization has been added successfully");
			List<Organization> Organizations=basicInfoService.findAllOrganization();
			modelAndView.addObject("organizations", Organizations);
			modelAndView.setViewName("organizations");
			return modelAndView;
			
		}
		return modelAndView;
	}
	

	

}