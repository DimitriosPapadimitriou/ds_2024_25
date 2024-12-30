package hua.ds_project.project.entities;

import jakarta.persistence.*;

@Entity
public class ApplicationOfRental {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Integer applicationID;

    @Column
    private String date;

    @Column
    private String description;

    @Column
    private String duration;

    @Column
    private Integer rent;

    @Column
    private Integer tenantID;

    @Column
    private Integer ownerID;

    public ApplicationOfRental(Integer applicationID, String date, String description, String duration, Integer rent, Integer tenantID, Integer ownerID) {
        this.applicationID = applicationID;
        this.date = date;
        this.description = description;
        this.duration = duration;
        this.rent = rent;
        this.tenantID = tenantID;
        this.ownerID = ownerID;
    }

    public ApplicationOfRental() {
    }

    public Integer getApplicationID() {
        return applicationID;
    }

    public void setApplicationID(Integer applicationID) {
        this.applicationID = applicationID;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public Integer getRent() {
        return rent;
    }

    public void setRent(Integer rent) {
        this.rent = rent;
    }

    public Integer getTenantID() {
        return tenantID;
    }

    public void setTenantID(Integer tenantID) {
        this.tenantID = tenantID;
    }

    public Integer getOwnerID() {
        return ownerID;
    }

    public void setOwnerID(Integer ownerID) {
        this.ownerID = ownerID;
    }

    @Override
    public String toString() {
        return "ApplicationOfRental{" +
                "applicationID=" + applicationID +
                ", date='" + date + '\'' +
                ", description='" + description + '\'' +
                ", duration='" + duration + '\'' +
                ", rent=" + rent +
                ", tenantID=" + tenantID +
                ", ownerID=" + ownerID +
                '}';
    }
}
