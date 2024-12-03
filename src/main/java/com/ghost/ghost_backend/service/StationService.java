package com.ghost.ghost_backend.service;

import com.ghost.ghost_backend.model.Station;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.ExchangeStrategies;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.List;


@Component
public class StationService {

    private final String BASE_URL = "https://data.ny.gov/resource/39hk-dx4f.json";
    private final WebClient stationClient;

    public StationService() {
        ExchangeStrategies strategies = ExchangeStrategies.builder()
                .codecs(configurer -> configurer.defaultCodecs().maxInMemorySize(5 * 1024 * 1024)) // 5MB limit
                .build();

        this.stationClient = WebClient.builder()
                .baseUrl(BASE_URL)
                .exchangeStrategies(strategies)
                .build();
    }

    public List<Station> getTestStations(){
     List<Station> list = stationClient.get()
             .uri("")
                .retrieve()
                .bodyToMono(new ParameterizedTypeReference<List<Station>>() {})
                .block();

        for (Station foo : list){
         System.out.println(foo.getStopName());
     }

        return list;
    }


}
