package kodlamaio.HRMS.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import kodlamaio.HRMS.business.abstracts.JobPositionService;
import kodlamaio.HRMS.core.utilities.results.DataResult;
import kodlamaio.HRMS.core.utilities.results.Result;
import  kodlamaio.HRMS.entities.concretes.JobPosition;

@RestController
@RequestMapping("/api/jobpositions")
public class JobPositionsController {
    private JobPositionService jobPositionService;

    @Autowired
    public JobPositionsController(JobPositionService jobPositionService) {
        this.jobPositionService = jobPositionService;
    }

    @PostMapping("/add")
    public Result add(@RequestBody JobPosition jobPosition){
        return this.jobPositionService.add(jobPosition);
    }
//
//	@PostMapping("/update")
//	public Result update(@RequestBody JobPosition jobPosition){
//		return this.jobPositionService.update(jobPosition);
//	}
//
//	@PostMapping("/delete")
//	public Result delete(@PathVariable("id") int id){
//		return this.jobPositionService.delete(id);
//	}
//
//	@GetMapping("/getbyid")
//	public DataResult<JobPosition> getById(@PathVariable("id") int id){
//		return this.jobPositionService.getById(id);
//	}

    @GetMapping("/getall")
    public DataResult<List<JobPosition>> getAll(){
        return this.jobPositionService.getAll();
    }
}