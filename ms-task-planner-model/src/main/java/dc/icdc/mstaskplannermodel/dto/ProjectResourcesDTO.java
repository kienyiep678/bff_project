package dc.icdc.mstaskplannermodel.dto;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProjectResourcesDTO{
    @JsonProperty(value = "id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String id;
    @JsonProperty(value = "remarks")
    private String remarks;
    @JsonProperty(value = "role")
    private String projRole;
    @JsonProperty(value = "email")
    private String email;
    @JsonProperty(value = "resource_name")
    @JsonAlias(value = "name")
    private String resourceName;
    @JsonProperty(value = "user_id")
    private String userId;
    @JsonProperty(value = "tech_id")
    private String techId;
    @JsonProperty(value = "skills")
    private String skills;
}
