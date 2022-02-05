package main.model.skills;

import main.model.SkillSet;

public class Hardware extends SkillSet {
	boolean pcbDesign = false;
	boolean signalProcessing = false;
	boolean CAD = false;
	boolean simulation = false;
	boolean matlab = false;

	public Hardware() {
		super("Hardware");
	}

	public void changePcbDesignTrue() {
		this.pcbDesign = true;
	}

	public void changeSignalProcessingTrue() {
		this.signalProcessing = true;
	}

	public void changeCADTrue() {
		this.CAD = true;
	}

	public void changeSimulationXTrue() {
		this.simulation = true;
	}

	public void changeMatlabTrue() {
		this.matlab = true;
	}

	public void changeBasedOn(boolean pcbDesign, boolean signalProcessing, boolean CAD, boolean simulation, boolean matlab) {
		if (pcbDesign) {
			changePcbDesignTrue();
		}
		if (signalProcessing) {
			changeSignalProcessingTrue();
		}
		if (CAD) {
			changeCADTrue();
		}
		if (simulation) {
			changeSimulationXTrue();
		}
		if (matlab) {
			changeMatlabTrue();
		}
	}

}