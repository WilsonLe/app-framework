package io.seamlesstech.appframework.services;

import io.seamlesstech.appframework.models.Health;
import org.springframework.stereotype.Service;

@Service
public class HealthService {
	public Health check() {
		return new Health();
	}
}
