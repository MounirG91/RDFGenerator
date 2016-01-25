package ontology.parser;

import java.util.Iterator;
import java.util.List;

import ontology.model.Skill;

public class SkillJSON {
	private List<Skill> skills;

	public SkillJSON() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SkillJSON(List<Skill> skills) {
		super();
		this.skills = skills;
	}

	public List<Skill> getSkills() {
		return skills;
	}

	public void setSkills(List<Skill> skills) {
		this.skills = skills;
	}

	public void showAllSkills(List<Skill> skills) {
		Iterator<Skill> iterator = skills.iterator();
		while (iterator.hasNext()) {
			Skill skill = iterator.next();
			System.out.println(skill.toString());
		}
	}
}
