package com.sathya.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sathya.iservice.IBrowserService;
import com.sathya.model.Browser;

@RestController
public class BroweserRestController {
	
	@Autowired
	private IBrowserService service;
	
	@PostMapping(value="/save")
	public String save(@RequestBody Browser b)
	{
		
		service.save(b);

		return"sucessfully inserte record";
	}

	@GetMapping("/get")
public  Browser findById(@RequestParam Integer id)
{
		Browser j=	service.getBYId(id);
		
		return j;
	
}
	@DeleteMapping("/delete")
	public String deleteById(@RequestParam Integer id)
	{
		service.delete(id);
		
		return "sucessfully deleted record";
	}
}
