package ontology.parser;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.google.gson.Gson;


import ontology.model.Professional;

public class Parser {

	public Professional jsonToProfessional(String fileLocation) throws NullPointerException {
		Gson gson = new Gson();
		Professional professional = new Professional();
		try {
			InputStreamReader inputStram = new InputStreamReader(new FileInputStream(fileLocation), "UTF-8");
			professional = gson.fromJson(inputStram, Professional.class);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return professional;
	}
	
}
