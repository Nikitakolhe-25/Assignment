package com.example.SimpleCrudeOperations.Model;

import lombok.Data;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
@ToString
public class Person
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  int id;
    private  String contry;
    private  int age;
    private  String blood_Group;
}
