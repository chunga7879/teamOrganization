package main.model.skills;

import main.model.SkillSet;

public class Network extends SkillSet {

	boolean dataScience = false;
	boolean machineLearning = false;
	boolean protocol = false;

	public Network() {
		super("Network");
	}

	public void changeDataScienceTrue() {
		this.dataScience = true;
	}

	public void changeMachineLearningTrue() {
		this.machineLearning = true;
	}

	public void changeProtocolTrue() {
		this.protocol = true;
	}

	public void changeBasedOn(boolean DataScience, boolean MachineLearning, boolean Protocol) {
		if (DataScience) {
			changeDataScienceTrue();
		}
		if (MachineLearning) {
			changeMachineLearningTrue();
		}
		if (Protocol) {
			changeProtocolTrue();
		}
	}

}