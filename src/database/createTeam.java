package database;

import main.model.Employee;
import main.model.Project;
import main.model.SkillSet;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

public class createTeam {

	private static Connection con = DBConnection.getCon();


	String teamName;
	Project project;
	List<Employee> employeeList;

	public createTeam(String teamName) {
		this.teamName = teamName;

	}

	public void addEmployee(Employee e) {
		this.employeeList.add(e);
	}

	public int countNumSkills() {
		int count = 0;
		for (Employee e : employeeList) {
			count += project.numMatchingSkills(e);
		}
		return count;
	}

//	public boolean checkAllRequirement() {
//		List<SkillSet> allSkillSet = new ArrayList<>();
//		for (Employee e : employeeList) {
//			allSkillSet.addAll(e.getAvailableSkills());
//		}
//
//	}
//

}
