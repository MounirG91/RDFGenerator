package ontology.model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Professional {
	private String name, first_name, last_name, title, location, number_of_connections, country, industry, summary,
			picture, linkedin_url, link;
	private List<String> websites, skills, languages, organizations;
	private List<JobCompany> past_companies, current_companies;

	private List<Professional> friends;
	private List<Professional> recommended_visitors;
	private List<Group> groups;
	private List<Certification> certifications;
	private List<Education> education;
	private List<Project> projects;

	private List<Certification> certificationsOfprofessional=new ArrayList<Certification>();
	private List<Skill> skillsOfprofessional=new ArrayList<Skill>();

	public Professional() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Professional(String name, String first_name, String last_name, String title, String location,
			String number_of_connections, String country, String industry, String summary, String picture,
			String linkedin_url, String link, List<String> websites, List<String> skills, List<String> languages,
			List<String> organizations, List<JobCompany> past_companies, List<JobCompany> current_companies,
			List<Professional> friends, List<Professional> recommended_visitors, List<Group> groups,
			List<Certification> certifications, List<Education> education, List<Project> projects) {
		super();
		this.name = name;
		this.first_name = first_name;
		this.last_name = last_name;
		this.title = title;
		this.location = location;
		this.number_of_connections = number_of_connections;
		this.country = country;
		this.industry = industry;
		this.summary = summary;
		this.picture = picture;
		this.linkedin_url = linkedin_url;
		this.link = link;
		this.websites = websites;
		this.skills = skills;
		this.languages = languages;
		this.organizations = organizations;
		this.past_companies = past_companies;
		this.current_companies = current_companies;
		this.friends = friends;
		this.recommended_visitors = recommended_visitors;
		this.groups = groups;
		this.certifications = certifications;
		this.education = education;
		this.projects = projects;
	}

	@Override
	public String toString() {
		return "Professional [name=" + name + ", first_name=" + first_name + ", last_name=" + last_name + ", title="
				+ title + ", location=" + location + ", number_of_connections=" + number_of_connections + ", country="
				+ country + ", industry=" + industry + ", summary=" + summary + ", picture=" + picture
				+ ", linkedin_url=" + linkedin_url + ", link=" + link + ", websites=" + websites + ", skills=" + skills
				+ ", languages=" + languages + ", organizations=" + organizations + "]";
	}

	public List<Group> getGroups() {
		return groups;
	}

	public void setGroups(List<Group> groups) {
		this.groups = groups;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getNumber_of_connections() {
		return number_of_connections;
	}

	public void setNumber_of_connections(String number_of_connections) {
		this.number_of_connections = number_of_connections;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getIndustry() {
		return industry;
	}

	public void setIndustry(String industry) {
		this.industry = industry;
	}

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public String getPicture() {
		return picture;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}

	public String getLinkedin_url() {
		return linkedin_url;
	}

	public void setLinkedin_url(String linkedin_url) {
		this.linkedin_url = linkedin_url;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public List<String> getWebsites() {
		return websites;
	}

	public void setWebsites(List<String> websites) {
		this.websites = websites;
	}

	public List<String> getSkills() {
		return skills;
	}

	public void setSkills(List<String> skills) {
		this.skills = skills;
	}

	public List<String> getLanguages() {
		return languages;
	}

	public void setLanguages(List<String> languages) {
		this.languages = languages;
	}

	public List<Certification> getCertifications() {
		return certifications;
	}

	public void setCertifications(List<Certification> certifications) {
		this.certifications = certifications;
	}

	public List<String> getOrganizations() {
		return organizations;
	}

	public void setOrganizations(List<String> organizations) {
		this.organizations = organizations;
	}

	public List<JobCompany> getPast_companies() {
		return past_companies;
	}

	public void setPast_companies(List<JobCompany> past_companies) {
		this.past_companies = past_companies;
	}

	public List<JobCompany> getCurrent_companies() {
		return current_companies;
	}

	public void setCurrent_companies(List<JobCompany> current_companies) {
		this.current_companies = current_companies;
	}

	public List<Education> getEducation() {
		return education;
	}

	public void setEducation(List<Education> education) {
		this.education = education;
	}

	public List<Certification> getCertificationsOfprofessional() {
		return certificationsOfprofessional;
	}

	public void setCertificationsOfprofessional(List<Certification> certificationsOfprofessional) {
		this.certificationsOfprofessional = certificationsOfprofessional;
	}

	public List<Skill> getSkillsOfprofessional() {
		return skillsOfprofessional;
	}

	public void setSkillsOfprofessional(List<Skill> skillsOfprofessional) {
		this.skillsOfprofessional = skillsOfprofessional;
	}

	public List<Project> getProjects() {
		return projects;
	}

	public void setProjects(List<Project> projects) {
		this.projects = projects;
	}

	public List<Professional> getFriends() {
		return friends;
	}

	public void setFriends(List<Professional> friends) {
		this.friends = friends;
	}

	public List<Professional> getRecommended_visitors() {
		return recommended_visitors;
	}

	public void setRecommended_visitors(List<Professional> recommended_visitors) {
		this.recommended_visitors = recommended_visitors;
	}

	public void toListOfCertification(List<Certification> listOfCertifications) throws NullPointerException {
		Iterator<Certification> iterator = this.getCertifications().iterator();
		Iterator<Certification> iteratorOfCertifications = listOfCertifications.iterator();
		while (iterator.hasNext()) {
			Certification element = iterator.next();
			while (iteratorOfCertifications.hasNext()) {
				Certification certification = iteratorOfCertifications.next();
				System.out.println(certification.getTitle());
				System.out.println(element.getTitle());
				if ((certification.getTitle().equals(element.getTitle()))==true) {
					certification.setScore(element.getScore());
					System.out.println(certification.toString());
					certificationsOfprofessional.add(certification);
				}
			}
		}
	}

	public void fromListOfStringToListOfSkills(List<String> listOfString, List<Skill> listOfSkills) throws NullPointerException {
		Iterator<String> iteratorOfString = listOfString.iterator();
		Iterator<Skill> iteratorOfSkills = listOfSkills.iterator();
		while (iteratorOfString.hasNext()) {
			String element = iteratorOfString.next();
			while (iteratorOfSkills.hasNext()) {
				Skill skill = iteratorOfSkills.next();
				if (skill.getName().equals(element))
					this.skillsOfprofessional.add(skill);
			}
		}
	}

	public void showAllFriends(List<Professional> friends) {
		Iterator<Professional> iterator = friends.iterator();
		while (iterator.hasNext()) {
			Professional professional = iterator.next();
			System.out.println(professional.toString());
		}
	}

	public void showAllRecommended_visitor(List<Professional> recommended_visitors) {
		Iterator<Professional> iterator = recommended_visitors.iterator();
		while (iterator.hasNext()) {
			Professional recommended_visitor = iterator.next();
			System.out.println(recommended_visitor.toString());
		}
	}

	public void showAllEducations(List<Education> education) {
		Iterator<Education> iterator = education.iterator();
		while (iterator.hasNext()) {
			Education educat = iterator.next();
			System.out.println(educat.toString());
		}
	}

	public void showAllCertifications(List<Certification> certifications) throws NullPointerException {
		Iterator<Certification> iterator = certifications.iterator();
		while (iterator.hasNext()) {
			Certification certification = iterator.next();
			System.out.println(certification.toString());
		}
	}

	public void showAllProjects(List<Project> projects) {
		Iterator<Project> iterator = projects.iterator();
		while (iterator.hasNext()) {
			Project project = iterator.next();
			System.out.println(project.toString());
			// project.showAllAssociates();
		}
	}

	public void showAllGroups(List<Group> groups) {
		Iterator<Group> iterator = groups.iterator();
		while (iterator.hasNext()) {
			Group group = iterator.next();
			System.out.println(group.toString());
		}
	}

	public void showAllSkills(List<String> skills) {
		Iterator<String> iterator = skills.iterator();
		while (iterator.hasNext()) {
			String skill = iterator.next();
			System.out.println(skill.toString());
		}
	}

	public void showAllLanguages(List<String> languages) {
		Iterator<String> iterator = languages.iterator();
		while (iterator.hasNext()) {
			String language = iterator.next();
			System.out.println(language.toString());
		}
	}

	public void showAllOrganizations(List<String> organizations) {
		Iterator<String> iterator = languages.iterator();
		while (iterator.hasNext()) {
			String organization = iterator.next();
			System.out.println(organization.toString());
		}
	}

	public void showAllJobCompany(List<JobCompany> jobs) {
		Iterator<JobCompany> iterator = jobs.iterator();
		while (iterator.hasNext()) {
			JobCompany job = iterator.next();
			System.out.println(job.toString());
		}
	}

	public void displayProfessional(Professional professional) {
		System.out.println(professional.toString());
		this.showAllProjects(professional.getProjects());
		this.showAllEducations(professional.getEducation());
		this.showAllGroups(professional.getGroups());
		this.showAllLanguages(professional.getLanguages());
		this.showAllSkills(professional.getSkills());
		this.showAllCertifications(professional.getCertifications());
		this.showAllOrganizations(professional.getOrganizations());
		this.showAllJobCompany(professional.getPast_companies());
		this.showAllJobCompany(professional.getCurrent_companies());
		this.showAllRecommended_visitor(professional.getRecommended_visitors());
	}

}