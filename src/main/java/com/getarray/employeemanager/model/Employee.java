package com.getarray.employeemanager.model;

import jakarta.persistence.*;

import java.io.Serializable;


// Serializable helps to store in different type of database application
@Entity // means this class can map to any database that we configured
public class Employee implements Serializable {
    @Id // primary key
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false) // not changeable
    private Long id; // primary key
    private String name;
    private String email;
    private String jobTitle;
    private String phoneNumber;
    private String imageUrl; // location of where we can read the image
    @Column(nullable = false, updatable = false) // not changeable
    private String employeeCode;

    public Employee() {}

    public Employee(String name, String email, String jobTitle, String phoneNumber, String imageUrl, String employeeCode){
        this.name = name;
        this.email = email;
        this.jobTitle = jobTitle;
        this.phoneNumber = phoneNumber;
        this.imageUrl = imageUrl;
        this.employeeCode = employeeCode;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getPhone() {
        return phoneNumber;
    }

    public void setPhone(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getEmployeeCode() {
        return employeeCode;
    }

    public void setEmployeeCode(String employeeCode) {
        this.employeeCode = employeeCode;
    }

    @Override
    public String toString() {
        return "Employee{"+
                ", id= "+id +
                ", name= "+ name+
                ", email= "+ email+
                ", job title= "+ jobTitle+
                ", phone number= "+ phoneNumber+
                ", image url= "+ imageUrl+ "}";

    }
}



