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
public class Company
{

    @Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private  String address;
    private Long  contact_Number;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "company_id")
    private List<Employee> employees=new ArrayList<>();

}
