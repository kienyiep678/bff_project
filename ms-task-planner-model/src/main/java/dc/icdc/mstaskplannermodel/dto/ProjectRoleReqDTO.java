package dc.icdc.mstaskplannermodel.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProjectRoleReqDTO {
    @JsonProperty(value = "count")
    private int count;
    @JsonProperty(value = "project_role")
    private String projectRole;
    @JsonProperty(value="id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String id;
}
