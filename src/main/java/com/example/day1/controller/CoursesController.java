package com.example.day1.controller;

import com.example.day1.model.Courses;
import com.example.day1.service.CoursesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CoursesController {
    @Autowired
    CoursesService coursesService;
    @GetMapping("/courses")
    private List<Courses> getAllCourses (){
        return coursesService.getAllCourses();
    }
    @GetMapping("/courses/{id}")
    private Courses getCourses(@PathVariable("id") int id){
        return coursesService.getCoursesById(id);
    }
    @DeleteMapping("/courses/{id}")
    private void deleteCourse(@PathVariable("id") int id){
        coursesService.delete(id);
    }
    @PostMapping("/courses")
    private int saveCourses(@RequestBody Courses courses)
    {
        coursesService.saveOrUpdate(courses);
        return courses.getId();
    }

}
