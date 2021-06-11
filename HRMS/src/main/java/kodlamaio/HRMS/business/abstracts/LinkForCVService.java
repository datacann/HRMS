package kodlamaio.HRMS.business.abstracts;

import java.util.List;

import kodlamaio.HRMS.core.utilities.results.DataResult;
import kodlamaio.HRMS.core.utilities.results.Result;
import kodlamaio.HRMS.entities.concretes.LinkForCV;

public interface LinkForCVService {
	Result add(LinkForCV linkForCV);
	Result update(LinkForCV linkForCV);
	Result delete(int id);
	DataResult<LinkForCV> getById(int id);	
	DataResult<List<LinkForCV>> getAll();
	DataResult<List<LinkForCV>> getAllByJobseekerId(int id);
}