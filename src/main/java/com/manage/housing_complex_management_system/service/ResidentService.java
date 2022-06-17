package com.manage.housing_complex_management_system.service;

import com.manage.housing_complex_management_system.entity.resident.Resident;
import com.manage.housing_complex_management_system.repository.ResidentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ResidentService {

    @Autowired
    private ResidentRepository residentRepository;

    public Resident save(Resident resident) {
        return residentRepository.save(resident);
    }

    public Resident findById(Long id) {
        return residentRepository.findById(id).orElse(null);
    }

    public Iterable<Resident> findAll() {
        return residentRepository.findAll();
    }

    public Resident update(Long id, Resident resident) {
        return residentRepository.save(resident);
    }

    public void delete(Long id) {
        residentRepository.deleteById(id);
    }


}
