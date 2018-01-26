package com.jin.logback.service;

import com.jin.logback.entity.Student;

import java.util.List;

public interface StudentService {
    public void save(Student student);
    public List<Student> findAll();
}
