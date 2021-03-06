package com.galaxy.mars.building.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

import com.galaxy.mars.building.service.BuildingService;

@Component
public class BuildingController {

	@Autowired
	BuildingService service;
	
	@RequestMapping(value = "index.do")
	public String setStairInfo() {
		service.setStair1();
		return "index.jsp";
	}
	

	
	@RequestMapping(value = "checkStair.do")
	public String checkStairCount() {
		
		service.checkStair();
		
		return "index2.jsp";
	}

	@RequestMapping(value = "page.do")
	public String page() {
		service.setStair1();
		
		return "page.jsp";
	}

}
