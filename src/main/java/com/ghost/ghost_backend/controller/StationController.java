package com.ghost.ghost_backend.controller;

import com.ghost.ghost_backend.service.StationService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StationController {

    private StationService stationService;

    public StationController(StationService stationService) {
        this.stationService = stationService;
    }

    @GetMapping("/stationTest")
    public String getStationTest(){
       return stationService.getTestStations();
    }



}
