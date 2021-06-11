package kodlamaio.HRMS.business.abstracts;

import kodlamaio.HRMS.core.utilities.results.Result;
import kodlamaio.HRMS.entities.concretes.Employer;
import kodlamaio.HRMS.entities.concretes.Jobseeker;

public interface AuthService {

    Result registerEmployer(Employer employer, String confirmPassword);

    //
    Result registerJobseeker(Jobseeker jobseeker, String confirmPassword);
}