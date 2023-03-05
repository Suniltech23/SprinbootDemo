package com.example.day1.repository;

import com.example.day1.model.Courses;
import org.springframework.data.repository.CrudRepository;

public interface CoursesRepository extends CrudRepository<Courses,Integer> {
}
