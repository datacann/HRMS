package kodlamaio.HRMS.business.abstracts;

import java.util.List;

import kodlamaio.HRMS.core.utilities.results.DataResult;
import kodlamaio.HRMS.core.utilities.results.Result;
import kodlamaio.HRMS.entities.concretes.User;

public interface UserService<T extends User> {
	
    DataResult<List<T>> getAll();
    DataResult<User> getUserByEmail(String email);
    Result add(T user);
}