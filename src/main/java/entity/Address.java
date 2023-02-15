package entity;

import java.util.Objects;

public class Address {

    private String city;
    private String street;
    private String building;

    public Address() {
    }

    public Address(String city, String street, String building) {
        this.city = city;
        this.street = street;
        this.building = building;

    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getBuilding() {
        return building;
    }

    public void setBuilding(String building) {
        this.building = building;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCity(), getStreet(), getBuilding());
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Address)) return false;
        Address address = (Address) obj;
        return Objects.equals(getCity(), address.getCity()) && Objects.equals(getStreet(), address.getStreet()) &&
                Objects.equals(getBuilding(), address.getBuilding());
    }

    @Override
    public String toString() {
        return "city= " + city + "\n" +
                "street= " + street + "\n" +
                "building= " + building;
    }
}
