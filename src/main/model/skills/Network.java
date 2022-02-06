package main.model.skills;

import main.model.SkillSet;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Network extends SkillSet {
	boolean dataScience = false;

	boolean machineLearning = false;
	boolean protocol = false;

	public Network() {
		super("Network");
	}


	public boolean isDataScience() {
		return dataScience;
	}

	public boolean isMachineLearning() {
		return machineLearning;
	}

	public boolean isProtocol() {
		return protocol;
	}

	public void changeDataScienceTrue() {
		this.dataScience = true;
	}

	public void changeMachineLearningTrue() {
		this.machineLearning = true;
	}

	public void changeProtocolTrue() {
		this.protocol = true;
	}

	public void changeBasedOn(boolean DataScience, boolean MachineLearning, boolean Protocol) {
		if (DataScience) {
			changeDataScienceTrue();
		}
		if (MachineLearning) {
			changeMachineLearningTrue();
		}
		if (Protocol) {
			changeProtocolTrue();
		}
	}

	@Override
	public List<String> info() {
		String s1 = "dataScience: " + dataScience;
		String s2 = "machineLearning: " + machineLearning;
		String s3 = "protocol: " + protocol;

		List<String> list = new ArrayList<>();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		return list;
	}


	@Override
	public Map<String, Boolean> returnMap() {
		Map<String, Boolean> maps = new HashMap<>();
		maps.put("dataScience", dataScience);
		maps.put("machineLearning", machineLearning);
		maps.put("protocol", protocol);

		return maps;
	};
}