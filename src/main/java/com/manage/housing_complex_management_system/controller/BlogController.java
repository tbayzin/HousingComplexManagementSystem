package com.manage.housing_complex_management_system.controller;

import com.manage.housing_complex_management_system.entity.residential.Blog;
import com.manage.housing_complex_management_system.repository.BlogRepository;
import com.manage.housing_complex_management_system.service.BlogService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/blog")
public class BlogController {

    @Autowired
    private BlogService blogService;


    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public void saveBlog(@RequestBody Blog blog) {
        blogService.save(blog);

    }
}
