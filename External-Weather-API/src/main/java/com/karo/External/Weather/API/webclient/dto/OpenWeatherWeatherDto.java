package com.karo.External.Weather.API.webclient.dto;

import lombok.Getter;

/** Conversion JSON into Object
 *  Fields are created according to incoming JSON from request **/

@Getter
public class OpenWeatherWeatherDto {
    private OpenWeatherMainDto main;
    private OpenWeatherWindDto wind;
}
