package com.training.ms.cloud.limitsservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.training.ms.cloud.limitsservice.bean.Configuration;
import com.training.ms.cloud.limitsservice.bean.LimitConfiguration;

@RestController
public class LimitsConfigurationController {

	@Autowired
	private Configuration config;
	
	@GetMapping("/limits")
	public LimitConfiguration retrieveLimitFromConfiguration() {
		return new LimitConfiguration(config.getMaximum(), config.getMinimum());
	}
}
