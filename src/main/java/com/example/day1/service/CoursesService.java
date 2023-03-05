package com.example.day1.service;

import com.example.day1.model.Courses;
import com.example.day1.repository.CoursesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class CoursesService {
    @Autowired
    CoursesRepository  coursesRepository;
    public List<Courses> getAllCourses()
    {
        List<Courses> courses = new ArrayList<Courses>();
        coursesRepository.findAll().forEach(Courses -> courses.add(Courses));
        return courses;
    }
    //getting a specific record
    public Courses getCoursesById(int id)
    {
        return coursesRepository.findById(id).get();
    }
    public void saveOrUpdate(Courses Courses)
    {
        coursesRepository.save(Courses);
    }

    //deleting a specific record
    public void delete(int id)
    {
        coursesRepository.deleteById(id);
    }

}
