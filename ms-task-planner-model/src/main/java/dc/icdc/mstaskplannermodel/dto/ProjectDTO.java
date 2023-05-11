package dc.icdc.mstaskplannermodel.dto;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;


import lombok.*;
//import jakarta.validation.constraints.NotNull;
import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
public class ProjectDTO  {
    @JsonProperty(value = "id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String id = null;
    @JsonProperty(value = "project_name")
//    @NotNull(message = "project name is mandatory")
    private String projName;
    @JsonProperty(value = "start_date")
    private Date startDate;
    @JsonProperty(value = "end_date")
    private Date endDate;
    @JsonProperty(value = "pic")
    private String pic;
    @JsonProperty(value = "project_status")
    private int projStatus;
    @JsonProperty(value = "priority")
    private String priority;
    @JsonProperty(value = "project_type")
    private String projType;
    @JsonProperty(value = "account")
    private ProjectAccountDTO projectAccounts;
    @JsonProperty(value = "project_roles")
    private List<ProjectRoleReqDTO> projectRoleReqs;

    @JsonProperty(value = "project_resources")
    @JsonAlias("resources")
    private List<ProjectResourcesDTO> ResourcesList;

    @JsonProperty(value = "availability")
    @JsonAlias(value = "availabilities")
    private AvailabilityDTO availability;

    @JsonProperty(value = "project_skills")
    private List<ProjectSkillRequiredDTO> projectSkills;
    @JsonProperty(value = "project_locations")
    private List<ProjectLocationDTO> projectLocations;







}
