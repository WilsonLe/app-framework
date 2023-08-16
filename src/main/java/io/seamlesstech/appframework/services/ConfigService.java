package io.seamlesstech.appframework.services;

import io.seamlesstech.appframework.models.Config.Config;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Service;

@Service
public class ConfigService {
	private Config config;

	@PostConstruct
	public void init() {
		this.config = new Config();
	}

	public Config getConfig() {
		return config;
	}
}
