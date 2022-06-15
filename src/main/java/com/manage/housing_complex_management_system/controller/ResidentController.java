package com.manage.housing_complex_management_system.controller;

import com.manage.housing_complex_management_system.entity.resident.Resident;
import com.manage.housing_complex_management_system.entity.residential.Apartment;
import com.manage.housing_complex_management_system.service.ApartmentService;
import com.manage.housing_complex_management_system.service.ResidentService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping("/api/v1/resident")
public class ResidentController {

    @Autowired
    private ResidentService residentService;

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public Resident save(@RequestBody Resident resident) {
        return residentService.save(resident);

    }

    @ResponseStatus(HttpStatus.FOUND)
    @GetMapping("/{id}")
    public Resident get(@PathVariable Long id) {
        return residentService.findById(id);
    }



}
