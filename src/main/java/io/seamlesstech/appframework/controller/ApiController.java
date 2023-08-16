package io.seamlesstech.appframework.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import io.seamlesstech.appframework.models.Health;
import io.seamlesstech.appframework.services.HealthService;

@RestController
public class ApiController {

	private final HealthService healthService;

	@Autowired
	public ApiController(HealthService healthService) {
		this.healthService = healthService;
	}

	@GetMapping("/api/health")
	public Health getHealthStatus() {
		return healthService.check();
	}
}
