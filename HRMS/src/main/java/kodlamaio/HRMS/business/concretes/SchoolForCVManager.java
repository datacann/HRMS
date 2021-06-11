package kodlamaio.HRMS.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.HRMS.business.abstracts.SchoolForCVService;
import kodlamaio.HRMS.core.utilities.results.DataResult;
import kodlamaio.HRMS.core.utilities.results.Result;
import kodlamaio.HRMS.core.utilities.results.SuccessDataResult;
import kodlamaio.HRMS.core.utilities.results.SuccessResult;
import kodlamaio.HRMS.dataAccess.abstracts.SchoolForCVDao;
import kodlamaio.HRMS.entities.concretes.SchoolForCV;

@Service
public class SchoolForCVManager implements SchoolForCVService{

	private SchoolForCVDao schoolForCVDao;
		
	@Autowired
	public SchoolForCVManager(SchoolForCVDao schoolForCVDao) {
		super();
		this.schoolForCVDao = schoolForCVDao;
	}

	@Override
	public Result add(SchoolForCV schoolForCV) {
		this.schoolForCVDao.save(schoolForCV);
		return new SuccessResult("Programming skill has been added.");
	}

	@Override
	public Result update(SchoolForCV schoolForCV) {
		this.schoolForCVDao.save(schoolForCV);
		return new SuccessResult("Programming skill has been updated.");
	}

	@Override
	public Result delete(int id) {
		this.schoolForCVDao.deleteById(id);
		return new SuccessResult("Programming skill has been deleted.");
	}

	@Override
	public DataResult<SchoolForCV> getById(int id) {
		return new SuccessDataResult<SchoolForCV>(this.schoolForCVDao.getById(id));
	}

	@Override
	public DataResult<List<SchoolForCV>> getAll() {
		return new SuccessDataResult<List<SchoolForCV>>(this.schoolForCVDao.findAll());
	}

	@Override
	public DataResult<List<SchoolForCV>> getAllByJobseekerIdOrderByEndAtDesc(int id) {
		return new SuccessDataResult<List<SchoolForCV>>(this.schoolForCVDao.getAllByJobseeker_idOrderByEndAtDesc(id));
	}

	@Override
	public DataResult<List<SchoolForCV>> getAllByJobseekerId(int id) {
		return new SuccessDataResult<List<SchoolForCV>>(this.schoolForCVDao.getAllByJobseeker_id(id));
	}

}