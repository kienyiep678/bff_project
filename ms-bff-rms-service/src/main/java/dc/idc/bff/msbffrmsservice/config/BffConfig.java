package dc.idc.bff.msbffrmsservice.config;

import dc.icdc.lib.common.config.EnableCommonLib;
import dc.icdc.lib.hi.config.EnableHostIntegrationLib;
//import dc.icdc.mscalendarsdk.config.EnableCalendarSdk;
import dc.icdc.mstaskplannersdk.config.EnableTaskSdk;
import org.springframework.context.annotation.Configuration;

@EnableCommonLib
@EnableHostIntegrationLib
@EnableTaskSdk
//@EnableCalendarSdk
@Configuration
public class BffConfig {

}