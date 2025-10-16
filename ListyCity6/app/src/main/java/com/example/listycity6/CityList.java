package com.example.listycity6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * This class maintains a list of City objects and provides
 * methods to manage them.
 */
public class CityList {
    private List<City> cities = new ArrayList<>();

    /**
     * This adds a city to the list if it does not already exist.
     *
     * @param city This is the candidate city to add.
     */
    public void add(City city) {
        if (cities.contains(city)) {
            throw new IllegalArgumentException("City already exists");
        }
        cities.add(city);
    }

    /**
     * The original list order is preserved.
     * @return
     *      Returns a new, sorted list of cities.
     */
    public List<City> getCities() {
        List<City> list = cities;
        Collections.sort(list);
        return list;
    }

    /**
     * Deletes a city from the list.
     * If the city does not exist, an exception is thrown.
     * @param city
     */
    public void delete(City city){
        if (!cities.contains(city)){
            throw new IllegalArgumentException("City does not exist");
        }
        cities.remove(city);
    }

    /**
     * Checks if a city exists in the list.
     * @param city
     * @return
     *      Returns true if the city exists, false otherwise.
     */
    public boolean hasCity(City city){
        return cities.contains(city);
    }

    /**
     * Counts the number of cities in the list.
     * @return
     *      Returns the number of cities in the list.
     */
    public int countCities(){
        return cities.size();
    }
}
