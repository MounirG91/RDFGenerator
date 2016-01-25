package ontology.parser;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


import com.google.gson.Gson;


import ontology.model.Professional;

public class Parser {

	public Professional jsonToProfessional(String fileLocation) throws NullPointerException {
		Gson gson = new Gson();
		Professional professional = new Professional();
		try {
			BufferedReader br = new BufferedReader(new FileReader(fileLocation));
			professional = gson.fromJson(br, Professional.class);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return professional;
	}

	public CertificationJSON jsonToCertification(String fileLocation) throws NullPointerException {
		Gson gson = new Gson();
		CertificationJSON certificationJSON=new CertificationJSON();
		try {
			BufferedReader br = new BufferedReader(new FileReader(fileLocation));
			certificationJSON = gson.fromJson(br, CertificationJSON.class);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return certificationJSON;
	}
	
	public SkillJSON jsonToSkill(String fileLocation) throws NullPointerException {
		Gson gson = new Gson();
		SkillJSON skillJSON=new SkillJSON();
		try {
			BufferedReader br = new BufferedReader(new FileReader(fileLocation));
			skillJSON = gson.fromJson(br, SkillJSON.class);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return skillJSON;
	}
	
	public UniversityJSON jsonToUniversity(String fileLocation) throws NullPointerException {
		Gson gson = new Gson();
		UniversityJSON universityJSON=new UniversityJSON();
		try {
			BufferedReader br = new BufferedReader(new FileReader(fileLocation));
			universityJSON = gson.fromJson(br, UniversityJSON.class);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return universityJSON;
	}
}
