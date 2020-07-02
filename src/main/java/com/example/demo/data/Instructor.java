package com.example.demo.data;

import java.util.List;

import javax.validation.constraints.Size;

/*
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
*/
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Document(collection = "instructor")
public class Instructor  {

    @Transient
    public static final String SEQUENCE_NAME = "users_sequence";

	@MongoId //@Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    //@Column(name = "id")
    private Long id;

    //@Column(name = "first_name")
    @Size(max = 50)
    private String firstName;

    //@Column(name = "last_name")
    private String lastName;

    //@Column(name = "email")
    private String email;
    @JsonManagedReference
    /*@OneToMany(mappedBy = "instructor", cascade = {
        CascadeType.ALL
    })*/
    @DBRef
    private List < Course > courses;

    public Instructor() {

    }

    public Instructor(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List < Course > getCourses() {
        return courses;
    }

    public void setCourses(List < Course > courses) {
        this.courses = courses;
    }
}