package com.example.SimpleMappingProject.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
    public class Address
    {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String city;
    private  String house_Name;

//    @OneToMany(targetEntity = Student.class,cascade = CascadeType.ALL)
//    public List <Student> student;

// @ManyToOne
//@JoinColumn(name="student_id")
//  private Student student;

//    @ManyToMany
//    public List<Student> students;

}
