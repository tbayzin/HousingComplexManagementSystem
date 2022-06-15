package com.manage.housing_complex_management_system.repository;

import com.manage.housing_complex_management_system.entity.resident.Resident;
import com.manage.housing_complex_management_system.entity.residential.Blog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ResidentRepository extends JpaRepository <Resident, Long> {


}
