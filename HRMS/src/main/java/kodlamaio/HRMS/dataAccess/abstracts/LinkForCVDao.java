package kodlamaio.HRMS.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.HRMS.entities.concretes.LinkForCV;

public interface LinkForCVDao extends JpaRepository<LinkForCV, Integer>{
	LinkForCV getById(int id);
	List<LinkForCV> getAllByJobseeker_id(int id);
}