package com.paris.backend.controller;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.validation.Valid;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.paris.backend.model.Menu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
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

	/**
	 * 加载左侧菜单
	 * @param request
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value="/findAllSys_res", method = RequestMethod.GET)
	public String findAllSys_res(WebRequest request)
	{
		List<Menu> record = basicInfoService.findAllSys_res();
		if(record.size()>0)
		{
			List<Menu> oneSys = new ArrayList<Menu>();
			for (Menu s :record)
			{
				if(s.getPar_id()==0)
				{
					oneSys.add(s);
				}
			}
			for (Menu s2: record) {
				for (Menu s1:oneSys)
				{
					if(s2.getPar_id()==s1.getId())
					{
						s1.addChild(s2);
					}
				}
			}
			GsonBuilder gsonBuilder= new GsonBuilder();
			gsonBuilder.excludeFieldsWithoutExposeAnnotation();  //使用@Expose 忽略字段
			gsonBuilder.serializeNulls();    //序列化空值
			Gson gson=gsonBuilder.create();
			String jsonRecord=null;
			jsonRecord=gson.toJson(oneSys==null?null:oneSys);
			System.out.println(jsonRecord);
			return jsonRecord;
		}
		return  null;
	}

	/***
	 * 工作区界面
	 * @return
	 */
	@RequestMapping(value="/wrapper", method = RequestMethod.GET)
	public ModelAndView getWrapper(){
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("index_v1");
		//response.addHeader("x-frame-options","SAMEORIGIN");
		return modelAndView;
	}
}