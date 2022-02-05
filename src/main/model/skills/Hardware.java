package main.model.skills;

import main.model.SkillSet;

public class Hardware extends SkillSet {

	boolean pcbDesign = false;
	boolean signalProcessing = false;
	boolean CAD = false;
	boolean simulation = false;

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

	public void changeSimulationTrue() {
		this.simulation = true;
	}


	public void changeBasedOn(boolean pcbDesign, boolean signalProcessing, boolean CAD, boolean simulation) {
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
			changeSimulationTrue();
		}
	}

}