package main.model;

import database.DBConnection;
import main.model.skills.Hardware;
import main.model.skills.Network;
import main.model.skills.Research;
import main.model.skills.Software;
//import main.model.subTasks.Date;
import main.model.subTasks.Range;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

public class Employee {

    String employeeName;
    String email;
    List<SkillSet> availableSkills;
    List<Range> availableSchedules;

    public Employee(String employeeName, String email) {
        this.employeeName = employeeName;
        this.email = email;
        availableSkills = new ArrayList<>();
        availableSchedules = new ArrayList<>();
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

    public Software addSoftwareSkill(boolean oop, boolean web, boolean app, boolean UX, boolean testing) {
        Software set = new Software();
        set.changeBasedOn(oop, web, app, UX, testing);
        availableSkills.add(set);
        return set;
    }

    // shedule Setting
    public void addSchedule(int startMonth, int startDay, int endMonth, int endDay) {
        Range range = new Range(startMonth, startDay, endMonth, endDay);
        availableSchedules.add(range);
    }

    public List<Range> getAvailableSchedules() {
        return this.availableSchedules;
    }

}