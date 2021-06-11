package kodlamaio.HRMS.entities.concretes;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "cities")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","jobAdverts"})

public class City extends Base {
   

    @Column(name = "name")
    private String name;

    @OneToMany(mappedBy = "city")
    private List<JobAdvert> jobAdverts;
    
   
}