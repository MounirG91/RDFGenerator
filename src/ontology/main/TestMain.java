package ontology.main;

import java.io.IOException;
import java.text.ParseException;

import ontology.model.Professional;
import ontology.model.University;
import ontology.parser.CertificationJSON;
import ontology.parser.Parser;
import ontology.parser.SkillJSON;
import ontology.parser.UniversityJSON;

public class TestMain {
	public static void main(String[] args) throws NullPointerException, ParseException, IOException {
		Parser parser = new Parser();
		Professional professional=new Professional();
		professional = parser.jsonToProfessional("E:\\Professional_5.json");
		professional.displayProfessional(professional);

		CertificationJSON certificationJSON=new CertificationJSON();
		certificationJSON = parser.jsonToCertification("E:\\certification.json");
		
		SkillJSON skillJSON=new SkillJSON();
		skillJSON = parser.jsonToSkill("E:\\skill.json");
		skillJSON.showAllSkills(skillJSON.getSkills());
		
		UniversityJSON universityJSON=new UniversityJSON();
		universityJSON = parser.jsonToUniversity("E:\\university.json");
		universityJSON.showAllUniversities(universityJSON.getUniversities());
		
		certificationJSON.showAllCertifications(certificationJSON.getCertifications());
		
		
		
		
		//professional.toListOfCertification(certificationJSON.getCertifications());
		//professional.showAllCertifications(professional.getCertificationsOfprofessional());
	
		
	     
	}
}
