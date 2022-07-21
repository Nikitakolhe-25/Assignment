package com.example.SimpleMappingProject.Service;

import com.example.SimpleMappingProject.Entity.Address;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface AddressInterface
{

    Address saveData(Address address);

    List<Address> getall();

    Optional<Address> getAdd(int id);

    Address upadteData(int id, Address address);


    String deleteid(int id);

    void deleteall();


    // JPQL
    @Query("SELECT ud)
    public List<Address> getAllList(String status);


}
