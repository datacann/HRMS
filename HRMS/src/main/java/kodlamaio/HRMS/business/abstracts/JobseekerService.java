package kodlamaio.HRMS.business.abstracts;

import java.util.List;

import kodlamaio.HRMS.core.utilities.results.DataResult;
import kodlamaio.HRMS.core.utilities.results.Result;
import kodlamaio.HRMS.entities.concretes.Jobseeker;
import kodlamaio.HRMS.entities.dtos.JobSeekerCVDto;

public interface JobseekerService {
	
    DataResult<List<Jobseeker>> getAll();

    Result add(Jobseeker candidateUser);

    Result update(Jobseeker jobseeker);
    
	Result delete(int id);
	
	DataResult<Jobseeker> getById(int id);
	
	DataResult<Jobseeker> getJobseekerByNationalId(String nationalId);
	
	DataResult<JobSeekerCVDto> getJobseekerCVById(int id);
	
	
	
	
}