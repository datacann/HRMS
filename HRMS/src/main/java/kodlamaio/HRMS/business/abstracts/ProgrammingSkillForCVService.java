package kodlamaio.HRMS.business.abstracts;

import java.util.List;

import kodlamaio.HRMS.core.utilities.results.DataResult;
import kodlamaio.HRMS.core.utilities.results.Result;
import kodlamaio.HRMS.entities.concretes.ProgrammingSkillForCV;

public interface ProgrammingSkillForCVService {
	Result add(ProgrammingSkillForCV programmingSkillForCV);
	Result update(ProgrammingSkillForCV programmingSkillForCV);
	Result delete(int id);
	DataResult<ProgrammingSkillForCV> getById(int id);	
	DataResult<List<ProgrammingSkillForCV>> getAll();
	DataResult<List<ProgrammingSkillForCV>> getAllByJobseekerId(int id);
}