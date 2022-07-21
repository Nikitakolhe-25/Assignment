package com.example.SpringBootCrudeOpeartions.Service;

import com.example.SpringBootCrudeOpeartions.Entity.Story;
import com.example.SpringBootCrudeOpeartions.Repo.StoryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StroySerice implements StoryInterface
{
    @Autowired
    public StoryRepo storyRepo;

    @Override
    public Story post(Story story) {

        return storyRepo.save(story);
    }

    @Override
    public Optional<Story> getId(int id) {

        return storyRepo.findById(id);
    }

    @Override
    public List<Story> getID() {
        return storyRepo.findAll();
    }
}
