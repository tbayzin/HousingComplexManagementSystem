package com.manage.housing_complex_management_system.service.crudServices;


import com.manage.housing_complex_management_system.entity.resident.Resident;
import com.manage.housing_complex_management_system.entity.residential.Blog;
import com.manage.housing_complex_management_system.repository.BlogRepository;
import com.manage.housing_complex_management_system.repository.ResidentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BlogService {

    @Autowired
 BlogRepository blogRepository;

    public void save(Blog blog) {
        blogRepository.save(blog);
    }

    public Blog findById(Long id) {
        return blogRepository.findById(id).orElse(null);
    }

    public Iterable<Blog> findAll() {
        return blogRepository.findAll();
    }

    public Blog update(Long id,Blog blog) {
        return blogRepository.save(blog);
    }

    public void delete(Long id) {
        blogRepository.deleteById(id);
    }

}
