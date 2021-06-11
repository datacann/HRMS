package kodlamaio.HRMS.entities.dtos;

import java.util.List;

import kodlamaio.HRMS.entities.concretes.ExperienceForCV;
import kodlamaio.HRMS.entities.concretes.ForeignLanguageForCV;
import kodlamaio.HRMS.entities.concretes.ImageForCV;
import kodlamaio.HRMS.entities.concretes.Jobseeker;
import kodlamaio.HRMS.entities.concretes.LinkForCV;
import kodlamaio.HRMS.entities.concretes.ProgrammingSkillForCV;
import kodlamaio.HRMS.entities.concretes.SchoolForCV;



public class JobSeekerCVDto {

	public Jobseeker jobseeker;
	public List<SchoolForCV> schools;
	public List<ProgrammingSkillForCV> programingSkills;
	public List<LinkForCV> links;
	public List<ForeignLanguageForCV> languages;
	public List<ExperienceForCV> experiences;
	public ImageForCV image;
}