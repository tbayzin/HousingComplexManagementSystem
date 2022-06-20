package com.manage.housing_complex_management_system.controller;


import com.manage.housing_complex_management_system.entity.residential.Flat;
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
    public Flat save(@RequestBody Flat flat) {
        return apartmentService.save(flat);
    }

    @ResponseStatus(HttpStatus.FOUND)
    @GetMapping("/blog/{id}")
    public Flat get(@PathVariable Long id) {
        return apartmentService.findById(id);
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("blog")
    public Iterable<Flat> getAll() {
        return apartmentService.findAll();
    }

    @ResponseStatus(HttpStatus.OK)
    @PutMapping("/blog/{id}")
    public Flat update(@PathVariable Long id, @RequestBody Flat flat) {
        return apartmentService.update(id, flat);
    }

    @ResponseStatus(HttpStatus.OK)
    @DeleteMapping("/blog/{id}")
    public void delete(@PathVariable Long id) {
        apartmentService.delete(id);
    }

}


