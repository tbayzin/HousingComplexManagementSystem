package com.manage.housing_complex_management_system.controller;


import com.manage.housing_complex_management_system.entity.residential.Flat;
import com.manage.housing_complex_management_system.service.DebtService;
import com.manage.housing_complex_management_system.service.crudServices.FlatService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping("/api/v1/flat")
public class FlatController {

    @Autowired
    private FlatService flatService;

    @Autowired
    private DebtService debtService;



    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public Flat save(@RequestBody Flat flat) {
        return flatService.save(flat);
    }

    @ResponseStatus(HttpStatus.FOUND)
    @GetMapping("/blog/{id}")
    public Flat get(@PathVariable Long id) {
        return flatService.findById(id);
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("blog")
    public Iterable<Flat> getAll() {
        return flatService.findAll();
    }

    @ResponseStatus(HttpStatus.OK)
    @PutMapping("/blog/{id}")
    public Flat update(@PathVariable Long id, @RequestBody Flat flat) {
        return flatService.update(id, flat);
    }

    @ResponseStatus(HttpStatus.OK)
    @DeleteMapping("/blog/{id}")
    public void delete(@PathVariable Long id) {
        flatService.delete(id);
    }

    /*
    @ResponseStatus(HttpStatus.OK)
    @PostMapping("/pay/{id}")
    // AŞağıya flat değil flatın numarası verilmeli argüman olarak
    public Flat payFlat(@PathVariable Long id, @RequestBody Flat flat) {
        return debtService.calcDebtFlat(flat,300);
    }
     */

}


