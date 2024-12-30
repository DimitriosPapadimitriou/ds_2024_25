package hua.ds_project.project.entities;

import jakarta.persistence.*;

@Entity
public class Estate {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Integer id;

    @Column
    private Integer squareMeters;

    @Column
    private String typeOfEstate;

    @Column
    private String address;

    @Column
    private String area;

    @Column
    private Integer ageOfConstruction;

    @Column
    private Integer duration;

    @Column
    private Integer price;

    @Column
    private String floor;

    @Column
    private Integer amountOfRooms;

    @Column
    private String typeOfHeating;

    @Column
    private Boolean parking;

    @Column
    private Boolean availability;

    @Column
    private String description;

    @Column
    private String lastUpdated;

    public Estate(Integer id, Integer squareMeters, String typeOfEstate, String address, String area, Integer ageOfConstruction, Integer duration, Integer price, String floor, Integer amountOfRooms, String typeOfHeating, Boolean parking, Boolean availability, String description, String lastUpdated) {
        this.id = id;
        this.squareMeters = squareMeters;
        this.typeOfEstate = typeOfEstate;
        this.address = address;
        this.area = area;
        this.ageOfConstruction = ageOfConstruction;
        this.duration = duration;
        this.price = price;
        this.floor = floor;
        this.amountOfRooms = amountOfRooms;
        this.typeOfHeating = typeOfHeating;
        this.parking = parking;
        this.availability = availability;
        this.description = description;
        this.lastUpdated = lastUpdated;
    }

    public Estate() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSquareMeters() {
        return squareMeters;
    }

    public void setSquareMeters(Integer squareMeters) {
        this.squareMeters = squareMeters;
    }

    public String getTypeOfEstate() {
        return typeOfEstate;
    }

    public void setTypeOfEstate(String typeOfEstate) {
        this.typeOfEstate = typeOfEstate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public Integer getAgeOfConstruction() {
        return ageOfConstruction;
    }

    public void setAgeOfConstruction(Integer ageOfConstruction) {
        this.ageOfConstruction = ageOfConstruction;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getFloor() {
        return floor;
    }

    public void setFloor(String floor) {
        this.floor = floor;
    }

    public Integer getAmountOfRooms() {
        return amountOfRooms;
    }

    public void setAmountOfRooms(Integer amountOfRooms) {
        this.amountOfRooms = amountOfRooms;
    }

    public String getTypeOfHeating() {
        return typeOfHeating;
    }

    public void setTypeOfHeating(String typeOfHeating) {
        this.typeOfHeating = typeOfHeating;
    }

    public Boolean getParking() {
        return parking;
    }

    public void setParking(Boolean parking) {
        this.parking = parking;
    }

    public Boolean getAvailability() {
        return availability;
    }

    public void setAvailability(Boolean availability) {
        this.availability = availability;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(String lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    @Override
    public String toString() {
        return "Estate{" +
                "id=" + id +
                ", squareMeters=" + squareMeters +
                ", typeOfEstate='" + typeOfEstate + '\'' +
                ", address='" + address + '\'' +
                ", area='" + area + '\'' +
                ", ageOfConstruction=" + ageOfConstruction +
                ", duration=" + duration +
                ", price=" + price +
                ", floor='" + floor + '\'' +
                ", amountOfRooms=" + amountOfRooms +
                ", typeOfHeating='" + typeOfHeating + '\'' +
                ", parking=" + parking +
                ", availability=" + availability +
                ", description='" + description + '\'' +
                ", lastUpdated='" + lastUpdated + '\'' +
                '}';
    }
}
