package com.manage.housing_complex_management_system.repository;

import com.manage.housing_complex_management_system.entity.residential.Apartment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ApartmentRepository extends JpaRepository<Apartment, Long> {





}

