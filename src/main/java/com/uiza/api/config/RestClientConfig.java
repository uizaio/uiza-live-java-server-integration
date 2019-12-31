package com.uiza.api.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.util.CollectionUtils;
import org.springframework.web.client.RestTemplate;

/**
 * Configuration file rest client.
 * 
 * @author vikas
 *
 */
@Configuration
public class RestClientConfig {
	
	@Autowired
	private RestTemplateHeaderModifierInterceptor restTemplateHeaderModifierInterceptor; 

	@Bean
	public RestTemplate restTemplate() {
		RestTemplate restTemplate = new RestTemplate();

		List<ClientHttpRequestInterceptor> interceptors = restTemplate.getInterceptors();
		if (CollectionUtils.isEmpty(interceptors)) {
			interceptors = new ArrayList<>();
		}
		interceptors.add(restTemplateHeaderModifierInterceptor);
		restTemplate.setInterceptors(interceptors);
		return restTemplate;
	}
}