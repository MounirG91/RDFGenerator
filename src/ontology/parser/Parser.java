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
	
}
