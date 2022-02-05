package main.model.skills;

import main.model.SkillSet;

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
}


