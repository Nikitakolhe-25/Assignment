package com.example.SimpleMappingProject.Service;

import com.example.SimpleMappingProject.Entity.Address;
import com.example.SimpleMappingProject.Repo.AddressRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AddressService implements AddressInterface
{
    @Autowired
    public AddressRepo addressRepo;


    @Override
    public Address saveData(Address address) {

        return addressRepo.save(address);
    }



    @Override
    public Optional<Address> getAdd(int id) {

        return addressRepo.findById(id);
    }

    @Override
    public Address upadteData(int id, Address address)
    {
        address.setId(id);
        return  addressRepo.save(address);
    }

    @Override
    public String deleteid(int id)
    {
        addressRepo.deleteById(id);
        return "delete";
    }

    @Override
    public void deleteall() {

        addressRepo.deleteAll();
    }

    @Override
    public List<Address> getAllList(String status) {
        return addressRepo.findAll();
    }


}
