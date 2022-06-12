package com.manage.housing_complex_management_system.service;


import com.manage.housing_complex_management_system.entity.residential.Blog;
import com.manage.housing_complex_management_system.repository.BlogRepository;
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

}
