package dc.idc.bff.msbffrmsservice.service;

import dc.icdc.lib.common.model.dto.CommonResponse;
import dc.icdc.mstaskplannermodel.dto.SearchProjectRequest;
import dc.icdc.mstaskplannersdk.service.CreateTaskSdk;
//import dc.icdc.mstechnicalprofilesdk.service.CreateProfileSdk;

public class TechnicalProfileService {

    private CreateTaskSdk createTaskSdk;

    public CommonResponse<SearchProjectRequest> searchTaskRequest(SearchProjectRequest searchTaskRequest){
        return createTaskSdk.createNewTechnicalProfile(searchTaskRequest);
    }
}
