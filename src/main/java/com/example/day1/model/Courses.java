package com.example.day1.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Courses {

    @Id
    @Column
    private int id;
    @Column
    private String courseName;
    @Column
    private String courseDescriptions;
    @Column
    private String academicLevel;
    @Column
    private int studentId;

    @Column
    private double fees;
    @Column
    private float duration;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseDescriptions() {
        return courseDescriptions;
    }

    public void setCourseDescriptions(String courseDescriptions) {
        this.courseDescriptions = courseDescriptions;
    }
    public String getAcademicLevel() {
        return academicLevel;
    }
    public void setAcademicLevel(String academicLevel) {
        this.academicLevel = academicLevel;
    }

    public int getStudentId() {
        return studentId;
    }
    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }
    public double getFees() {
        return fees;
    }
    public void setFees(double fees) {
        this.fees = fees;
    }
    public float getDuration() {
        return duration;
    }
    public void setDuration(float duration) {
        this.duration = duration;
    }
}
