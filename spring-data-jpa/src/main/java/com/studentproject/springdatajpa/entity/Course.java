package com.studentproject.springdatajpa.entity;

import jakarta.persistence.*;
import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Builder
@ToString
public class Course {
    @Getter(AccessLevel.NONE)
    @Setter(AccessLevel.NONE)
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "Course_GEN")
    @SequenceGenerator(name = "Course_GEN", sequenceName = "Course_SEQ"
    , initialValue = 1)
    @Column(name = "courseId", nullable = false)
    private Long courseId;
    @Column(unique = true)
    private String title;
    private int credit;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "teacher_id",
    referencedColumnName = "teacher_id")
    private Teacher teacher;

}
