package com.example.day1.repository;

import com.example.day1.model.Student;
import org.springframework.data.repository.CrudRepository;
public interface StudentRepository extends CrudRepository<Student, Integer>
{
}
