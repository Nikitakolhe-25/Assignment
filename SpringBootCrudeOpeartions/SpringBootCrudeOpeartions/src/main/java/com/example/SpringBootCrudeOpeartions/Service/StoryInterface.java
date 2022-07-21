package com.example.SpringBootCrudeOpeartions.Service;

import com.example.SpringBootCrudeOpeartions.Entity.Story;

import java.util.List;
import java.util.Optional;

public interface StoryInterface {
    Story post(Story story);

    Optional<Story> getId(int id);

    List<Story> getID();
}
