package main.model;

import main.model.skills.Hardware;
import main.model.skills.Network;
import main.model.skills.Research;
import main.model.skills.Software;
import main.model.subTasks.Range;
import main.model.Employee;
import main.model.Project;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Team {

	String teamName;
	Project project;
	List<Employee> employeeList;
	double variance;
	double numMatchingSkills;


	public Team (String teamName, double variance, double numMatchingSkills) {
		this.teamName = teamName;
		this.variance = 0.0;
        this.numMatchingSkills = 0;

	}

	

}