package kodlamaio.HRMS.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.HRMS.business.abstracts.CoverLetterForCVService;
import kodlamaio.HRMS.core.utilities.results.DataResult;
import kodlamaio.HRMS.core.utilities.results.Result;
import kodlamaio.HRMS.core.utilities.results.SuccessDataResult;
import kodlamaio.HRMS.core.utilities.results.SuccessResult;
import kodlamaio.HRMS.dataAccess.abstracts.CoverLetterForCvDao;
import kodlamaio.HRMS.entities.concretes.CoverLetterForCV;

@Service
public class CoverLetterForCVManager implements CoverLetterForCVService{

	private CoverLetterForCvDao coverLetterForCvDao;
	
	@Autowired
	public CoverLetterForCVManager(CoverLetterForCvDao coverLetterForCvDao) {
		super();
		this.coverLetterForCvDao = coverLetterForCvDao;
	}

	@Override
	public Result add(CoverLetterForCV coverLetterForCV) {
		this.coverLetterForCvDao.save(coverLetterForCV);
		return new SuccessResult("Cover letter has been added.");
	}

	@Override
	public Result update(CoverLetterForCV coverLetterForCV) {
		this.coverLetterForCvDao.save(coverLetterForCV);
		return new SuccessResult("Cover letter has been updated.");
	}

	@Override
	public Result delete(int id) {
		this.coverLetterForCvDao.deleteById(id);
        return new SuccessResult("Cover letter has been deleted.");
	}

	@Override
	public DataResult<CoverLetterForCV> getById(int id) {
		return new SuccessDataResult<CoverLetterForCV>(this.coverLetterForCvDao.getById(id));
	}

	@Override
	public DataResult<List<CoverLetterForCV>> getAll() {
		return new SuccessDataResult<List<CoverLetterForCV>>(this.coverLetterForCvDao.findAll());
	}

}