package com.manage.housing_complex_management_system.entity.residential;

import jakarta.persistence.*;
import org.springframework.lang.Nullable;

@Entity
@Table
public class Flat {

    /*
    @Enumerated(EnumType.ORDINAL)
    private NumberOfRooms numberOfRooms;
    */

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

   // buraya resident ve blog numarası;

    private String flatNote;
    //Residentler tcknden eklenebilir



    public String getFlatNote() {
        return flatNote;
    }

    public void setFlatNote(String apartmentNote) {
        this.flatNote = apartmentNote;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
