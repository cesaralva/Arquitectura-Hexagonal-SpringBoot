package com.services.ms.student.infrastructure.adapters.output.persistence.entity;

import jakarta.persistence.*;
import lombok.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "students")
public class StudentEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;
    //private String email;
    //private String phoneNumber;
    private String address;
    private Integer age;
    //private String city;
    //private String state;
    //private String zip;
    //public StudentEntity() {}

}
