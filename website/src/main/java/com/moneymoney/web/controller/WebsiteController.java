package com.moneymoney.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;


@Controller
public class WebsiteController {
	
	@Autowired
	private RestTemplate restTemplate;
	
	@RequestMapping("/home")
	public String depositForm() {
		return "home";
	}

	@RequestMapping("/depositForm")
	public String withdrawForm() {
		return "DepositForm";
	}
	

	
	@RequestMapping("/fundtransferForm")
	public String fundtransferForm() {
		return "FundTransferForm";
	}
	

}
