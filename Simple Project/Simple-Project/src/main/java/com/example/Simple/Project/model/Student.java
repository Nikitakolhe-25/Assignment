package com.example.Simple.Project.model;


import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Student{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   private int id;
    private String firstName;
    private String  lastName;
    private long mobileNo;


}
