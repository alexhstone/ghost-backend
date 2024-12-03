package com.ghost.ghost_backend.controller;

import com.ghost.ghost_backend.model.Station;
import com.ghost.ghost_backend.service.StationService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StationController {

    private final StationService stationService;

    public StationController(StationService stationService) {
        this.stationService = stationService;
    }
    @GetMapping("/stationTest")
    public List<Station> getStationTest(){
       return stationService.getTestStations();
    }


}
