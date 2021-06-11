package kodlamaio.HRMS.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import kodlamaio.HRMS.entities.concretes.User;

@Repository
public interface UserDao<T extends User> extends JpaRepository<T, Integer> {
	 User findUserByEmail(String email);
}