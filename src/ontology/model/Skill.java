package ontology.model;

public class Skill {
	private String name, dateOfFirstVersion, lastVersion, author, developer, paradigm, licence, website;

	public Skill() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Skill(String name, String dateOfFirstVersion, String lastVersion, String author, String developer,
			String paradigm, String licence, String website) {
		super();
		this.name = name;
		this.dateOfFirstVersion = dateOfFirstVersion;
		this.lastVersion = lastVersion;
		this.author = author;
		this.developer = developer;
		this.paradigm = paradigm;
		this.licence = licence;
		this.website = website;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDateOfFirstVersion() {
		return dateOfFirstVersion;
	}

	public void setDateOfFirstVersion(String dateOfFirstVersion) {
		this.dateOfFirstVersion = dateOfFirstVersion;
	}

	public String getLastVersion() {
		return lastVersion;
	}

	public void setLastVersion(String lastVersion) {
		this.lastVersion = lastVersion;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getDeveloper() {
		return developer;
	}

	public void setDeveloper(String developer) {
		this.developer = developer;
	}

	public String getParadigm() {
		return paradigm;
	}

	public void setParadigm(String paradigm) {
		this.paradigm = paradigm;
	}

	public String getLicence() {
		return licence;
	}

	public void setLicence(String licence) {
		this.licence = licence;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	@Override
	public String toString() {
		return "Skill [name=" + name + ", dateOfFirstVersion=" + dateOfFirstVersion + ", lastVersion=" + lastVersion
				+ ", author=" + author + ", developer=" + developer + ", paradigm=" + paradigm + ", licence=" + licence
				+ ", website=" + website + "]";
	}

}
