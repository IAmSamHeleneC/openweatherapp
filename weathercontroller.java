package com.tts.openweather.controller;
import com.tts.weatherapp.service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

public class WeatherController {
   
    @Autowiredprovate 
    WeatherService weatherService; 

    @GetMapping("/")
    public String getIndex(Model Model)
    Response response = weatherService.getForecast ("4328")
    model.addAttribute("data", response) 
}
