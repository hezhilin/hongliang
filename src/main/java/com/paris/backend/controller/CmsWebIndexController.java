package com.paris.backend.controller;



import java.util.List;
import com.paris.backend.model.CmsCatalog;
import com.paris.backend.model.CmsNews;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class CmsWebIndexController {

	@RequestMapping(value={"/index"}, method = RequestMethod.GET)
	public ModelAndView index() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("index");
		return modelAndView;
	}

	@RequestMapping(value={"/newslist"}, method = RequestMethod.GET)
	public ModelAndView newslist() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("newslist");
		return modelAndView;
	}

	@RequestMapping(value={"/news"}, method = RequestMethod.GET)
	public ModelAndView news() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("news");
		return modelAndView;
	}
	@RequestMapping(value={"/caipanlist"}, method = RequestMethod.GET)
	public ModelAndView caipanlist() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("caipanlist");
		return modelAndView;
	}

}