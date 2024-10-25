package com.example.listcity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/**
 * This is a class that keeps a list of city objects
 */
public class CityList {
    private List<City> cities = new ArrayList<>();

    /**
     * This adds a city to the list if the city does not exist
     * @param city
     * This is a candidate city to add
     */
    public void add(City city) {
        if (cities.contains(city)) {
            throw new IllegalArgumentException();
        }
        cities.add(city);
    }

    /**
     * Sorts the list of cities
     * @return
     *      returns the list sorted by city name
     */
    public List<City> getCities() {
        List<City> list = cities;
        Collections.sort(list);
        return list;
    }

    /**
     * Checks of a City is already in the list
     * @param city
     *      city object to look for duplicates of
     * @return
     *      True if city is in the list and false otherwise
     */
    public boolean hasCity(City city) { return cities.contains(city);}

    /**
     * Deletes a city from the list if it is present in the list
     * @param city
     *      city to be deleted from list
     */
    public void delete(City city) {
        if (!cities.contains(city)) {
            throw new IllegalArgumentException();
        }
        cities.remove(city);
    }

    /**
     *  return the count of cities in the cityList
     * @return
     *      the number of cities in the list
     */
    public int countCities() { return cities.size();}

}
