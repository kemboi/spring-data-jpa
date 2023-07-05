package com.studentproject.springdatajpa.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.Hibernate;

import java.util.List;
import java.util.Objects;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Teacher {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "Teacher_GEN")
    @SequenceGenerator(name = "Teacher_GEN", sequenceName = "Teacher_SEQ",
    initialValue = 1)
    @Column(name = "teacher_id", nullable = false)
    private Long teacherId;
    @Column(nullable = false)
    private String firstName;
    @Column(nullable = false)
    private String lastName;
//    @OneToMany(cascade = CascadeType.ALL)
//    @JoinColumn(name = "teacherId",
//    referencedColumnName = "teacher_Id")
//    private List<Course> courses;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Teacher teacher = (Teacher) o;
        return teacherId != null && Objects.equals(teacherId, teacher.teacherId);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
