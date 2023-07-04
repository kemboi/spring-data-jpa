package com.studentproject.springdatajpa.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.engine.internal.Cascade;

@Getter
@Setter
@Entity
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CourseMaterial {
    @Getter(AccessLevel.NONE)
    @Setter(AccessLevel.NONE)
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "CourseMaterial_GEN")
    @SequenceGenerator(name = "CourseMaterial_GEN", sequenceName = "CourseMaterial_SEQ")
    @Column(name = "course_material_id", nullable = false)
    private Long courseMaterialId;
    private String url;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "course_Id",
    referencedColumnName = "courseId")
    private Course course;

}
