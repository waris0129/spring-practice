package com.cybertek.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Student {

    private String firstName;
    private String lastName;
    private int age;
    private Gender gender;

}
