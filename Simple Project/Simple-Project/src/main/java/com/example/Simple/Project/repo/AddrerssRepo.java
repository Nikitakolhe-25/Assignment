package com.example.Simple.Project.repo;

import com.example.Simple.Project.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddrerssRepo extends JpaRepository<Address, Integer> {
    public Address save(Address address);
}
