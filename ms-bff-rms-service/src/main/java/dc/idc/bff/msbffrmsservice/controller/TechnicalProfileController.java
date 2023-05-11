package dc.idc.bff.msbffrmsservice.controller;

//import dc.icdc.domain.technicalprofile.model.dto.CreateTechProfileRequest;
import dc.icdc.lib.common.model.dto.CommonResponse;
import dc.icdc.mstaskplannermodel.dto.ProjectLessDTO;
import dc.icdc.mstaskplannermodel.dto.SearchProjectDTO;
//import dc.icdc.mstaskplannermodel.dto.SearchProjectRequest;
import dc.icdc.mstaskplannersdk.service.CreateTaskSdk;
import dc.idc.bff.msbffrmsservice.service.TechnicalProfileService;
import lombok.extern.slf4j.Slf4j;

import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping(value = {"/task-planner/v1.0/project"})
@CrossOrigin(origins = "http://localhost:3000")
public class TechnicalProfileController {
private TechnicalProfileService technicalProfileService;
    @PostMapping("/search")
    public CommonResponse<Page<ProjectLessDTO>> createNewTechnicalProfile(@RequestBody SearchProjectDTO request) {
        return technicalProfileService.searchTaskRequest(request);
    }
}
