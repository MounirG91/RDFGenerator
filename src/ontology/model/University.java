package ontology.model;

public class University {
	private String name, founded_id, website, type, address, director, numberOfStudents, numberOfTeachers,
			languageRegime;

	public University() {
		super();
		// TODO Auto-generated constructor stub
	}

	public University(String name, String founded_id, String website, String type, String address, String director,
			String numberOfStudents, String numberOfTeachers, String languageRegime) {
		super();
		this.name = name;
		this.founded_id = founded_id;
		this.website = website;
		this.type = type;
		this.address = address;
		this.director = director;
		this.numberOfStudents = numberOfStudents;
		this.numberOfTeachers = numberOfTeachers;
		this.languageRegime = languageRegime;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFounded_id() {
		return founded_id;
	}

	public void setFounded_id(String founded_id) {
		this.founded_id = founded_id;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public String getNumberOfStudents() {
		return numberOfStudents;
	}

	public void setNumberOfStudents(String numberOfStudents) {
		this.numberOfStudents = numberOfStudents;
	}

	public String getNumberOfTeachers() {
		return numberOfTeachers;
	}

	public void setNumberOfTeachers(String numberOfTeachers) {
		this.numberOfTeachers = numberOfTeachers;
	}

	public String getLanguageRegime() {
		return languageRegime;
	}

	public void setLanguageRegime(String languageRegime) {
		this.languageRegime = languageRegime;
	}

	@Override
	public String toString() {
		return "University [name=" + name + ", founded_id=" + founded_id + ", website=" + website + ", type=" + type
				+ ", address=" + address + ", director=" + director + ", numberOfStudents=" + numberOfStudents
				+ ", numberOfTeachers=" + numberOfTeachers + ", languageRegime=" + languageRegime + "]";
	}

}