package dc.icdc.mstaskplannermodel.dto;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Builder
public class ProjectSkillRequiredDTO{
    @JsonProperty(value = "id")
    private int id;
    @JsonProperty(value = "skill_name")
    private String skill;

}
