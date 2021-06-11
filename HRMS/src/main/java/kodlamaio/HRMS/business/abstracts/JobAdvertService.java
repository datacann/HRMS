package kodlamaio.HRMS.business.abstracts;

import java.util.List;

import kodlamaio.HRMS.core.utilities.results.DataResult;
import kodlamaio.HRMS.core.utilities.results.Result;
import kodlamaio.HRMS.entities.concretes.JobAdvert;

public interface JobAdvertService {
    Result add(JobAdvert jobAdvert);

    Result update(JobAdvert jobAdvert);

    Result delete(int id);

    DataResult<JobAdvert> getById(int id);

    DataResult<List<JobAdvert>> getAll();

    Result changeOpenToClose(int id);

    DataResult<List<JobAdvert>> getAllOpenJobAdvertList();

    DataResult<List<JobAdvert>> findAllByOrderByPublishedAt();

    DataResult<List<JobAdvert>> getAllOpenJobAdvertByEmployer(int id);
}