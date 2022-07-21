package com.example.SpringBootProjectForValidations.Service;

import com.example.SpringBootProjectForValidations.Model.User;
import com.example.SpringBootProjectForValidations.Repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService implements UserInterface
{
    @Autowired
    public UserRepo userRepo;

    @Override
    public User addUser(Object user)
    {
        User saveUser = userRepo.save(user);

        return saveUser;
    }
}
