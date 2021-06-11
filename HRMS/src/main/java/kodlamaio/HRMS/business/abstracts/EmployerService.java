package kodlamaio.HRMS.business.abstracts;

import kodlamaio.HRMS.core.utilities.results.Result;

import java.util.List;

import kodlamaio.HRMS.core.utilities.results.DataResult;
import kodlamaio.HRMS.entities.concretes.Employer;

public interface EmployerService {
    DataResult<List<Employer>> getAll();

    Result add(Employer employerUser);
}