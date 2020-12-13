package com.karo.External.Weather.API.service;

import com.karo.External.Weather.API.model.WeatherDto;
import com.karo.External.Weather.API.webclient.weather.WeatherClient;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class WeatherService {

    private final WeatherClient weatherClient;

    /** Collect weather from external API method **/
    public WeatherDto getWeather() {
        return weatherClient.getWeatherForCity("lublin");
    }


}
