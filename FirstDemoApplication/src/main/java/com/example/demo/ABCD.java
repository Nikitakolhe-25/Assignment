package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ABCD
{
	@RequestMapping("N")
	public String add() {
		return"welcome in spring";

	}

}
