package entity;

import java.util.Objects;

public class User {

    private int id;
    private String name;
    public Address address;

    public User() {
    }

    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof User)) return false;
        User user = (User) obj;
        return getId() == user.getId() && Objects.equals(getName(), user.getName()) && Objects.equals(address,
                user.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), address);
    }

    @Override
    public String toString() {
        return "id= " + id + "\n" +
                "name= " + name + "\n" +
                "address= " + address + "\n";
    }
}
