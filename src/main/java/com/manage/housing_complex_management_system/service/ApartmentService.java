package com.manage.housing_complex_management_system.service;

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

}
