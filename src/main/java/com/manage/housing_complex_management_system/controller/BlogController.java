package com.manage.housing_complex_management_system.controller;

import com.manage.housing_complex_management_system.entity.resident.Resident;
import com.manage.housing_complex_management_system.entity.residential.Blog;
import com.manage.housing_complex_management_system.repository.BlogRepository;
import com.manage.housing_complex_management_system.service.BlogService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/")
public class BlogController {

    @Autowired
    private BlogService blogService;


    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public void saveBlog(@RequestBody Blog blog) {
        blogService.save(blog);
    }

        @ResponseStatus(HttpStatus.FOUND)
        @GetMapping("/blog/{id}")
        public Blog get(@PathVariable Long id) {
            return blogService.findById(id);
        }

        @ResponseStatus(HttpStatus.OK)
        @GetMapping("blog")
        public Iterable<Blog> getAll() {
            return blogService.findAll();
        }

        @ResponseStatus(HttpStatus.OK)
        @PutMapping("/blog/{id}")
        public Blog update(@PathVariable Long id, @RequestBody Blog blog) {
            return blogService.update(id, blog);
        }

        @ResponseStatus(HttpStatus.OK)
        @DeleteMapping("/blog/{id}")
        public void delete(@PathVariable Long id) {
            blogService.delete(id);
        }

    }

