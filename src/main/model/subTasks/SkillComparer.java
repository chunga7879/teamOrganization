package main.model;

import java.util.List;
import main.model.SkillSet;

public class SkillComparer {

	public int numMatchingSkills(Project project, Employee employee) {
        
        int count = 0;
        List<SkillSet> availableSkill = employee.getAvailableSkills;
        List<SkillSet> requiredSkill = project.getSkillSetRequired;

        for (int i = 0; i < requiredSkill.size(); i++) {
            String reqName = requiredSkill.get(i).getSkillName();
            for (int j = 0; j < availableSkill.size(); j++) {
                String avalName = availableSkill.get(j).getSkillName();
                if (reqName.equals(avalName)) {
                    if (reqName.equals("Hardware")) {
                        count += compareHardware(requiredSkill.get(i), availableSkill.get(j));
                    } else if (reqName.equals("Software")) {
                        count += compareSoftware(requiredSkill.get(i), availableSkill.get(j));
                    } else if (reqName.equals("Network")) {
                        count += compareNetwork(requiredSkill.get(i), availableSkill.get(j));
                    } else if (reqName.equals("Research")) {
                        count += compareResearch(requiredSkill.get(i), availableSkill.get(j));
                    }
                }
            }
        }

        return count;
    }

    public int compareHardware(SkillSet s1, SkillSet s2) {
        int count = 0;
        if (s1.pcbDesign & s2.pcbDesign) count++;
        if (s1.signalProcessing & s2.signalProcessing) count++;
        if (s1.CAD & s2.CAD) count++;
        if (s1.simulation & s2.simulation) count++;
        return count;
    }

    public int compareSoftware(SkillSet s1, SkillSet s2) {
        int count = 0;
        if (s1.objectOrientedProgramming & s2.objectOrientedProgramming) count++;
        if (s1.webDevelopment & s2.webDevelopment) count++;
        if (s1.appDevelopment & s2.appDevelopment) count++;
        if (s1.UXdesign & s2.UXdesign) count++;
        if (s1.testing & s2.testing) count++;
        return count;
    }

    public int compareResearch(SkillSet s1, SkillSet s2) {
        int count = 0;
        if (s1.sourceChecking & s2.sourceChecking) count++;
        if (s1.journalResearch & s2.journalResearch) count++;
        if (s1.dataCollection & s2.dataCollection) count++;
        return count;
    }

    public int compareNetwork(SkillSet s1, SkillSet s2) {
        int count = 0;
        if (s1.dataScience & s2.dataScience) count++;
        if (s1.machineLearning & s2.machineLearning) count++;
        if (s1.protocol & s2.protocol) count++;
        return count;
    }
}
}