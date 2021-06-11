package kodlamaio.HRMS.business.abstracts;

import java.util.List;

import kodlamaio.HRMS.core.utilities.results.DataResult;
import kodlamaio.HRMS.core.utilities.results.Result;
import kodlamaio.HRMS.entities.concretes.ForeignLanguageForCV;

public interface ForeignLanguageForCVService {
	Result add(ForeignLanguageForCV foreignLanguageForCV);
	Result update(ForeignLanguageForCV foreignLanguageForCV);
	Result delete(int id);
	DataResult<ForeignLanguageForCV> getById(int id);	
	DataResult<List<ForeignLanguageForCV>> getAll();
	DataResult<List<ForeignLanguageForCV>> getAllByJobseekerId(int id);
}