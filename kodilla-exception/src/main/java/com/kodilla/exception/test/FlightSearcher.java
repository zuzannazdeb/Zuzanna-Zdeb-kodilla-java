package com.kodilla.exception.test;

import java.util.HashMap;

public class FlightSearcher {
    public static boolean findFlight(Flight flight) throws RouteNotFoundException {
        HashMap<String, Boolean> airports = new HashMap<String, Boolean>();
        airports.put("EPWA",true);
        airports.put("EPKR",false);
        airports.put("EPRZ",true);

        return airports.entrySet().stream()
                .filter(airport -> airport.getKey().equals(flight.getArrivalAirport()))
                .map(airport -> airport.getValue())
                .findFirst()
                .orElseThrow(()->new RouteNotFoundException("Airport not found"));
    }

    public static void main(String[] args){
        Flight flight1 = new Flight("EPRZ", "EPRZ");
        Flight flight2 = new Flight("EPRJ", "EPRJ");

        try {
            findFlight(flight1);
            findFlight(flight2);
        }catch (RouteNotFoundException e){
            System.out.println("Airport not found");
        }
    }
}
