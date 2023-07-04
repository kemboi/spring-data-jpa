package com.studentproject.springdatajpa.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.Hibernate;

import java.util.Objects;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "tbl_student",
uniqueConstraints = @UniqueConstraint(name = "emailId",
columnNames = "email_address"))
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
    generator = "student_sequence")
    @SequenceGenerator(name = "student_sequence", sequenceName = "student_sequence",
    allocationSize = 100)
    @Column(name = "student_id", nullable = false)
    private Long studentId;

    private String firstName;
    private String lastName;
    @Column(name = "email_address",
    nullable = false)
    private String emailId;
    @Embedded
    private Guardian guardian;
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Student student = (Student) o;
        return studentId != null && Objects.equals(studentId, student.studentId);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
