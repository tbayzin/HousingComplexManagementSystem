package com.manage.housing_complex_management_system.repository;

import com.manage.housing_complex_management_system.entity.residential.Apartment;
import com.manage.housing_complex_management_system.entity.residential.Blog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BlogRepository extends CrudRepository <Blog, Long> {





}
