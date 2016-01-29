package ontology.model;

public class Certification {
	private String title, score;

	public Certification() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Certification(String title, String score) {
		super();
		this.title = title;
		this.score = score;
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




	@Override
	public String toString() {
		return "Certification [title=" + title + ", score=" + score + "]";
	}


}