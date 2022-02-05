package main.model.test;

import main.model.Employee;
import main.model.SkillSet;
import main.model.skills.Hardware;

public class SkillTest {

	public static void main(String[] args) {
		Employee employee = new Employee("chunga", "chunga7879@gmail.com");
		employee.addHardwareSkill(true, true, true, true);

		System.out.println(employee.getAvailableSkills().get(0).info());

	}

} 