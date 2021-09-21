package com.example.weatherapp.api;

import com.example.weatherapp.entity.Wheather;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiManager {
    String BASE_URL = "http://dataservice.accuweather.com";
    @GET("/forecasts/v1/hourly/12hour/3353412?apikey=YC7NdVaqt7KEmk5zCrDRG0Vvh6BJpDTc&language=vi-vn&metric=true")
    Call<List<Wheather>> getHour();

    @GET("/forecasts/v1/daily/5day/3353412?apikey=YC7NdVaqt7KEmk5zCrDRG0Vvh6BJpDTc&language=vi-vn&metric=true")
    Call<List<Wheather>> getDay();
}
