package com.example.listcity;

import androidx.annotation.Nullable;

import java.util.Objects;

/**
 * This is a class that defines a City.
 */
public class City implements Comparable{
    private String city;
    private String province;
    City(String city, String province){
        this.city = city;
        this.province = province;
    }
    String getCityName(){
        return this.city;
    }
    String getProvinceName(){
        return this.province;
    }

    /**
     * Overridden method from the Comparable Interface
     * @param o
     *      City object
     * @return
     *      returns a negative value, 0, or a positive value depending on whether
     *      this.city will come before City o on the basis of city name
     */
    @Override
    public int compareTo(Object o) {
        City city = (City) o;
        return this.city.compareTo(city.getCityName()); // this.city refers to the city name
    }

    /**
     * Overridden method to see if the object and its fields are the same
     * @param o
     *      Object that will be compared to this City
     * @return
     *      true if object matches this city, false otherwise
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        City city1 = (City) o;
        return Objects.equals(city, city1.city) && Objects.equals(province, city1.province);
    }

    /**
     * Overridden method to generate a hashcode according to this objects' fields
     * @return
     *      a unique hashcode for this objects' fields
     */
    @Override
    public int hashCode() {
        return Objects.hash(city, province);
    }
}
