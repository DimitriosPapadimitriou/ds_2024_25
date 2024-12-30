package hua.ds_project.project.entities;

import jakarta.persistence.*;

@Entity
public class ApplicationForView {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Integer applicationID;

    @Column
    private String date;

    @Column
    private String description;

    @Column
    private String dateOfVisit;

    @Column
    private Integer tenantID;

    @Column
    private Integer ownerID;

    public ApplicationForView(Integer applicationID, String date, String description, String dateOfVisit, Integer tenantID, Integer ownerID) {
        this.applicationID = applicationID;
        this.date = date;
        this.description = description;
        this.dateOfVisit = dateOfVisit;
        this.tenantID = tenantID;
        this.ownerID = ownerID;
    }

    public ApplicationForView() {
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

    public String getDateOfVisit() {
        return dateOfVisit;
    }

    public void setDateOfVisit(String dateOfVisit) {
        this.dateOfVisit = dateOfVisit;
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
        return "ApplicationForView{" +
                "applicationID=" + applicationID +
                ", date='" + date + '\'' +
                ", description='" + description + '\'' +
                ", dateOfVisit='" + dateOfVisit + '\'' +
                ", tenantID=" + tenantID +
                ", ownerID=" + ownerID +
                '}';
    }
}
