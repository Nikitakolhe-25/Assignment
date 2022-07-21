package com.example.SpringBootProjectForValidations.Repo;

import com.example.SpringBootProjectForValidations.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<User, Integer> {
}
