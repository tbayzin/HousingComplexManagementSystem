package com.manage.housing_complex_management_system.controller;


import com.manage.housing_complex_management_system.entity.residential.Apartment;
import com.manage.housing_complex_management_system.entity.residential.Blog;
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

    @ResponseStatus(HttpStatus.FOUND)
    @GetMapping("/blog/{id}")
    public Apartment get(@PathVariable Long id) {
        return apartmentService.findById(id);
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("blog")
    public Iterable<Apartment> getAll() {
        return apartmentService.findAll();
    }

    @ResponseStatus(HttpStatus.OK)
    @PutMapping("/blog/{id}")
    public Apartment update(@PathVariable Long id, @RequestBody Apartment apartment) {
        return apartmentService.update(id, apartment);
    }

    @ResponseStatus(HttpStatus.OK)
    @DeleteMapping("/blog/{id}")
    public void delete(@PathVariable Long id) {
        apartmentService.delete(id);
    }

}


