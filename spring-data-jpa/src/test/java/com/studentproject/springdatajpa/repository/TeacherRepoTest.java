package com.studentproject.springdatajpa.repository;

import com.studentproject.springdatajpa.entity.Course;
import com.studentproject.springdatajpa.entity.Teacher;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class TeacherRepoTest {
    @Autowired
    private TeacherRepo teacherRepo;
    @Test
    public void saveTeacher(){
//        Course courseDBA = Course.builder()
//                .title("DBA")
//                .credit(10).build();
//        Course courseJAVA = Course.builder()
//                .title("JAVA")
//                .credit(13).build();
//        List<Course> courseList = List.of(courseDBA, courseJAVA);
        Teacher teacher = Teacher.builder()
                .firstName("Brian")
                .lastName("Kim")
                //.courses(courseList)
                .build();
        teacherRepo.save(teacher);
    }

}