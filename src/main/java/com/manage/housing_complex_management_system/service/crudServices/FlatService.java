package com.manage.housing_complex_management_system.service.crudServices;

import com.manage.housing_complex_management_system.entity.residential.Flat;
import com.manage.housing_complex_management_system.repository.FlatRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class FlatService {

    @Autowired
    FlatRepository flatRepository;

    public Flat save(Flat flat) {
        return flatRepository.save(flat);
    }

    public Flat findById(Long id) {
        return flatRepository.findById(id).orElse(null);
    }

    public Iterable<Flat> findAll() {
        return flatRepository.findAll();
    }

    public Flat update(Long id, Flat flat) {
        return flatRepository.save(flat);
    }

    public void delete(Long id) {
        flatRepository.deleteById(id);
    }

}
