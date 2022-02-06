package main.model;

import java.util.List;
import java.util.Map;


public abstract class SkillSet {

	public String skillName;

	public SkillSet(String name) {
		this.skillName = name;
	}

	// for checking the information
	public abstract List<String> info();

<<<<<<< HEAD
//	public boolean compareWithOtherSet(SkillSet s) {
//		if (this.skillName.equals(s.skillName)) {
//			return true;
//		} else {
//			return false;
//		}
//	}
//

	public abstract Map<String, Boolean> returnMap();

=======
	public String getSkillName() {
		return this.skillName;
	}

	public boolean compareWithOtherSet(SkillSet s) {
		if (this.skillName.equals(s.skillName)) {
			return true;
		} else {
			return false;
		}
	}
>>>>>>> 0de053dc4a38f0cf55bb7cd8bc04eeb1d9bf4c76

}