package com.ghost.ghost_backend.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Station {

    @JsonProperty("gtfs_stop_id")
    private String gtfsStopId;

    @JsonProperty("station_id")
    private String stationId;

    @JsonProperty("complex_id")
    private String complexId;

    @JsonProperty("division")
    private String division;

    @JsonProperty("line")
    private String line;

    @JsonProperty("stop_name")
    private String stopName;

    @JsonProperty("borough")
    private String borough;

    @JsonProperty("cbd")
    private String cbd;

    @JsonProperty("daytime_routes")
    private String daytimeRoutes;

    @JsonProperty("structure")
    private String structure;

    @JsonProperty("gtfs_latitude")
    private String gtfsLatitude;

    @JsonProperty("gtfs_longitude")
    private String gtfsLongitude;

    @JsonProperty("north_direction_label")
    private String northDirectionLabel;

    @JsonProperty("south_direction_label")
    private String southDirectionLabel;

    @JsonProperty("ada")
    private String ada;

    @JsonProperty("ada_northbound")
    private String adaNorthbound;

    @JsonProperty("ada_southbound")
    private String adaSouthbound;

    @JsonProperty("georeference")
    private Georeference georeference;

    @JsonProperty(":@computed_region_yamh_8v7k")
    private String computedRegionYamh8v7k;

    @JsonProperty(":@computed_region_wbg7_3whc")
    private String computedRegionWbg73whc;

    @JsonProperty(":@computed_region_kjdx_g34t")
    private String computedRegionKjdxG34t;

    // Getters and Setters
    public String getGtfsStopId() {
        return gtfsStopId;
    }

    public void setGtfsStopId(String gtfsStopId) {
        this.gtfsStopId = gtfsStopId;
    }

    public String getStationId() {
        return stationId;
    }

    public void setStationId(String stationId) {
        this.stationId = stationId;
    }

    public String getComplexId() {
        return complexId;
    }

    public void setComplexId(String complexId) {
        this.complexId = complexId;
    }

    public String getDivision() {
        return division;
    }

    public void setDivision(String division) {
        this.division = division;
    }

    public String getLine() {
        return line;
    }

    public void setLine(String line) {
        this.line = line;
    }

    public String getStopName() {
        return stopName;
    }

    public void setStopName(String stopName) {
        this.stopName = stopName;
    }

    public String getBorough() {
        return borough;
    }

    public void setBorough(String borough) {
        this.borough = borough;
    }

    public String getCbd() {
        return cbd;
    }

    public void setCbd(String cbd) {
        this.cbd = cbd;
    }

    public String getDaytimeRoutes() {
        return daytimeRoutes;
    }

    public void setDaytimeRoutes(String daytimeRoutes) {
        this.daytimeRoutes = daytimeRoutes;
    }

    public String getStructure() {
        return structure;
    }

    public void setStructure(String structure) {
        this.structure = structure;
    }

    public String getGtfsLatitude() {
        return gtfsLatitude;
    }

    public void setGtfsLatitude(String gtfsLatitude) {
        this.gtfsLatitude = gtfsLatitude;
    }

    public String getGtfsLongitude() {
        return gtfsLongitude;
    }

    public void setGtfsLongitude(String gtfsLongitude) {
        this.gtfsLongitude = gtfsLongitude;
    }

    public String getNorthDirectionLabel() {
        return northDirectionLabel;
    }

    public void setNorthDirectionLabel(String northDirectionLabel) {
        this.northDirectionLabel = northDirectionLabel;
    }

    public String getSouthDirectionLabel() {
        return southDirectionLabel;
    }

    public void setSouthDirectionLabel(String southDirectionLabel) {
        this.southDirectionLabel = southDirectionLabel;
    }

    public String getAda() {
        return ada;
    }

    public void setAda(String ada) {
        this.ada = ada;
    }

    public String getAdaNorthbound() {
        return adaNorthbound;
    }

    public void setAdaNorthbound(String adaNorthbound) {
        this.adaNorthbound = adaNorthbound;
    }

    public String getAdaSouthbound() {
        return adaSouthbound;
    }

    public void setAdaSouthbound(String adaSouthbound) {
        this.adaSouthbound = adaSouthbound;
    }

    public Georeference getGeoreference() {
        return georeference;
    }

    public void setGeoreference(Georeference georeference) {
        this.georeference = georeference;
    }

    public String getComputedRegionYamh8v7k() {
        return computedRegionYamh8v7k;
    }

    public void setComputedRegionYamh8v7k(String computedRegionYamh8v7k) {
        this.computedRegionYamh8v7k = computedRegionYamh8v7k;
    }

    public String getComputedRegionWbg73whc() {
        return computedRegionWbg73whc;
    }

    public void setComputedRegionWbg73whc(String computedRegionWbg73whc) {
        this.computedRegionWbg73whc = computedRegionWbg73whc;
    }

    public String getComputedRegionKjdxG34t() {
        return computedRegionKjdxG34t;
    }

    public void setComputedRegionKjdxG34t(String computedRegionKjdxG34t) {
        this.computedRegionKjdxG34t = computedRegionKjdxG34t;
    }

    public static class Georeference {

        private String type;
        private double[] coordinates;

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public double[] getCoordinates() {
            return coordinates;
        }

        public void setCoordinates(double[] coordinates) {
            this.coordinates = coordinates;
        }
    }
}
