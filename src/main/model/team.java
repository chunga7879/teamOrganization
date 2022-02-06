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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Team {

	String teamName;
	Project project;
	List<Employee> employeeList;
	double variance;
	double numMatchingSkills;


	public Team(String teamName, Project prj, double variance, double numMatchingSkills) {
		this.teamName = teamName;
        this.project = prj;
		this.variance = 0.0;
        this.numMatchingSkills = 0;
        this.employeeList = new ArrayList<>();
	}

    public void addEmployee(Employee newEmp) {
        this.employeeList.add(newEmp);
    }

    public void calcBestMatch() {
        Map<String, Integer> countMap = new HashMap<>(); 
        List<String> reqSkill = project.getSkillNames();

        // initiallize count map
        for (String rs : reqSkill) {
            countMap.put(rs, 0);
        }

        // increment count when matches
        for (Employee em : employeeList) {
            for (String empSkill : em.getSkillNames()) {
                countMap.put(empSkill, countMap.get(empSkill));
                numMatchingSkills++;
            }
        }

        double avgx = numMatchingSkills / reqSkill.size();
        double avgxsquared;
        for (String key : reqSkill) {
            avgxsquared += (countMap.get(key) * countMap.get(key));
        }
        avgxsquared = avgxsquared / reqSkill.size();

        this.variance = avgxsquared - (avgx * avgx);
    }

	

}