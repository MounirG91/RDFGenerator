package ontology.parser;

import java.util.Iterator;
import java.util.List;

import ontology.model.Certification;

public class CertificationJSON {

	private List<Certification> certifications;

	public CertificationJSON() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CertificationJSON(List<Certification> certifications) {
		super();
		this.certifications = certifications;
	}

	public List<Certification> getCertifications() {
		return certifications;
	}

	public void setCertifications(List<Certification> certifications) {
		this.certifications = certifications;
	}

	public void showAllCertifications(List<Certification> certifications) throws NullPointerException {
		Iterator<Certification> iterator = certifications.iterator();
		while (iterator.hasNext()) {
			Certification certification = iterator.next();
			System.out.println(certification.toString());
		}
	}

}
