package kodlamaio.HRMS.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "cv_foreign_languages")
@NoArgsConstructor
@AllArgsConstructor
public class ForeignLanguageForCV extends Base{
	
	@Column(name = "language")
	private String language;
	
	@Column(name = "level")
	private int level;	

	@ManyToOne()
	@JoinColumn(name = "jobseeker_id")
	private Jobseeker jobseeker;
}