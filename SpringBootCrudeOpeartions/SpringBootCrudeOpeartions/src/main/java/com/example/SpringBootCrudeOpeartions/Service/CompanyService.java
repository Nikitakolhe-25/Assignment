package com.example.SpringBootCrudeOpeartions.Service;

import com.example.SpringBootCrudeOpeartions.Entity.Company;
import com.example.SpringBootCrudeOpeartions.Repo.CompanyRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CompanyService implements CompanyInterface
{
    @Autowired
    public CompanyRepo companyRepo;

    @Override
    public Company post(Company company) {
        return  companyRepo.save(company);
    }

    @Override
    public List<Company> getall() {
        return companyRepo.findAll();
    }

    @Override
    public Optional<Company> getID(int id) {
        return companyRepo.findById(id);
    }

    @Override
    public Company update(int id, Company company)
    {
        company.setId(id);
        return companyRepo.save(company);
    }

    @Override
    public void delete()
    {
        companyRepo.deleteAll();

    }

    @Override
    public String deleteall(int id)
    {
        companyRepo.deleteById(id);
        return "deleted";
    }
}
