package com.manage.housing_complex_management_system.controller;


import com.manage.housing_complex_management_system.entity.residential.Apartment;
import com.manage.housing_complex_management_system.service.ApartmentService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping("/api/v1/apartment")
public class ApartmentController {

    @Autowired
    private ApartmentService apartmentService;

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public Apartment save(@RequestBody Apartment apartment) {
        return apartmentService.save(apartment);

    }
}


