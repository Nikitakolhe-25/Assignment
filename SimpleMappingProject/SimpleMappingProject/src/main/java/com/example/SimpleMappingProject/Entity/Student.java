package com.example.SimpleMappingProject.Entity;

import com.example.SimpleMappingProject.Repo.AddressRepo;
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
    private int student_id;
    private String firstName;
    private String lastName;
    private  long mobile_Number;

//    @OneToOne(cascade = CascadeType.ALL)
//    private Address address;

// @OneToMany( cascade = CascadeType.ALL)
// @JoinColumn(name = "student_id")
// private List<Address> addresses;

//    @ManyToMany(mappedBy = "students")
//    private List<Address> addresses;



}
