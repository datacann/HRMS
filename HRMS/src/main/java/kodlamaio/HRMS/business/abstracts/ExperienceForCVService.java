package kodlamaio.HRMS.business.abstracts;

import java.util.List;

import kodlamaio.HRMS.core.utilities.results.DataResult;
import kodlamaio.HRMS.core.utilities.results.Result;
import kodlamaio.HRMS.entities.concretes.ExperienceForCV;

public interface ExperienceForCVService {
	Result add(ExperienceForCV experienceForCV);
	Result update(ExperienceForCV experienceForCV);
	Result delete(int id);
	DataResult<ExperienceForCV> getById(int id);	
	DataResult<List<ExperienceForCV>> getAll();
	DataResult<List<ExperienceForCV>> getAllByJobseekerIdOrderByEndAtDesc(int id);
	DataResult<List<ExperienceForCV>> getAllByJobseekerId(int id);
}