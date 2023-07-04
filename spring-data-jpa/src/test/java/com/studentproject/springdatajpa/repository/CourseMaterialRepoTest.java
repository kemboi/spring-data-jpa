package com.studentproject.springdatajpa.repository;

import com.studentproject.springdatajpa.entity.Course;
import com.studentproject.springdatajpa.entity.CourseMaterial;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
@SpringBootTest
class CourseMaterialRepoTest {
    @Autowired
    CourseMaterialRepo courseMaterialRepo;
    @Test
public void saveCourseMaterial(){
        Course course = Course.builder()
                .title("DSA")
                .credit(10)
                .build();
        CourseMaterial courseMaterial = CourseMaterial.builder()
        .url("www.google.com")
        .course(course)
        .build();
        courseMaterialRepo.save(courseMaterial);
}
}