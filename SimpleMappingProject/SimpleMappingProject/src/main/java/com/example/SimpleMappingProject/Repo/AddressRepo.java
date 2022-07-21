package com.example.SimpleMappingProject.Repo;

import com.example.SimpleMappingProject.Entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepo extends JpaRepository<Address , Integer>
{

}
