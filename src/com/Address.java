package com;

public class Address {
    private int index;
    private String country;
    private String city;
    private String street;
    private int house;
    private int apartment;

    public Address(int index, String country, String city, String street, int house, int apartment) {
        this.index = index;
        this.country = country;
        this.city = city;
        this.street = street;
        this.house = house;
        this.apartment = apartment;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setHouse(int house) {
        this.house = house;
    }

    public void setApartment(int apartment) {
        this.apartment = apartment;
    }

    public int getIndex() {
        return index;
    }

    public String getCountry() {
        return country;
    }

    public String getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }

    public int getHouse() {
        return house;
    }

    public int getApartment() {
        return apartment;
    }

    @Override
    public String toString() {
        return "Address {" +
                " index = " + index +
                ", country = '" + country + '\'' +
                ", city = '" + city + '\'' +
                ", street = '" + street + '\'' +
                ", house = " + house +
                ", apartment = " + apartment +
                " }";
    }
}
