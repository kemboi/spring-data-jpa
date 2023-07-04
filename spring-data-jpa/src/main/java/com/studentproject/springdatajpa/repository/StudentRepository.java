package com.studentproject.springdatajpa.repository;

import com.studentproject.springdatajpa.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student,Long> {
    public List<Student> findByFirstName(String firstName);
    // JPQL Example
    @Query("Select s FROM Student s where s.emailId = ?1")
    public Student findStudentByEmailAddress(String email);
}
