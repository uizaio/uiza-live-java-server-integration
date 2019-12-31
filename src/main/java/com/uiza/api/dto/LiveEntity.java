package com.uiza.api.dto;

import java.util.Map;

public class LiveEntity {

	private String id;

	private String name;

	private String description;

	private String region;

	private String status;

	private String created_at;

	private String updated_at;

	private Map<String, String> ingest;

	private Map<String, String> playback;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getCreated_at() {
		return created_at;
	}

	public void setCreated_at(String created_at) {
		this.created_at = created_at;
	}

	public String getUpdated_at() {
		return updated_at;
	}

	public void setUpdated_at(String updated_at) {
		this.updated_at = updated_at;
	}

	public Map<String, String> getIngest() {
		return ingest;
	}

	public void setIngest(Map<String, String> ingest) {
		this.ingest = ingest;
	}

	public Map<String, String> getPlayback() {
		return playback;
	}

	public void setPlayback(Map<String, String> playback) {
		this.playback = playback;
	}

}
