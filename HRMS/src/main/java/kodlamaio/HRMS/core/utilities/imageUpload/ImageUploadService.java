package kodlamaio.HRMS.core.utilities.imageUpload;


import java.util.Map;

import org.springframework.web.multipart.MultipartFile;

import kodlamaio.HRMS.core.utilities.results.DataResult;

public interface ImageUploadService {

	DataResult<Map> uploadImageFile(MultipartFile imageFile);
}