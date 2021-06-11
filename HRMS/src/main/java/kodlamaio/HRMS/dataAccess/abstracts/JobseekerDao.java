package kodlamaio.HRMS.dataAccess.abstracts;

import org.springframework.stereotype.Repository;

import kodlamaio.HRMS.entities.concretes.Jobseeker;

@Repository
public interface JobseekerDao extends UserDao<Jobseeker> {
	 Jobseeker findJobseekerByNationalId(String nationalId);
	 Jobseeker getById(int id);
}