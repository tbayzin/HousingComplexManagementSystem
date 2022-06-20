package com.manage.housing_complex_management_system.service;

import com.manage.housing_complex_management_system.entity.residential.Flat;
import com.manage.housing_complex_management_system.repository.ApartmentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ApartmentService {

    @Autowired
    ApartmentRepository apartmentRepository;

    public Flat save(Flat flat) {
        return apartmentRepository.save(flat);
    }

    public Flat findById(Long id) {
        return apartmentRepository.findById(id).orElse(null);
    }

    public Iterable<Flat> findAll() {
        return apartmentRepository.findAll();
    }

    public Flat update(Long id, Flat flat) {
        return apartmentRepository.save(flat);
    }

    public void delete(Long id) {
        apartmentRepository.deleteById(id);
    }

}
