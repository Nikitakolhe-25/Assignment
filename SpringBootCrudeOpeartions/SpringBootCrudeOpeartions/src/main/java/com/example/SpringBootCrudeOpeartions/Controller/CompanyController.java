package com.example.SpringBootCrudeOpeartions.Controller;

import com.example.SpringBootCrudeOpeartions.Entity.Company;
import com.example.SpringBootCrudeOpeartions.Service.CompanyInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class CompanyController
{
    @Autowired
    public CompanyInterface companyInterface;

    @PostMapping("company/post")
    public Company company(@RequestBody Company company)
    {
        return companyInterface.post(company);
    }

    @GetMapping("company/get")
    public List<Company> getallData()
    {
        return companyInterface.getall();
    }

    @GetMapping("company/get{id}")
    public Optional<Company> getBYId(@PathVariable int id)
    {
        return companyInterface.getID(id);
    }

    @PutMapping("company/update{id}")
    public Company updateData(@PathVariable("id") int id , @RequestBody Company company)
    {
        return companyInterface.update(id, company);
    }

    @DeleteMapping("company/delete")
    public  void deleteall()
    {
        companyInterface.delete();
    }
     @DeleteMapping("company/delete{id}")
    public  String  deleteById(@PathVariable("id")  int id)
     {
         companyInterface.deleteall(id);
         return "delete";
     }
}
