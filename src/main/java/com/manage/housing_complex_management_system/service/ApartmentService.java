package com.manage.housing_complex_management_system.service;

import com.manage.housing_complex_management_system.entity.resident.Resident;
import com.manage.housing_complex_management_system.entity.residential.Apartment;
import com.manage.housing_complex_management_system.repository.ApartmentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ApartmentService {

    @Autowired
    ApartmentRepository apartmentRepository;

    public Apartment save(Apartment apartment) {
        return apartmentRepository.save(apartment);
    }

    public Apartment findById(Long id) {
        return apartmentRepository.findById(id).orElse(null);
    }

    public Iterable<Apartment> findAll() {
        return apartmentRepository.findAll();
    }

    public Apartment update(Long id, Apartment apartment) {
        return apartmentRepository.save(apartment);
    }

    public void delete(Long id) {
        apartmentRepository.deleteById(id);
    }

}
