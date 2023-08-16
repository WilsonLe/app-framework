package io.seamlesstech.appframework.models.Config;

import io.seamlesstech.appframework.models.Config.Collection.CollectionConfig;

public class Config {
	private CollectionConfig[] collections;

	public Config() {
		this.collections = new CollectionConfig[] {
				new CollectionConfig("users")
		};
	}

	public CollectionConfig[] getCollections() {
		return collections;
	}

	public void setCollections(CollectionConfig[] collections) {
		this.collections = collections;
	}
}
