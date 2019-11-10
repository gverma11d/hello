package com.example.cas.singletondemo.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class LookUps {

	private HashMap<String, List<String>> cachedata;
	
	public HashMap<String, List<String>> getData(){
		cachedata = new HashMap<>();
		List<String> data = new ArrayList<>();
		data.add("1");
		data.add("3");
		cachedata.put("Numbers", data);
		
		return cachedata;
	}
}
