package com.example.SpringBootCrudeOpeartions.Controller;

import com.example.SpringBootCrudeOpeartions.Entity.Story;
import com.example.SpringBootCrudeOpeartions.Service.StoryInterface;
import com.example.SpringBootCrudeOpeartions.Service.StroySerice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class StoryController
{
    @Autowired
    public StoryInterface storyInterface;

    @PostMapping("story/post")
    public Story saveStory(@RequestBody Story story)
    {
        return storyInterface.post(story);
    }
@GetMapping("story/get{id}")
    public Optional<Story> getById(@PathVariable int id) {

        return storyInterface.getId(id);
    }

    @GetMapping("/story/get")
    public List<Story> getallData(){
        return storyInterface.getID();
    }


}
