package com.uiza.api.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.uiza.api.dto.GetLiveEntityResponse;
import com.uiza.api.dto.LiveEntity;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/app/live/entities")
public class LiveEntityResource {

	@Autowired
	private RestTemplate restTemplate;

	@Value("${application.uiza.url}")
	private String ulzaUrl;

	@GetMapping
	public GetLiveEntityResponse getLiveEntities() {

		ResponseEntity<GetLiveEntityResponse> responseEntity = restTemplate.getForEntity(ulzaUrl,
				GetLiveEntityResponse.class);

		return responseEntity.getBody();
	}

	@GetMapping("/{id}")
	public LiveEntity getLiveEntities(@PathVariable String id) {

		ResponseEntity<LiveEntity> responseEntity = restTemplate.getForEntity(ulzaUrl + "/" + id, LiveEntity.class);

		return responseEntity.getBody();
	}

	@PostMapping
	public LiveEntity createLiveEntity(@RequestBody LiveEntity liveEntity) {

		ResponseEntity<LiveEntity> responseEntity = restTemplate.postForEntity(ulzaUrl, liveEntity, LiveEntity.class);

		return responseEntity.getBody();
	}

}
