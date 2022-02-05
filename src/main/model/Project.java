package main.model;

import java.util.List;

public class Project {
	// unique name
	String projectName;
	String description;

	List<SkillSet> skillSetRequired;
	int minNumTeamMembers;
	int maxNumTeamMembers;
	int numHoursRequired;
	DateFormat startDate;
	DateFormat endDate;

	/* constructor */
	public Project(String name) {
		this.projectName = name;
		skillSetRequired = new ArrayList<>();
	}

	/* set members */
	public void setDescription(String desc) {
		this.description = desc;
	}

	public void setNumTeamMembers(int min, int max) {
		this.minNumTeamMembers = min;
		this.maxNumTeamMembers = max;
	}

	public void setNumHoursRequired(int hours) {
		this.numHoursRequired = hours;
	}

	public void setStartDate(DateFormat start, DateFormat end) {
		this.startDate = start;
		this.endDate = end;
	}

	/* skills */
	public List getSkillSetRequired() {
		return this.skillSetRequired;
	}

	public Hardware addHardwareSkill(boolean pcbDesign, boolean signalProcessing, boolean CAD, boolean simulation) {
        Hardware set = new Hardware();
        set.changeBasedOn(pcbDesign, signalProcessing, CAD, simulation);
        skillSetRequired.add(set);
        return set;
    }

    public Network addResearchSkill(boolean DataScience, boolean MachineLearning, boolean Protocol) {
        Network set = new Network();
        set.changeBasedOn(DataScience, MachineLearning, Protocol);
        skillSetRequired.add(set);
        return set;
    }

    public Research addNetworkSkill(boolean sourceChecking, boolean journalResearch, boolean dataCollection) {
        Research set = new Research();
        set.changeBasedOn(sourceChecking, journalResearch, dataCollection);
        skillSetRequired.add(set);
        return set;
    }

    public Software addSoftwareSkill(boolean oop, boolean web, boolean app, boolean UX, boolean testing) {
        Software set = new Software();
        set.changeBasedOn(oop, web, app, UX, testing);
        skillSetRequired.add(set);
        return set;
    }
}