package main.model.skills;

import main.model.SkillSet;

public class Research extends SkillSet {
	boolean sourceChecking;
	boolean journalResearch;
	boolean dataCollection;


	public Research() {
		super("Research");
	}

	public void changeSourceCheckingTrue() {
		this.sourceChecking = true;
	}

	public void changeJournallResearchTrue() {
		this.journalResearch = true;
	}

	public void changeDataCollectionTrue() {
		this.dataCollection = true;
	}

	public void changeBasedOn(boolean sourceChecking, boolean journalResearch, boolean dataCollection) {
		if (sourceChecking) {
			changeSourceCheckingTrue();
		}
		if (journalResearch) {
			changeJournallResearchTrue();
		}
		if (dataCollection) {
			changeDataCollectionTrue();
		}
	}
}