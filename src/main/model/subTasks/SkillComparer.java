package main.model;

import java.util.List;

public class SkillComparer {

	public int numMatchingSkills(Project project, Employee employee) {
        
        int count = 0;
        List<String> availableSkill = employee.getAvailableSkills;
        List<String> requiredSkill = project.getSkillSetRequired;

        for (int i = 0; i < requiredSkill.size(); i++) {
            for (int j = 0; j < availableSkill.size(); j++) {
                if (requiredSkill[i].skillName.equals("Hardware")) {
                    count += compareHardware(requiredSkill[i], availableSkill[j]);
                } else if (requiredSkill[i].skillName.equals("Software")) {
                    count += compareSoftware(requiredSkill[i], availableSkill[j]);
                } else if (requiredSkill[i].skillName.equals("Network")) {
                    count += compareNetwork(requiredSkill[i], availableSkill[j]);
                } else if (requiredSkill[i].skillName.equals("Research")) {
                    count += compareResearch(requiredSkill[i], availableSkill[j]);
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