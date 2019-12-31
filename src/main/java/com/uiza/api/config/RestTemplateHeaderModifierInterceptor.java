package com.uiza.api.config;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpRequest;
import org.springframework.http.client.ClientHttpRequestExecution;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.stereotype.Component;

/**
 * Rest template header intercepter.
 * 
 * @author vikas
 *
 */
@Component
public class RestTemplateHeaderModifierInterceptor implements ClientHttpRequestInterceptor {

	@Value("${application.uiza.authorization-token}")
	private String token;
	
	@Override
	public ClientHttpResponse intercept(HttpRequest request, byte[] body, ClientHttpRequestExecution execution)
			throws IOException {
		request.getHeaders().set("Authorization", token);
		ClientHttpResponse response = execution.execute(request, body);
		return response;
	}
}
