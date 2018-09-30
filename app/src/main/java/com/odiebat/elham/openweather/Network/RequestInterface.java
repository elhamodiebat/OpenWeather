package com.odiebat.elham.openweather.Network;


import com.odiebat.elham.openweather.Model.Android;
import com.odiebat.elham.openweather.Model.Example;
import com.odiebat.elham.openweather.Model.WeatherData;

import org.json.JSONArray;

import io.reactivex.Observable;
import java.util.List;

import retrofit2.http.GET;




public interface RequestInterface {
    @GET("forecast?q=amman,jo&appid=4788ee4ce9877888efd3ba241e06e19c")
    Observable<List<com.odiebat.elham.openweather.Model.List>> register();


}
