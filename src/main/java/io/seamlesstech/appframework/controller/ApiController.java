package io.seamlesstech.appframework.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import io.seamlesstech.appframework.models.Health;
import io.seamlesstech.appframework.models.Config.Config;
import io.seamlesstech.appframework.services.ConfigService;
import io.seamlesstech.appframework.services.HealthService;

@RestController
public class ApiController {

	private final HealthService healthService;
	private final ConfigService configService;

	@Autowired
	public ApiController(HealthService healthService, ConfigService configService) {
		this.healthService = healthService;
		this.configService = configService;
	}

	@GetMapping("/")
	public String displayStatus() {
		return "Server is running";
	}

	@GetMapping("/api/health")
	public Health getHealthStatus() {
		return healthService.check();
	}

	@GetMapping("/api/config")
	public Config getConfig() {
		return configService.getConfig();
	}
}
