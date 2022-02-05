package main.model;

import main.model.skills.Hardware;
import main.model.skills.Network;
import main.model.skills.Research;
import main.model.skills.SoftwareEngineering;

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

    public void addHardwareSkill(boolean pcbDesign, boolean signalProcessing, boolean CAD, boolean simulation, boolean matlab) {
        Hardware set = new Hardware();
        set.changeBasedOn(pcbDesign, signalProcessing, CAD, simulation, matlab);
        availableSkills.add(set);
    }

    public void addResearchSkill(boolean DataScience, boolean MachineLearning, boolean Protocol) {
        Network set = new Network();
        set.changeBasedOn(DataScience, MachineLearning, Protocol);
        availableSkills.add(set);
    }

    public void addNetworkSkill(boolean sourceChecking, boolean journalResearch, boolean dataCollection) {
        Research set = new Research();
        set.changeBasedOn(sourceChecking, journalResearch, dataCollection);
        availableSkills.add(set);
    }

    public void addSoftwareEngineeringSkill(boolean oop, boolean web, boolean app, boolean UX, boolean testing) {
        SoftwareEngineering set = new SoftwareEngineering();
        set.changeBasedOn(oop, web, app, UX, testing);
        availableSkills.add(set);
    }


}