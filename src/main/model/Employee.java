package main.model;

import main.model.skills.Hardware;
import main.model.skills.Network;
import main.model.skills.Research;
import main.model.skills.Software;

import java.util.ArrayList;
import java.util.List;

public class Employee {
    String employeeName;
    String email;
    List<SkillSet> availableSkills;

    public Employee(String employeeName, String email) {
        this.employeeName = employeeName;
        this.email = email;
        availableSkills = new ArrayList<>();
    }

    // SKILLS
    public List<SkillSet> getAvailableSkills() {
        return this.availableSkills;
    }

    public Hardware addHardwareSkill(boolean pcbDesign, boolean signalProcessing, boolean CAD, boolean simulation) {
        Hardware set = new Hardware();
        set.changeBasedOn(pcbDesign, signalProcessing, CAD, simulation);
        availableSkills.add(set);
        return set;
    }

    public Network addResearchSkill(boolean DataScience, boolean MachineLearning, boolean Protocol) {
        Network set = new Network();
        set.changeBasedOn(DataScience, MachineLearning, Protocol);
        availableSkills.add(set);
        return set;
    }

    public Research addNetworkSkill(boolean sourceChecking, boolean journalResearch, boolean dataCollection) {
        Research set = new Research();
        set.changeBasedOn(sourceChecking, journalResearch, dataCollection);
        availableSkills.add(set);
        return set;
    }

    public Software addSoftwareEngineeringSkill(boolean oop, boolean web, boolean app, boolean UX, boolean testing) {
        Software set = new Software();
        set.changeBasedOn(oop, web, app, UX, testing);
        availableSkills.add(set);
        return set;
    }

}