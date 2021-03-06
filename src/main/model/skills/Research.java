package main.model.skills;

import main.model.SkillSet;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Research extends SkillSet {
	boolean sourceChecking = false;
	boolean journalResearch = false;
	boolean dataCollection = false;


	public Research() {
		super("Research");
	}

	public boolean isSourceChecking() {
		return sourceChecking;
	}

	public boolean isJournalResearch() {
		return journalResearch;
	}

	public boolean isDataCollection() {
		return dataCollection;
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

	@Override
	public List<String> info() {
		String s1 = "sourceChecking: " + sourceChecking;
		String s2 = "journalResearch: " + journalResearch;
		String s3 = "dataCollection: " + dataCollection;

		List<String> list = new ArrayList<>();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		return list;
	}

	@Override
	public Map<String, Boolean> returnMap() {
		Map<String, Boolean> maps = new HashMap<>();
		maps.put("sourceChecking", sourceChecking);
		maps.put("journalResearch", journalResearch);
		maps.put("dataCollection", dataCollection);

		return maps;
	};

}