package kodlamaio.HRMS.business.abstracts;

import java.util.List;

import kodlamaio.HRMS.core.utilities.results.DataResult;
import kodlamaio.HRMS.core.utilities.results.Result;
import kodlamaio.HRMS.entities.concretes.City;

public interface CityService {
    Result add(City city);

    Result update(City city);

    Result delete(int id);

    DataResult<City> getById(int id);

    DataResult<List<City>> getAll();
}