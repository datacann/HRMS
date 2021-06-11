package kodlamaio.HRMS.dataAccess.abstracts;


import org.springframework.stereotype.Repository;

import kodlamaio.HRMS.entities.concretes.Employer;

@Repository
public interface EmployerDao extends UserDao<Employer> {
	
}