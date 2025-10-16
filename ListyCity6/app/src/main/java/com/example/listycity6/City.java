package com.example.listycity6;

import java.util.Objects; // Make sure to import this!

/**
 * This class defines a City object.
 */
public class City implements Comparable<City> {
    private String city;
    private String province;

    City(String city, String province) {
        this.city = city;
        this.province = province;
    }

    /**
     * Returns the city name.
     * @return
     *      Returns the city name.
     */
    String getCity(){
        return city;
    }

    /**
     * Returns the province name.
     * @return
     *      Returns the province name.
     */
    String getProvinceName(){
        return province;
    }

    /**
     * Compares this City to another City object based on their city names.
     * @param otherCity
     * @return
     *      Returns a negative integer, zero, or a positive integer as this City
     *      comes before, is the same as, or comes after
     */
    @Override
    public int compareTo(City otherCity) {
        return this.city.compareTo(otherCity.getCity());
    }

    /**
     * Compares this City to another object for equality.
     * Two cities are considered equal if they have the same city and province name.
     *
     * @param o The object to compare with.
     * @return true if the objects are equal, false otherwise.
     */
    @Override
    public boolean equals(Object o) {
        // 1. Check if it's the exact same object in memory
        if (this == o) return true;
        // 2. Check if the other object is null or of a different class
        if (o == null || getClass() != o.getClass()) return false;
        // 3. Cast the object and compare the fields (city and province)
        City city1 = (City) o;
        return Objects.equals(city, city1.city) &&
                Objects.equals(province, city1.province);
    }

    /**
     * Generates a hash code for a City object.
     * This is required whenever you override the equals() method.
     *
     * @return An integer hash code.
     */
    @Override
    public int hashCode() {
        return Objects.hash(city, province);
    }
}
