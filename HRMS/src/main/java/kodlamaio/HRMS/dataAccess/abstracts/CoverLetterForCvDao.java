package kodlamaio.HRMS.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.HRMS.entities.concretes.CoverLetterForCV;

public interface CoverLetterForCvDao extends JpaRepository<CoverLetterForCV, Integer>{
	CoverLetterForCV getById(int id);
}