package com.example.SpringBootCrudeOpeartions.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Student
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private  String  first_Name;
    private  String  last_Name;
    private  String  address;
    private   long phone_Number;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "student_id")

    private List<School> schools = new ArrayList<>();


}
