package main.model.test;

import main.model.Employee;
import main.model.SkillSet;
import main.model.skills.Hardware;
import main.model.skills.Network;
import main.model.skills.Research;
import main.model.skills.Software;
import main.model.subTasks.Range;
import main.model.Project;
import database.createTeam;

public class TeamTest {

	public static void main() {
		createTeam cTeam = new createTeam("Team 1");
		cTeam.addEmployee();

		System.out.println(employee.getAvailableSkills().get(0).info());

		cTeam.countNumSkills();

		System.out.println(employee.getAvailableSchedules().get(0).startDate.month);
	}

} 