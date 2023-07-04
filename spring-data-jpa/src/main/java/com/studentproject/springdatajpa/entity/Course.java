package com.studentproject.springdatajpa.entity;

import jakarta.persistence.*;
import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Builder
public class Course {
    @Getter(AccessLevel.NONE)
    @Setter(AccessLevel.NONE)
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "Course_GEN")
    @SequenceGenerator(name = "Course_GEN", sequenceName = "Course_SEQ")
    @Column(name = "courseId", nullable = false)
    private Long courseId;
    private String title;
    private String credit;

}
