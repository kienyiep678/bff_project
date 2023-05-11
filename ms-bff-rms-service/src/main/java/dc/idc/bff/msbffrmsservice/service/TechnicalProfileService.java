package dc.idc.bff.msbffrmsservice.service;

import org.springframework.data.domain.Page;

import dc.icdc.lib.common.model.dto.CommonResponse;
import dc.icdc.mstaskplannermodel.dto.ProjectLessDTO;
import dc.icdc.mstaskplannermodel.dto.SearchProjectDTO;
//import dc.icdc.mstaskplannermodel.dto.SearchProjectRequest;
import dc.icdc.mstaskplannersdk.service.CreateTaskSdk;
//import dc.icdc.mstechnicalprofilesdk.service.CreateProfileSdk;

public class TechnicalProfileService {

    private CreateTaskSdk createTaskSdk;

    public CommonResponse<Page<ProjectLessDTO>> searchTaskRequest(SearchProjectDTO searchProjectDTO){
        return createTaskSdk.findAllProject(searchProjectDTO);
    }
}
