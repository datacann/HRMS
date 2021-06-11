package kodlamaio.HRMS.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.HRMS.entities.concretes.ImageForCV;

public interface ImageForCVDao extends JpaRepository<ImageForCV, Integer>{

	ImageForCV getById(int id);
	ImageForCV getByJobseeker_id(int id);
}