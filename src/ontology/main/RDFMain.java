package ontology.main;

import ontology.model.Professional;
import ontology.parser.Parser;
import ontoly.rdf.RDFManager;

public class RDFMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Parser parser = new Parser();
		Professional professional=new Professional();
		professional = parser.jsonToProfessional("E:\\Professional_5.json");
		
		RDFManager rdfManager=new RDFManager();
		rdfManager.professionalToRDF(professional); 
	}

}
