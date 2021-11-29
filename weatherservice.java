package com.tts.openweather.service;

import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.client.RestTemplate;

@Service
public class WeatherService {
    
@Value ("${api_key}")
private String apiKey;

public Response getForecast(String zipCode) {
    String url = "http://api.openweathermap.org/data/2.5/weather?zip=" + 
        zipCode + "&units=imperial&appid=" + apiKey;
    RestTemplate restTemplate = new RestTemplate();
    return restTemplate.getForObject(url, Response.class);
}
//added last remaining piece//    
    } catch (HttpClientErrorException ex) {
            Response response = new Response();
            response.setName("error");
            return response;
        }
    }

    // public Request getTopTen(String zipCode) {
    // }
}
}
