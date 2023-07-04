package com.studentproject.springdatajpa.repository;

import com.studentproject.springdatajpa.entity.Guardian;
import com.studentproject.springdatajpa.entity.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class StudentRepositoryTest {
@Autowired
private StudentRepository studentRepository;

//    StudentRepositoryTest(StudentRepository studentRepository) {
//        this.studentRepository = studentRepository;
//    }

    @Test
public void saveStudent(){
    Student student = Student.builder()
            .emailId("kevans@gmail.com")
            .firstName("Allan")
            .lastName("Kimani")
           .guardian(new Guardian("+254793939333","Peter"))
           //.getGuardianMobile("+254708803873")
            //.guardianName("Agnes")
            .build();
    studentRepository.save(student);
}
@Test
    public void getStudentList(){
        List<Student> studentList = studentRepository.findAll();
    System.out.println(studentList);
}
@Test
public void findStudentByFirstName(){
        List<Student> studentList = studentRepository.findByFirstName("Evans");
        System.out.println(studentList);
}
    @Test
    public void findStudentByEmail(){
        Student studentList = studentRepository.findStudentByEmailAddress("evanskemb@gmail.com");
        System.out.println(studentList);
    }
}