package kodlamaio.HRMS.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.HRMS.entities.concretes.ForeignLanguageForCV;

public interface ForeignLanguageForCvDao extends JpaRepository<ForeignLanguageForCV, Integer>{
	ForeignLanguageForCV getById(int id);
	List<ForeignLanguageForCV> getAllByJobseeker_id(int id);
}