package waa.lab05.database;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;

@Component
public class Database {
	public Map<String, String> usersNameToPasswordMap = new HashMap<String, String>();
	public Map<String, List<String>> roastOptionToAdviceMap = new HashMap<String, List<String>>();
	public Map<String, String> roastOptionMap = new HashMap<String, String>();

	{
		usersNameToPasswordMap.put("Dave", "111");
		usersNameToPasswordMap.put("Steve", "222");
		usersNameToPasswordMap.put("Ralph", "333");
		
		roastOptionMap.put("-- Choose Roast --", "-");
		roastOptionMap.put("Light", "light");
		roastOptionMap.put("Medium", "medium");
		roastOptionMap.put("Dark", "dark");
		
		ArrayList<String> darkList = new ArrayList<String>();
		darkList.add("Sumatra");
		darkList.add("Verona");
		darkList.add("French Roast");
		roastOptionToAdviceMap.put("dark", darkList);
		
		ArrayList<String> medList = new ArrayList<String>();
		medList.add("Breakfast Blend");
		medList.add("Colombia");
		medList.add("Yukon");
		medList.add("Pike Place");
		medList.add("House Blend");
		roastOptionToAdviceMap.put("medium", medList);
		
		ArrayList<String> lightList = new ArrayList<String>();
		lightList.add("Willow");
		lightList.add("Aria");
		lightList.add("Bright Sky");
		lightList.add("Veranda");
		roastOptionToAdviceMap.put("light", lightList);
	}
}

