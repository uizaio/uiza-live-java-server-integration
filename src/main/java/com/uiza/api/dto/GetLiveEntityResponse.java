package com.uiza.api.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GetLiveEntityResponse {

	private List<LiveEntity> data;

	@JsonProperty("next_page_token")
	private String nextPageToken;

	public List<LiveEntity> getData() {
		return data;
	}

	public void setData(List<LiveEntity> data) {
		this.data = data;
	}

	public String getNextPageToken() {
		return nextPageToken;
	}

	public void setNextPageToken(String nextPageToken) {
		this.nextPageToken = nextPageToken;
	}

}
