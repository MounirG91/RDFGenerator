package ontology.main;

import java.io.IOException;
import java.text.ParseException;

import ontology.model.Professional;
import ontology.parser.CertificationJSON;
import ontology.parser.Parser;
import ontology.parser.SkillJSON;
import ontology.parser.UniversityJSON;

public class ModelMain {
	public static void main(String[] args) throws NullPointerException, ParseException, IOException {
		
		String workingDir = System.getProperty("user.dir");
		System.out.println("Current working directory : " + workingDir);
		
		String fileSource = workingDir + "\\attached_files";
		
		Parser parser = new Parser();
		Professional professional = new Professional();
		professional = parser.jsonToProfessional(fileSource+"\\YassineBenNaceurProfile.json");
		professional.displayProfessional(professional);

		CertificationJSON certificationJSON = new CertificationJSON();
		certificationJSON = parser.jsonToCertification(fileSource+"\\certification.json");

		SkillJSON skillJSON = new SkillJSON();
		skillJSON = parser.jsonToSkill(fileSource+"\\skill.json");
		skillJSON.showAllSkills(skillJSON.getSkills());

		UniversityJSON universityJSON = new UniversityJSON();
		universityJSON = parser.jsonToUniversity(fileSource+"\\university.json");
		universityJSON.showAllUniversities(universityJSON.getUniversities());

		certificationJSON.showAllCertifications(certificationJSON.getCertifications());

		// professional.toListOfCertification(certificationJSON.getCertifications());
		// professional.showAllCertifications(professional.getCertificationsOfprofessional());

	}
}
