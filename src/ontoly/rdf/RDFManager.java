package ontoly.rdf;

import java.util.Iterator;

import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.ModelFactory;
import org.apache.jena.rdf.model.Property;
import org.apache.jena.rdf.model.Resource;
import org.apache.jena.vocabulary.RDF;

import ontology.model.Certification;
import ontology.model.Education;
import ontology.model.Group;
import ontology.model.JobCompany;
import ontology.model.Professional;
import ontology.model.Project;
import ontology.model.Skill;

public class RDFManager {

	public void professionalToRDF(Professional professional) {
		String mainUri = "http://linkedin.com/";
		String animalUri = mainUri + "classes#Animal";
		String personUri = mainUri + "classes#Person";
		String professionalUri = mainUri + "classes#Professional";
		String educationUri = mainUri + "classes#Education";
		String postUri = mainUri + "classes#Post";
		String past_postUri = postUri + "/Past_post";
		String current_postUri = postUri + "/Current_Post";
		String languageUri = mainUri + "classes#Language";
		String skillUri = mainUri + "classes#Skill";
		String projectUri = mainUri + "classes#Project";
		String certificationUri = mainUri + "classes#Certification";
		String groupUri = mainUri + "classes#Group";
		String organizationUri = mainUri + "classes#Organization";
		String companyUri = mainUri + "classes#Company";
		String universityUri = mainUri + "classes#University";

		String propertyNameUri = mainUri + "property#name";
		String propertyFirstNameUri = mainUri + "property#first_name";
		String propertyLastNameUri = mainUri + "property#last_name";
		String propertyTitleUri = mainUri + "property#title";
		String propertySummaryUri = mainUri + "property#summary";
		String propertyLocationUri = mainUri + "property#location";
		String propertyNumberOfConnectionsUri = mainUri + "property#number_of_connections";
		String propertyCountryUri = mainUri + "property#country";
		String propertyIndustryUri = mainUri + "property#industry";
		String propertyPictureUri = mainUri + "property#picture";
		String propertyLinkedinURLUri = mainUri + "property#linkedin_url";

		String propertyHasSkillUri = mainUri + "property#hasSkill";
		String propertyDidProjectUri = mainUri + "property#didProject";
		String propertyBelongToGroupUri = mainUri + "property#belongToGroup";
		String propertyHasEducationUri = mainUri + "property#hasEducation";
		String propertyHasCertificationUri = mainUri + "property#hasCertification";
		String propertrySpeacksLanguageUri = mainUri + "property#speacksLanguage";
		String propertyJoinOrganizationUri = mainUri + "property#joinOrganization";
		String propertyHadPositionUri = mainUri + "property#hadPosition";
		String propertyHasPositionUri = mainUri + "property#hadPosition";
		String propertyHasFriendUri = mainUri + "property#hasFriend";
		String propertyHasRecommandedVisitorUri = mainUri + "property#hasRecommandedVisitor";

		String propertyHasTitleUri = mainUri + "property#hasTitle";

		String propertyHasNameUri = mainUri + "property#hasName";
		String propertyStartDateUri = mainUri + "property#startDate";
		String propertyEndDateUri = mainUri + "property#endDate";
		String propertyDurationUri = mainUri + "property#duration";
		String propertyDescriptionUri = mainUri + "property#description";

		String propertyDoneInUniversityUri = mainUri + "property#doneInUniversity";
		String propertyHasMajorUri = mainUri + "property#hasMajor";
		String propertyHasDegreeUri = mainUri + "property#hasDegree";

		String propertyTookPlaceInUri = mainUri + "property#tookPlaceIn";

		String propertyHasLinkUri = mainUri + "property#hasLink";

		String propertyHasAssociatesUri = mainUri + "property#hasAssociates";

		String propertyHasWebsiteUri = mainUri + "property#hasWebsite";

		String propertryFoundedInUri = mainUri + "property#foundedIn";
		String propertyHasTypeUri = mainUri + "property#hasType";
		String propertyHasAdressUri = mainUri + "property#hasAdress";

		String propertyLineOfBusineesUri = mainUri + "property#lineOfBusiness";
		String propertyHasEffectiveUri = mainUri + "property#hasEffective";
		String propertyHasFounderUri = mainUri + "property#hasFounder";
		String propertyHasHeadQuartersUri = mainUri + "property#hasHeadQuarters";

		String propertyHasDirectorUri = mainUri + "property#hasDirector";
		String propertyHasNumberOfStudentsUri = mainUri + "property#hasNumberOfStudents";
		String propertyHasNumberOfTeachersUri = mainUri + "property#hasNumberOfTeachers";
		String propertyHasLanguageRegimeUri = mainUri + "property#hasLanguageRegime";

		String propertyFirstAppearedUri = mainUri + "property#firstAppeared";
		String propertyHasParadigmUri = mainUri + "property#hasParadigm";
		String propertyLastVersionUri = mainUri + "property#hasLastVersion";
		String propertyDesignedByUri = mainUri + "property#designedBy";
		String propertyHasDeveloperUri = mainUri + "property#hasDeveloper";
		String propertyHasLicenceUri = mainUri + "property#hasLicence";

		String propertyHasFieldUri = mainUri + "property#hasField";
		String propertyRelatedSkillUri = mainUri + "property#relaredSkill";
		String propertyCreatedByUri = mainUri + "property#createdBy";
		String propertyAdministerdByUri = mainUri + "property#administredBy";
		String propertyHasMaximumScoreUri = mainUri + "property#hasMaximumScore";
		String propertyHasScoreUri = mainUri + "property#hasScore";

		Model model = ModelFactory.createDefaultModel();

		model.createResource(animalUri);// Ressource
										// Animal
		model.createResource(personUri);// Ressource
										// Person
		model.createResource(professionalUri);// Ressource
												// Professional
		model.createResource(educationUri);// Ressource
											// Education
		model.createResource(postUri);// Ressource Post
		model.createResource(past_postUri);// Ressource
											// Past_post
		model.createResource(current_postUri);// Ressource
												// Current_post
		model.createResource(languageUri);// Ressource
											// Language
		model.createResource(skillUri);// Ressource
										// Skill
		model.createResource(projectUri);// Ressource
											// Project
		model.createResource(certificationUri);// Ressource
												// Certification
		model.createResource(groupUri);// Ressource
										// Group
		model.createResource(organizationUri);// Ressource
												// Organization
		model.createResource(companyUri);// Ressource
											// Company
		model.createResource(universityUri);// Ressource
											// University

		Property name = model.createProperty(propertyNameUri);
		model.setNsPrefix("name", propertyNameUri);

		Property first_name = model.createProperty(propertyFirstNameUri);
		model.setNsPrefix("first_name", propertyFirstNameUri);

		Property last_name = model.createProperty(propertyLastNameUri);
		model.setNsPrefix("last_name", propertyLastNameUri);

		Property title = model.createProperty(propertyTitleUri);
		model.setNsPrefix("title", propertyTitleUri);

		Property summary = model.createProperty(propertySummaryUri);
		model.setNsPrefix("summary", propertySummaryUri);

		Property location = model.createProperty(propertyLocationUri);
		model.setNsPrefix("location", propertyLocationUri);

		Property number_of_connections = model.createProperty(propertyNumberOfConnectionsUri);
		model.setNsPrefix("number_of_connections", propertyNumberOfConnectionsUri);

		Property country = model.createProperty(propertyCountryUri);
		model.setNsPrefix("country", propertyCountryUri);

		Property industry = model.createProperty(propertyIndustryUri);
		model.setNsPrefix("industry", propertyIndustryUri);

		Property picture = model.createProperty(propertyPictureUri);
		model.setNsPrefix("picture", propertyPictureUri);

		Property linkedin_url = model.createProperty(propertyLinkedinURLUri);
		model.setNsPrefix("linkedin_url", propertyLinkedinURLUri);

		Property hasSkill = model.createProperty(propertyHasSkillUri);
		model.setNsPrefix("hasSkill", propertyHasSkillUri);

		Property didProject = model.createProperty(propertyDidProjectUri);
		model.setNsPrefix("didProject", propertyDidProjectUri);

		Property belongToGroup = model.createProperty(propertyBelongToGroupUri);
		model.setNsPrefix("belongToGroup", propertyBelongToGroupUri);

		Property hasEducation = model.createProperty(propertyHasEducationUri);
		model.setNsPrefix("hasEducation", propertyHasEducationUri);

		Property hasCertification = model.createProperty(propertyHasCertificationUri);
		model.setNsPrefix("hasCertification", propertyHasCertificationUri);

		Property speacksLanguage = model.createProperty(propertrySpeacksLanguageUri);
		model.setNsPrefix("speacksLanguage", propertrySpeacksLanguageUri);

		Property joinOrganization = model.createProperty(propertyJoinOrganizationUri);
		model.setNsPrefix("joinOrganization", propertyJoinOrganizationUri);

		Property hadPosition = model.createProperty(propertyHasPositionUri);
		model.setNsPrefix("hadPosition", propertyHadPositionUri);

		Property hasPosition = model.createProperty(propertyHasPositionUri);
		model.setNsPrefix("hasPosition", propertyHasPositionUri);

		Property hasFriend = model.createProperty(propertyHasFriendUri);
		model.setNsPrefix("hasFriend", propertyHasFriendUri);

		Property hasRecommandedVisitor = model.createProperty(propertyHasRecommandedVisitorUri);
		model.setNsPrefix("hasRecommandedVisitor", propertyHasRecommandedVisitorUri);

		Property hasTitle = model.createProperty(propertyHasTitleUri);
		model.setNsPrefix("hasTitle", propertyHasTitleUri);

		Property hasName = model.createProperty(propertyHasNameUri);
		model.setNsPrefix("hasName", propertyHasNameUri);

		Property startDate = model.createProperty(propertyStartDateUri);
		model.setNsPrefix("startDate", propertyStartDateUri);

		Property endDate = model.createProperty(propertyEndDateUri);
		model.setNsPrefix("endDate", propertyEndDateUri);

		Property duration = model.createProperty(propertyDurationUri);
		model.setNsPrefix("duration", propertyDurationUri);

		Property description = model.createProperty(propertyDescriptionUri);
		model.setNsPrefix("description", propertyDescriptionUri);

		Property doneInUniversity = model.createProperty(propertyDoneInUniversityUri);
		model.setNsPrefix("doneInUniversity", propertyDoneInUniversityUri);

		Property hasMajor = model.createProperty(propertyHasMajorUri);
		model.setNsPrefix("hasMajor", propertyHasMajorUri);

		Property hasDegree = model.createProperty(propertyHasDegreeUri);
		model.setNsPrefix("hasDegree", propertyHasDegreeUri);

		Property tookPlaceIn = model.createProperty(propertyTookPlaceInUri);
		model.setNsPrefix("tookPlaceIn", propertyTookPlaceInUri);

		Property hasLink = model.createProperty(propertyHasLinkUri);
		model.setNsPrefix("hasLink", propertyHasLinkUri);

		Property hasAssociates = model.createProperty(propertyHasAssociatesUri);
		model.setNsPrefix("hasAssociates", propertyHasAssociatesUri);

		Property hasWebsite = model.createProperty(propertyHasWebsiteUri);
		model.setNsPrefix("hasWebsite", propertyHasWebsiteUri);

		Property foundedIn = model.createProperty(propertryFoundedInUri);
		model.setNsPrefix("foundedIn", propertryFoundedInUri);

		Property hasType = model.createProperty(propertyHasTypeUri);
		model.setNsPrefix("hasType", propertyHasTypeUri);

		Property hasAdress = model.createProperty(propertyHasAdressUri);
		model.setNsPrefix("hasAdress", propertyHasAdressUri);

		Property lineOfBusiness = model.createProperty(propertyLineOfBusineesUri);
		model.setNsPrefix("lineOfBusiness", propertyLineOfBusineesUri);

		Property hasEffective = model.createProperty(propertyHasEffectiveUri);
		model.setNsPrefix("hasEffective", propertyHasEffectiveUri);

		Property hasFounder = model.createProperty(propertyHasFounderUri);
		model.setNsPrefix("hasFounder", propertyHasFounderUri);

		Property hasHeadquarters = model.createProperty(propertyHasHeadQuartersUri);
		model.setNsPrefix("hasHeadquarters", propertyHasHeadQuartersUri);

		Property hasDirector = model.createProperty(propertyHasDirectorUri);
		model.setNsPrefix("hasDirector", propertyHasDirectorUri);

		Property hasNumberOfStudents = model.createProperty(propertyHasNumberOfStudentsUri);
		model.setNsPrefix("hasNumberOfStudents", propertyHasNumberOfStudentsUri);

		Property hasNumberOfTeachers = model.createProperty(propertyHasNumberOfTeachersUri);
		model.setNsPrefix("hasNumberOfTeachers", propertyHasNumberOfTeachersUri);

		Property hasLanguageRegime = model.createProperty(propertyHasLanguageRegimeUri);
		model.setNsPrefix("hasLanguageRegime", propertyHasLanguageRegimeUri);

		Property firstAppeared = model.createProperty(propertyFirstAppearedUri);
		model.setNsPrefix("firstAppeared", propertyFirstAppearedUri);

		Property hasParadigm = model.createProperty(propertyHasParadigmUri);
		model.setNsPrefix("hasParadigm", propertyHasParadigmUri);

		Property lastVersion = model.createProperty(propertyLastVersionUri);
		model.setNsPrefix("lastVersion", propertyLastVersionUri);

		Property designedBy = model.createProperty(propertyDesignedByUri);
		model.setNsPrefix("designedBy", propertyDesignedByUri);

		Property hasDeveloper = model.createProperty(propertyHasDeveloperUri);
		model.setNsPrefix("hasDeveloper", propertyHasDeveloperUri);

		Property hasLicence = model.createProperty(propertyHasLicenceUri);
		model.setNsPrefix("hasLicence", propertyHasLicenceUri);

		Property hasField = model.createProperty(propertyHasFieldUri);
		model.setNsPrefix("hasField", propertyHasFieldUri);

		Property relatedSkill = model.createProperty(propertyRelatedSkillUri);
		model.setNsPrefix("relatedSkill", propertyRelatedSkillUri);

		Property createdBy = model.createProperty(propertyCreatedByUri);
		model.setNsPrefix("createdBy", propertyCreatedByUri);

		Property administredBy = model.createProperty(propertyAdministerdByUri);
		model.setNsPrefix("administredBy", propertyAdministerdByUri);

		Property hasMaximumScore = model.createProperty(propertyHasMaximumScoreUri);
		model.setNsPrefix("hasMaximumScore", propertyHasMaximumScoreUri);

		Property hasScore = model.createProperty(propertyHasScoreUri);
		model.setNsPrefix("hasScore", propertyHasScoreUri);

		Resource professionalProfile = model
				.createResource(professionalUri + "/Profile/" + professional.getName() + "/");
		professionalProfile.addProperty(RDF.type, professionalProfile);

		model.add(professionalProfile, name, professional.getName());
		model.add(professionalProfile, first_name, professional.getFirst_name());
		model.add(professionalProfile, last_name, professional.getLast_name());
		model.add(professionalProfile, title, professional.getTitle());
		if (professional.getSummary() != null)
			model.add(professionalProfile, summary, professional.getSummary());
		model.add(professionalProfile, location, professional.getLocation());
		model.add(professionalProfile, number_of_connections, professional.getNumber_of_connections());
		model.add(professionalProfile, country, professional.getCountry());
		model.add(professionalProfile, industry, professional.getIndustry());
		model.add(professionalProfile, picture, professional.getPicture());
		model.add(professionalProfile, linkedin_url, professional.getLinkedin_url());

		Iterator<Education> educations = professional.getEducation().iterator();
		while (educations.hasNext()) {
			Education education = educations.next();
			Resource educationProfile = model
					.createResource(educationUri + "/" + professional.getName() + "/Education/" + education.getName());
			model.add(professionalProfile, hasEducation, educationProfile);
			if (education.getName() != null)
				model.add(educationProfile, hasTitle, education.getName());
			if (education.getStart_date() != null)
				model.add(educationProfile, startDate, education.getStart_date());
			if (education.getEnd_date() != null)
				model.add(educationProfile, endDate, education.getEnd_date());
			if (education.getPeriod() != null)
				model.add(educationProfile, duration, education.getPeriod());
			if (education.getDescription() != null)
				model.add(educationProfile, description, education.getDescription());
			if (education.getMajor() != null)
				model.add(educationProfile, hasMajor, education.getMajor());
			if (education.getDegree() != null)
				model.add(educationProfile, hasDegree, education.getDegree());
			if (education.getUniversity() != null) {
				Resource universityProfile = model.createResource(educationUri + "/" + professional.getName()
						+ "/University/" + education.getUniversity().getName());
				model.add(educationProfile, doneInUniversity, universityProfile);
				if (education.getUniversity().getName() != null)
					model.add(universityProfile, hasName, education.getUniversity().getName());
				if (education.getUniversity().getFounded_id() != null)
					model.add(universityProfile, foundedIn, education.getUniversity().getFounded_id());
				if (education.getUniversity().getType() != null)
					model.add(universityProfile, hasType, education.getUniversity().getType());
				if (education.getUniversity().getAddress() != null)
					model.add(universityProfile, hasAdress, education.getUniversity().getAddress());
				if (education.getUniversity().getDirector() != null)
					model.add(universityProfile, hasDirector, education.getUniversity().getDirector());
				if (education.getUniversity().getNumberOfStudents() != null)
					model.add(universityProfile, hasNumberOfStudents, education.getUniversity().getNumberOfStudents());
				if (education.getUniversity().getNumberOfTeachers() != null)
					model.add(universityProfile, hasNumberOfTeachers, education.getUniversity().getNumberOfTeachers());
				if (education.getUniversity().getLanguageRegime() != null)
					model.add(universityProfile, hasLanguageRegime, education.getUniversity().getLanguageRegime());
			}

		}

		Iterator<JobCompany> past_companies = professional.getPast_companies().iterator();
		while (past_companies.hasNext()) {
			JobCompany past_post = past_companies.next();
			Resource past_postProfile = model
					.createResource(postUri + "/" + professional.getName() + "/Past_post/" + past_post.getTitle());
			model.add(professionalProfile, hadPosition, past_postProfile);
			if (past_post.getTitle() != null)
				model.add(past_postProfile, hasTitle, past_post.getTitle());
			if (past_post.getStart_date() != null)
				model.add(past_postProfile, startDate, past_post.getStart_date());
			if (past_post.getDuration() != null)
				model.add(past_postProfile, duration, past_post.getDuration());
			if (past_post.getDescription() != null)
				model.add(past_postProfile, description, past_post.getDescription());
			if (past_post.getJobCompany() != null) {
				Resource companyProfile = model.createResource(educationUri + "/" + professional.getName()
						+ "/Past_post/" + past_post.getTitle() + "/Company/" + past_post.getJobCompany());
				model.add(companyProfile, tookPlaceIn, companyProfile);
				if (past_post.getJobCompany().getCompany() != null)
					model.add(companyProfile, hasName, past_post.getCompany());
				if (past_post.getJobCompany().getWebsite() != null)
					model.add(companyProfile, hasWebsite, past_post.getJobCompany().getWebsite());
				if (past_post.getJobCompany().getStart_date() != null)
					model.add(companyProfile, foundedIn, past_post.getJobCompany().getStart_date());
				if (past_post.getJobCompany().getType() != null)
					model.add(companyProfile, hasType, past_post.getJobCompany().getType());
				if (past_post.getJobCompany().getAddress() != null)
					model.add(companyProfile, hasAdress, past_post.getJobCompany().getAddress());
				if (past_post.getJobCompany().getIndustry() != null)
					model.add(companyProfile, lineOfBusiness, past_post.getJobCompany().getIndustry());
				if (past_post.getJobCompany().getCompany_size() != null)
					model.add(companyProfile, hasEffective, past_post.getJobCompany().getCompany_size());
				if (past_post.getJobCompany().getFounder() != null)
					model.add(companyProfile, hasFounder, past_post.getJobCompany().getFounder());
				if (past_post.getJobCompany().getHeadquarters() != null)
					model.add(companyProfile, hasHeadquarters, past_post.getJobCompany().getHeadquarters());

			}
		}

		Iterator<Group> groups = professional.getGroups().iterator();
		while (groups.hasNext()) {
			Group group = groups.next();
			Resource groupProfile = model
					.createResource(groupUri + "/" + professional.getName() + "/Group/" + group.getName());
			model.add(professionalProfile, belongToGroup, groupProfile);
			if (group.getName() != null)
				model.add(groupProfile, hasName, group.getName());
			if (group.getLink() != null)
				model.add(groupProfile, hasLink, group.getLink());
		}

		Iterator<JobCompany> current_companies = professional.getCurrent_companies().iterator();
		while (current_companies.hasNext()) {
			JobCompany current_post = current_companies.next();
			Resource current_postProfile = model.createResource(
					postUri + "/" + professional.getName() + "/Current_post/" + current_post.getTitle());
			model.add(professionalProfile, hasPosition, current_postProfile);
			if (current_post.getTitle() != null)
				model.add(current_postProfile, hasTitle, current_post.getTitle());
			if (current_post.getStart_date() != null)
				model.add(current_postProfile, startDate, current_post.getStart_date());
			if (current_post.getDuration() != null)
				model.add(current_postProfile, duration, current_post.getDuration());
			if (current_post.getDescription() != null)
				model.add(current_postProfile, description, current_post.getDescription());
			if (current_post.getAddress() != null)
				model.add(current_postProfile, tookPlaceIn, current_post.getAddress());

		}

		Iterator<Skill> skills = professional.getSkillsOfprofessional().iterator();
		while (skills.hasNext()) {
			Skill skill = skills.next();
			Resource skillProfile = model
					.createResource(skillUri + "/" + professional.getName() + "/Skill/" + skill.getName());
			model.add(professionalProfile, hasSkill, skillProfile);
			if (skill.getName() != null)
				model.add(skillProfile, hasName, skill.getName());
			if (skill.getWebsite() != null)
				model.add(skillProfile, hasWebsite, skill.getWebsite());
			if (skill.getDateOfFirstVersion() != null)
				model.add(skillProfile, firstAppeared, skill.getDateOfFirstVersion());
			if (skill.getParadigm() != null)
				model.add(skillProfile, hasParadigm, skill.getParadigm());
			if (skill.getLastVersion() != null)
				model.add(skillProfile, lastVersion, skill.getLastVersion());
			if (skill.getDeveloper() != null)
				model.add(skillProfile, hasDeveloper, skill.getDeveloper());
			if (skill.getAuthor() != null)
				model.add(skillProfile, designedBy, skill.getAuthor());
			if (skill.getLicence() != null)
				model.add(skillProfile, hasLicence, skill.getLicence());
		}

		Iterator<String> skillsString = professional.getSkills().iterator();
		while (skillsString.hasNext()) {
			String skillString = skillsString.next();
			Resource skillProfile = model
					.createResource(skillUri + "/" + professional.getName() + "/Skill/" + skillString);
			model.add(professionalProfile, hasSkill, skillProfile);
			if (skillString != null)
				model.add(skillProfile, hasName, skillString);

		}

		Iterator<Project> projects = professional.getProjects().iterator();
		while (projects.hasNext()) {
			Project project = projects.next();
			Resource projectProfile = model
					.createResource(projectUri + "/" + professional.getName() + "/Project/" + project.getTitle());
			model.add(professionalProfile, didProject, projectProfile);
			if (project.getTitle() != null)
				model.add(projectProfile, hasTitle, project.getTitle());
			if (project.getStart_date() != null)
				model.add(projectProfile, startDate, project.getStart_date());
			if (project.getEnd_date() != null)
				model.add(projectProfile, endDate, project.getEnd_date());
			if (project.getDuration() != null)
				model.add(projectProfile, duration, project.getDuration());
			if (project.getDescription() != null)
				model.add(projectProfile, description, project.getDescription());
			if (project.getLink() != null)
				model.add(projectProfile, hasLink, project.getLink());
			if (project.getAssociates() != null) {
				Iterator<String> associates = project.getAssociates().iterator();
				while (associates.hasNext()) {
					String associate = associates.next();
					Resource associateProfile = model.createResource(postUri + "/" + professional.getName() + "/"
							+ project.getTitle() + "/Associate/" + associate);
					model.add(professionalProfile, hasAssociates, associateProfile);
					if (associate != null)
						model.add(projectProfile, hasName, associate);
				}
			}

		}

		Iterator<Certification> certifications = professional.getCertifications().iterator();
		while (certifications.hasNext()) {
			Certification certification = certifications.next();
			Resource certificationProfile = model.createResource(
					certificationUri + "/" + professional.getName() + "/Certification/" + certification.getTitle());
			model.add(professionalProfile, hasCertification, certificationProfile);
			if (certification.getWebsite() != null)
				model.add(certificationProfile, hasWebsite, certification.getWebsite());
			if (certification.getScore() != null)
				model.add(certificationProfile, hasScore, certification.getScore());
			if (certification.getHasField() != null)
				model.add(certificationProfile, hasField, certification.getHasField());
			if (certification.getCreatedBy() != null)
				model.add(certificationProfile, createdBy, certification.getCreatedBy());
			if (certification.getAdministredBy() != null)
				model.add(certificationProfile, administredBy, certification.getAdministredBy());
			if (certification.getMaximumScore() != null)
				model.add(certificationProfile, hasMaximumScore, certification.getMaximumScore());
			if (certification.getRelatedSkill() != null)
				model.add(certificationProfile, relatedSkill, certification.getRelatedSkill());
		}

		Iterator<String> organizations = professional.getOrganizations().iterator();
		while (certifications.hasNext()) {
			String organization = organizations.next();
			Resource organizationProfile = model
					.createResource(organizationUri + "/" + professional.getName() + "/Organization/" + organization);
			model.add(professionalProfile, joinOrganization, organizationProfile);
			if (organization != null)
				model.add(organizationProfile, hasLink, organization);
		}

		Iterator<String> languages = professional.getOrganizations().iterator();
		while (languages.hasNext()) {
			String language = languages.next();
			Resource languageProfile = model
					.createResource(languageUri + "/" + professional.getName() + "/Language/" + language);
			model.add(professionalProfile, speacksLanguage, languageProfile);
			if (language != null)
				model.add(professionalProfile, hasName, language);
		}

		if (professional.getFriends() != null) {
			Iterator<Professional> friends = professional.getFriends().iterator();
			while (friends.hasNext()) {
				Professional friend = friends.next();
				Resource friendProfile = model
						.createResource(professionalUri + "/" + professional.getName() + "/Friend/" + friend.getName());
				model.add(professionalProfile, hasFriend, friendProfile);
				if (friend.getName() != null)
					model.add(friendProfile, name, friend.getName());
				if (friend.getFirst_name() != null)
					model.add(friendProfile, first_name, friend.getFirst_name());
				if (friend.getLast_name() != null)
					model.add(friendProfile, last_name, friend.getLast_name());
				if (friend.getTitle() != null)
					model.add(friendProfile, title, friend.getTitle());
				if (friend.getSummary() != null)
					model.add(friendProfile, summary, friend.getSummary());
				if (friend.getLocation() != null)
					model.add(friendProfile, location, friend.getLocation());
				if (friend.getNumber_of_connections() != null)
					model.add(friendProfile, number_of_connections, professional.getNumber_of_connections());
				if (friend.getCountry() != null)
					model.add(friendProfile, country, friend.getCountry());
				if (friend.getIndustry() != null)
					model.add(friendProfile, industry, friend.getIndustry());
				if (friend.getPicture() != null)
					model.add(friendProfile, picture, friend.getPicture());
				if (friend.getLinkedin_url() != null)
					model.add(friendProfile, linkedin_url, friend.getLinkedin_url());
			}
		}

		if (professional.getRecommended_visitors() != null) {
			Iterator<Professional> visitors = professional.getRecommended_visitors().iterator();
			while (visitors.hasNext()) {
				Professional visitor = visitors.next();
				Resource visitorProfile = model.createResource(
						professionalUri + "/" + professional.getName() + "/Recommended_visitor/" + visitor.getName());
				model.add(professionalProfile, hasRecommandedVisitor, visitorProfile);
				if (visitor.getName() != null)
					model.add(visitorProfile, name, visitor.getName());
				if (visitor.getFirst_name() != null)
					model.add(visitorProfile, first_name, visitor.getFirst_name());
				if (visitor.getLast_name() != null)
					model.add(visitorProfile, last_name, visitor.getLast_name());
				if (visitor.getTitle() != null)
					model.add(visitorProfile, title, visitor.getTitle());
				if (visitor.getSummary() != null)
					model.add(visitorProfile, summary, visitor.getSummary());
				if (visitor.getLocation() != null)
					model.add(visitorProfile, location, visitor.getLocation());
				if (visitor.getNumber_of_connections() != null)
					model.add(visitorProfile, number_of_connections, professional.getNumber_of_connections());
				if (visitor.getCountry() != null)
					model.add(visitorProfile, country, visitor.getCountry());
				if (visitor.getIndustry() != null)
					model.add(visitorProfile, industry, visitor.getIndustry());
				if (visitor.getPicture() != null)
					model.add(visitorProfile, picture, visitor.getPicture());
				if (visitor.getLinkedin_url() != null)
					model.add(visitorProfile, linkedin_url, visitor.getLinkedin_url());
			}
		}

		model.write(System.out);

	}
}
