package com.services.ms.student.domain.model;

import lombok.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Student {
    private Long id;
    private String firstName;
    private String lastName;
    //private String email;
    //private String phoneNumber;
    private String address;
    //private String city;
    //private String state;
    //private String zip;
    //private String country;
    private Integer age;
    //public Student() {

    //}
}
