package com.example.SpringBootCrudeOpeartions.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.annotation.sql.DataSourceDefinition;
import javax.persistence.*;

@Entity
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class School
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  int id;
    private  String name;
    private  String address;

    @ManyToOne

    private Student student;

}
