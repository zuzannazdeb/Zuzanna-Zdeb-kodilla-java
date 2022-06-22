package com.kodilla.testing.weather.stub;

import java.util.*;

public class WeatherForecast {
    private Temperatures temperatures;

    public WeatherForecast(Temperatures temperatures) {
        this.temperatures = temperatures;
    }

    public Map<String, Double> calculateForecast() {
        Map<String, Double> resultMap = new HashMap<>();

        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()) {
            resultMap.put(temperature.getKey(), temperature.getValue() + 1.0); // [1]
        }
        return resultMap;
    }

    public double weatherAverage(){
        double sum = 0;
        int iterationsNumber = 0;
        for(Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()){
            sum = sum + temperature.getValue();
            iterationsNumber++;
        }
        return sum/iterationsNumber;
    }

    public double weatherMedian(){

        List<Double> list = new ArrayList<Double>(temperatures.getTemperatures().values());
        Collections.sort(list);
        if(list.size()%2==0){
           return (list.get(list.size()/2) + list.get((list.size()/2)-1)) /2;
        }else{
           return (list.get((list.size()-1)/2));
        }
    }
}