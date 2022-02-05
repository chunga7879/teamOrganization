package main.model.skills;

import main.model.SkillSet;

import java.util.ArrayList;
import java.util.List;

public class Software extends SkillSet {
	boolean objectOrientedProgramming = false;
	boolean	webDevelopment = false;
	boolean appDevelopment = false;
	boolean UXdesign = false;
	boolean testing = false;

	public Software() {
		super("Software");
	}

	public void changeobjectOrientedProgrammingTrue() {
		this.objectOrientedProgramming = true;
	}

	public void changeWebDevelopmentTrue() {
		this.webDevelopment = true;
	}

	public void changeAppDevelopmentTrue() {
		this.appDevelopment = true;
	}

	public void changeUXdesignTrue() {
		this.UXdesign = true;
	}

	public void changeTestingTrue() {
		this.testing = true;
	}

	public void changeBasedOn(boolean oop, boolean web, boolean app, boolean UX, boolean testing) {
		if (oop) changeobjectOrientedProgrammingTrue();
		if (web) changeWebDevelopmentTrue();
		if (app) changeAppDevelopmentTrue();
		if (UX) changeUXdesignTrue();
		if (testing) changeTestingTrue();
	}

	@Override
	public List<String> info() {
		String s1 = "objectOrientedProgramming: " + objectOrientedProgramming;
		String s2 = "webDevelopment: " + webDevelopment;
		String s3 = "appDevelopment: " + appDevelopment;
		String s4 = "UXdesign: " + UXdesign;
		String s5 = "testing: " + testing;


		List<String> list = new ArrayList<>();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		list.add(s5);
		return list;
	}
}


