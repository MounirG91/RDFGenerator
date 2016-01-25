package ontology.main;

import java.io.IOException;
import java.text.ParseException;

import ontology.model.Professional;
import ontology.parser.CertificationJSON;
import ontology.parser.Parser;
import ontology.parser.SkillJSON;

public class TestMain {
	public static void main(String[] args) throws NullPointerException, ParseException, IOException {
		Parser parser = new Parser();
		Professional professional=new Professional();
		professional = parser.jsonToProfessional("E:\\Professional_5.json");
		professional.displayProfessional(professional);

		CertificationJSON certificationJSON=new CertificationJSON();
		certificationJSON = parser.jsonToCertification("E:\\certification.json");
		
		professional.showAllCertifications(certificationJSON.getCertifications());
		//professional.toListOfCertification(certificationJSON.getCertifications());
		//professional.showAllCertifications(professional.getCertificationsOfprofessional());
	
		SkillJSON skillJSON=new SkillJSON();
		skillJSON = parser.jsonToSkill("E:\\skill.json");
		skillJSON.showAllSkills(skillJSON.getSkills());
	     
	}
}
