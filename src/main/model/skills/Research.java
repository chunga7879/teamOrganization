public class Research extends SkillSet {
    boolean sourceChecking = false;
    boolean journalResearch = false;
    boolean dataCollection = false;


    public Research() {
		super("Research");
	}

	public void changeSourceCheckingTrue() {
		this.sourceChecking = true;
	}

	public void changeJournalResearchTrue() {
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
			changeJournalResearchTrue();
		}
		if (dataCollection) {
			changeDataCollectionTrue();
		}
	}

}