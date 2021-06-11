package kodlamaio.HRMS.business.abstracts;

import java.util.List;

import kodlamaio.HRMS.core.utilities.results.DataResult;
import kodlamaio.HRMS.core.utilities.results.Result;
import kodlamaio.HRMS.entities.concretes.CoverLetterForCV;

public interface CoverLetterForCVService {

	Result add(CoverLetterForCV coverLetterForCV);
	Result update(CoverLetterForCV coverLetterForCV);
	Result delete(int id);
	DataResult<CoverLetterForCV> getById(int id);	
	DataResult<List<CoverLetterForCV>> getAll();
}