package kodlamaio.HRMS.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.HRMS.business.abstracts.JobAdvertService;
import kodlamaio.HRMS.core.utilities.results.DataResult;
import kodlamaio.HRMS.core.utilities.results.ErrorResult;
import kodlamaio.HRMS.core.utilities.results.Result;
import kodlamaio.HRMS.core.utilities.results.SuccessDataResult;
import kodlamaio.HRMS.core.utilities.results.SuccessResult;
import kodlamaio.HRMS.dataAccess.abstracts.JobAdvertDao;
import kodlamaio.HRMS.entities.concretes.JobAdvert;

@Service
public class JobAdvertManager implements JobAdvertService {
    private JobAdvertDao jobAdvertDao;
    @Autowired
    public JobAdvertManager(JobAdvertDao jobAdvertDao) {
        this.jobAdvertDao = jobAdvertDao;
    }
    @Override
    public Result add(JobAdvert jobAdvert) {
        if (!CheckIfNullField(jobAdvert)) {
            return new ErrorResult("Eksik bilgi girdiniz. Lütfen bütün boşlukları doldurun");
        }
        this.jobAdvertDao.save(jobAdvert);
        return new SuccessResult("İş ilanı eklendi");
    }
    @Override
    public Result update(JobAdvert jobAdvert) {
        this.jobAdvertDao.save(jobAdvert);
        return new SuccessResult("İş ilanı güncellendi");
    }
    @Override
    public Result delete(int id) {
        this.jobAdvertDao.deleteById(id);
        return new SuccessResult("İş ilanı silindi");
    }
    @Override
    public DataResult<JobAdvert> getById(int id) {
        return new SuccessDataResult<JobAdvert>(this.jobAdvertDao.getOne(id));
    }

    @Override
    public DataResult<List<JobAdvert>> getAll() {
        return new SuccessDataResult<List<JobAdvert>>(this.jobAdvertDao.findAll());
    }
    @Override
    public Result changeOpenToClose(int id) {
        if (getById(id) == null) {
            return new ErrorResult("Böyle bir iş ilanı yok");

        }
        if (getById(id).getData().isOpen() == false) {
            return new ErrorResult("Orada iş ilanı zaten kapalı");
        }

        JobAdvert jobAdvert = getById(id).getData();
        jobAdvert.setOpen(false);
        update(jobAdvert);
        return new SuccessResult("İş ilanı başarıyla kapatılmıştır");
    }
    @Override
    public DataResult<List<JobAdvert>> getAllOpenJobAdvertList() {
        return new SuccessDataResult<List<JobAdvert>>(this.jobAdvertDao.getAllOpenJobAdvertList());
    }

    @Override
    public DataResult<List<JobAdvert>> findAllByOrderByPublishedAt() {
        return new SuccessDataResult<List<JobAdvert>>(this.jobAdvertDao.findAllByOrderByPublishedAtDesc());
    }

    @Override
    public DataResult<List<JobAdvert>> getAllOpenJobAdvertByEmployer(int id) {
        return new SuccessDataResult<List<JobAdvert>>(this.jobAdvertDao.getAllOpenJobAdvertByEmployer(id));
    }
    private boolean CheckIfNullField(JobAdvert jobAdvert) {
        if (jobAdvert.getJobPosition() != null && jobAdvert.getDescription() != null && jobAdvert.getCity() != null
                && jobAdvert.getOpenPositionCount() != 0) {
            return true;
        }
        return false;
    }
}