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
@RequestMapping("/api/v1/")
public class ResidentController {

    @Autowired
    private ResidentService residentService;

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/resident")
    public Resident save(@RequestBody Resident resident) {
        return residentService.save(resident);

    }

    @ResponseStatus(HttpStatus.FOUND)
    @GetMapping("/resident/{id}")
    public Resident get(@PathVariable Long id) {
        return residentService.findById(id);
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("residents")
        public Iterable<Resident> getAll() {
        return residentService.findAll();
    }

    @ResponseStatus(HttpStatus.OK)
    @PutMapping("/resident/{id}")
    public Resident update(@PathVariable Long id, @RequestBody Resident resident) {
        return residentService.update(id, resident);
    }

    @ResponseStatus(HttpStatus.OK)
    @DeleteMapping("/resident/{id}")
    public void delete(@PathVariable Long id) {
        residentService.delete(id);
    }

}
