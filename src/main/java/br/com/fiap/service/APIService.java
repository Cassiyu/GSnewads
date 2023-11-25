package br.com.fiap.service;

import java.io.IOException;

import org.apache.http.HttpEntity;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import com.google.gson.Gson;

import br.com.fiap.model.API;


public class APIService {
	
	public APIService getNaves(String n) throws ClientProtocolException, IOException {

		APIService api = null;

        HttpGet request = new HttpGet("br.com.fiap.model.API" + n);

        CloseableHttpClient httpClient = HttpClientBuilder.create()
                .disableRedirectHandling()
                .build();

        CloseableHttpResponse response = httpClient.execute(request);

        HttpEntity entity = response.getEntity();

        if (entity != null) {
            String result = EntityUtils.toString(entity);
            Gson gson = new Gson();
            api = gson.fromJson(result, APIService.class);
        }
        return api;
    }

	

	public API getAPI(String na) {
		return null;
	}



	
}


