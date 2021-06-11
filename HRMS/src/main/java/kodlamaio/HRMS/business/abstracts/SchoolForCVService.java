package kodlamaio.HRMS.business.abstracts;

import java.util.List;

import kodlamaio.HRMS.core.utilities.results.DataResult;
import kodlamaio.HRMS.core.utilities.results.Result;
import kodlamaio.HRMS.entities.concretes.SchoolForCV;

public interface SchoolForCVService {
	Result add(SchoolForCV schoolForCV);
	Result update(SchoolForCV schoolForCV);
	Result delete(int id);
	DataResult<SchoolForCV> getById(int id);	
	DataResult<List<SchoolForCV>> getAll();
	DataResult<List<SchoolForCV>> getAllByJobseekerIdOrderByEndAtDesc(int id);
	DataResult<List<SchoolForCV>> getAllByJobseekerId(int id);
}