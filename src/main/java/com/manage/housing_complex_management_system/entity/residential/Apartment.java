package com.manage.housing_complex_management_system.entity.residential;

import jakarta.persistence.*;

@Entity
@Table
public class Apartment {

   // buraya resident ve blog numarası;

    private String apartmentNote;


    public String getApartmentNote() {
        return apartmentNote;
    }

    public void setApartmentNote(String apartmentNote) {
        this.apartmentNote = apartmentNote;
    }

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy=GenerationType.IDENTITY)

    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
