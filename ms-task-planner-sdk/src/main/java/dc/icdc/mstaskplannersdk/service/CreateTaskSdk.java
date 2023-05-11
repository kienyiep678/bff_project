package dc.icdc.mstaskplannersdk.service;

import dc.icdc.lib.common.model.dto.CommonResponse;
import dc.icdc.lib.hi.helper.HostIntegrationHelper;
import dc.icdc.lib.hi.model.dto.HostIntegrationDTO;
//import dc.icdc.mstaskplannermodel.dto.GetProjectDetailsResponse;
import dc.icdc.mstaskplannermodel.dto.ProjectLessDTO;
import dc.icdc.mstaskplannermodel.dto.SearchProjectDTO;
//import dc.icdc.mstaskplannermodel.dto.SearchProjectRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.RequestBody;

public class CreateTaskSdk {

    @Autowired
    private HostIntegrationHelper hostIntegrationHelper;


    public CommonResponse<Page<ProjectLessDTO>> findAllProject(@RequestBody SearchProjectDTO request) {
        HostIntegrationDTO<SearchProjectDTO, CommonResponse<Page<ProjectLessDTO>>> integrationDTO =
                HostIntegrationDTO.<SearchProjectDTO, CommonResponse<Page<ProjectLessDTO>>>builder()
                        .serviceName("search-task-planner")
                        .requestBody(request)
                        .outputParameterizedTypeReference(new ParameterizedTypeReference<CommonResponse<Page<ProjectLessDTO>>>() {})
                        .build();
        return hostIntegrationHelper.integrate(integrationDTO);
    }

//    public CommonResponse<HolidayTempDTO> addHolidayRequest(@RequestBody @Valid HolidayTempDTO holidayTempDTO){
//        HostIntegrationDTO<HolidayTempDTO,CommonResponse<HolidayTempDTO>> integrationDTO =
//                HostIntegrationDTO.<HolidayTempDTO,CommonResponse<HolidayTempDTO>>builder()
//                        .serviceName("add-holiday")
//                        .requestBody(holidayTempDTO)
//                        .outputParameterizedTypeReference(new ParameterizedTypeReference<CommonResponse<HolidayTempDTO>>(){})
//                        .build();
//        return hostIntegrationHelper.integrate(integrationDTO);
//    }

}
