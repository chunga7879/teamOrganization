package database;

import main.model.Employee;
import main.model.Project;

import java.util.List;

public class createTeam {

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

}
