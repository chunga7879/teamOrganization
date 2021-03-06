package main.model;

import main.model.skills.Hardware;
import main.model.skills.Network;
import main.model.skills.Research;
import main.model.skills.Software;
import main.model.subTasks.Date;
import main.model.subTasks.Range;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Project {
	// unique name
	String projectName;

	List<SkillSet> skillSetRequired;
	int minNumTeamMembers;
	int maxNumTeamMembers;
	int numHoursRequired;
	Date startDate;
	Date endDate;

	/* constructor */
	public Project(String name) {
		this.projectName = name;
		skillSetRequired = new ArrayList<>();
	}

	public Project(String name, int min, int max, int hours, Date start, Date end) {
		this.projectName = name;
		this.skillSetRequired = new ArrayList<>();
		this.minNumTeamMembers = min;
		this.maxNumTeamMembers = max;
		this.numHoursRequired = hours;
		this.startDate = start;
		this.endDate = end;
	}

	/* set members */
	public void setNumTeamMembers(int min, int max) {
		this.minNumTeamMembers = min;
		this.maxNumTeamMembers = max;
	}

	public void setNumHoursRequired(int hours) {
		this.numHoursRequired = hours;
	}

	public void setStartDate(Date start, Date end) {
		this.startDate = start;
		this.endDate = end;
	}

	/* skills */
	public List<SkillSet> getSkillSetRequired() {
		return this.skillSetRequired;
	}

	public List<String> getSkillNames() {
		List<String> names = new ArrayList<>();
		
		for (SkillSet rs : this.skillSetRequired) {
			Map<String, Boolean> rsm = rs.returnMap();
			for (String rsmKey : rsm.keySet()) {
				names.add(rsmKey);
			}
		}

		return names;
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

	public boolean checkAvailability(Employee employee) {
		Range projectRange = new Range(this.startDate, this.endDate);

		for (Range r : employee.availableSchedules) {
			if (Range.compareTwoRange(projectRange, r)) {
				return true;
			}
		}

		return false;
	}

	public int numMatchingSkills(Employee employee) {

		int count = 0;
		List<SkillSet> availableSkill = employee.getAvailableSkills();

		for (SkillSet e : availableSkill) {
			for (SkillSet rs : skillSetRequired) {
				Map<String, Boolean> em = e.returnMap();
				Map<String, Boolean> rsm = rs.returnMap();
				for (String emKey : em.keySet()) {
					for (String rsmKey : rsm.keySet()) {
						if (emKey.equals(rsmKey) && em.get(emKey) == rsm.get(rsmKey)) {
							count++;
						}
					}
				}

			}

		}
		return count;
	}

}