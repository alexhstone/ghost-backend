package com.ghost.ghost_backend.service;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestClient;

@Component
public class StationService {

    private final String BASE_URL = "https://data.ny.gov/resource/39hk-dx4f.json";
    private RestClient stationRC = RestClient.create();

    public StationService() {
    }

    public String getTestStations(){
      return stationRC.get().uri(BASE_URL).retrieve().body(String.class);
    }


}
