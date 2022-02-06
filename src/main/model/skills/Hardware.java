package main.model.skills;

import main.model.SkillSet;

import java.util.*;

public class Hardware extends SkillSet {

	public boolean pcbDesign = false;

	
	public boolean signalProcessing = false;
	public boolean CAD = false;
	public boolean simulation = false;

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

	@Override
	public List<String> info() {
		String s1 = "pcbDesign: " + pcbDesign;
		String s2 = "signalProcessing: " + signalProcessing;
		String s3 = "CAD: " + CAD;
		String s4 = "simulation: " + simulation;

		List<String> list = new ArrayList<>();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		return list;
	}
}