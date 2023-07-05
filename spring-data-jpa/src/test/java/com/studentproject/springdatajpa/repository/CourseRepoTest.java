package com.studentproject.springdatajpa.repository;

import com.studentproject.springdatajpa.entity.Course;
import com.studentproject.springdatajpa.entity.Teacher;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class CourseRepoTest {
    @Autowired
    private CourseRepo courseRepo;
    @Test
    public void saveCourseWithTeacher(){
        Teacher teacher = Teacher.builder()
                .firstName("Jelimo")
                .lastName("Korir")
                .build();
        Course course = Course.builder()
                .title("Digital Logic")
                .credit(17)
                .teacher(teacher)
                .build();
        courseRepo.save(course);
    }
}