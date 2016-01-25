package ontology.model;

public class Certification {
	private String title, score, hasField, relatedSkill, createdBy, administredBy, website, maximumScore;

	public Certification() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Certification(String title, String score) {
		super();
		this.title = title;
		this.score = score;
	}

	public Certification(String hasField, String relatedSkill, String createdBy, String administredBy, String website,
			String maximumScore) {
		super();
		this.hasField = hasField;
		this.relatedSkill = relatedSkill;
		this.createdBy = createdBy;
		this.administredBy = administredBy;
		this.website = website;
		this.maximumScore = maximumScore;
	}

	public Certification(String name, String title, String score, String hasField, String relatedSkill,
			String createdBy, String administredBy, String website, String maximumScore) {
		super();
		this.title = title;
		this.score = score;
		this.hasField = hasField;
		this.relatedSkill = relatedSkill;
		this.createdBy = createdBy;
		this.administredBy = administredBy;
		this.website = website;
		this.maximumScore = maximumScore;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getScore() {
		return score;
	}

	public void setScore(String score) {
		this.score = score;
	}

	public Certification(String score, String hasField, String relatedSkill, String createdBy, String administredBy,
			String website, String maximumScore) {
		super();
		this.score = score;
		this.hasField = hasField;
		this.relatedSkill = relatedSkill;
		this.createdBy = createdBy;
		this.administredBy = administredBy;
		this.website = website;
		this.maximumScore = maximumScore;
	}

	public String getHasField() {
		return hasField;
	}

	public void setHasField(String hasField) {
		this.hasField = hasField;
	}

	public String getRelatedSkill() {
		return relatedSkill;
	}

	public void setRelatedSkill(String relatedSkill) {
		this.relatedSkill = relatedSkill;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public String getAdministredBy() {
		return administredBy;
	}

	public void setAdministredBy(String administredBy) {
		this.administredBy = administredBy;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public String getMaximumScore() {
		return maximumScore;
	}

	public void setMaximumScore(String maximumScore) {
		this.maximumScore = maximumScore;
	}

	@Override
	public String toString() {
		return "Certification [title=" + title + ", score=" + score + ", hasField=" + hasField + ", relatedSkill="
				+ relatedSkill + ", createdBy=" + createdBy + ", administredBy=" + administredBy + ", website="
				+ website + ", maximumScore=" + maximumScore + "]";
	}

	public void setCertification(Certification certification1, Certification certification2) {
		certification1.setAdministredBy(certification2.getAdministredBy());
		certification1.setCreatedBy(certification2.getCreatedBy());
		certification1.setHasField(certification2.getHasField());
		certification1.setMaximumScore(certification2.getMaximumScore());
		certification1.setRelatedSkill(certification2.getRelatedSkill());
		certification1.setScore(certification2.getScore());
		certification1.setWebsite(certification2.getWebsite());
	}
}