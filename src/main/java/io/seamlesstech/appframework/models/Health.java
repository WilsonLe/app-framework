package io.seamlesstech.appframework.models;

public class Health {

	private String status;

	public Health() {
		this.status = "healthy";
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
}