package com.studentproject.springdatajpa.entity;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Embeddable
@ToString
public class Guardian {
    private String guardianName;
    private String getGuardianMobile;

}
