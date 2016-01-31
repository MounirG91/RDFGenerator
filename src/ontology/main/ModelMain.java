package ontology.main;

import java.io.IOException;
import java.text.ParseException;

import ontology.model.Professional;
import ontology.parser.Parser;

public class ModelMain {
	public static void main(String[] args) throws NullPointerException, ParseException, IOException {
		
		String workingDir = System.getProperty("user.dir");
		System.out.println("Current working directory : " + workingDir);
		
		String fileSource = workingDir + "\\attached_files";
		
		Parser parser = new Parser();
		Professional professional = new Professional();
		professional = parser.jsonToProfessional(fileSource+"\\profil (6).txt");
		professional.displayProfessional(professional);


	}
}
