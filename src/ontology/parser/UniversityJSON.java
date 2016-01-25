package ontology.parser;

import java.util.Iterator;
import java.util.List;

import ontology.model.University;;

public class UniversityJSON {
	private List<University> universities;

	public UniversityJSON() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UniversityJSON(List<University> universities) {
		super();
		this.universities = universities;
	}

	public List<University> getUniversities() {
		return universities;
	}

	public void setUniversities(List<University> universities) {
		this.universities = universities;
	}

	public void showAllUniversities(List<University> universities) throws NullPointerException {
		Iterator<University> iterator = universities.iterator();
		while (iterator.hasNext()) {
			University university = iterator.next();
			System.out.println(university.toString());
		}
	}

}
