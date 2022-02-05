package main.model;

import java.util.List;



public abstract class SkillSet {

	String skillName;

	public SkillSet(String name) {
		this.skillName = name;
	}

	// for checking the information
	public abstract List<String> info();


}