package ontology.main;

import ontology.model.Professional;
import ontology.parser.Parser;
import ontoly.rdf.RDFManager;

public class RDFMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String workingDir = System.getProperty("user.dir");
		System.out.println("Current working directory : " + workingDir);
		
		String fileSource = workingDir + "\\attached_files";
		
		Parser parser = new Parser();
		Professional professional1 = new Professional();
		professional1 = parser.jsonToProfessional(fileSource+"\\YassineBenNaceurProfile.json");
		
		RDFManager rdfManager=new RDFManager();
		rdfManager.professionalToRDF(professional1); 
		
		
		System.out.println("/n*****************************************");
		System.out.println("/n*****************************************");
		System.out.println("/n*****************************************");
		System.out.println("/n*****************************************");
		System.out.println("/n*****************************************");
		System.out.println("/n*****************************************");
		System.out.println("/n*****************************************");
		System.out.println("/n*****************************************");
		System.out.println("/n*****************************************");
		
		
		
		Professional professional2 = new Professional();
		professional2 = parser.jsonToProfessional(fileSource+"\\AhmedRebaiProfile.json");
		
		rdfManager.professionalToRDF(professional2); 
		
	}

}
