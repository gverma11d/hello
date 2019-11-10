package com.example.cas.singletondemo.util;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.example.cas.singletondemo.service.LookUps;

import lombok.Data;

@Data
@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
public class SingletonCache {

	private static LookUps lookup;
	private static SingletonCache cache = null;
	private static HashMap<String, List<String>> cacheData;
	
	private SingletonCache() {
		lookup = new LookUps();
		cacheData = lookup.getData();
	}
	
	public static SingletonCache getInstance() {
		if(cache == null) {
			cache = new SingletonCache();
			return cache;
		}
		else {
			return cache;
		}
	}
	
	public static HashMap<String, List<String>> getCachedData(){
		return cacheData;
	}
}
