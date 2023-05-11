package dc.icdc.mstaskplannermodel.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AvailabilityDTO {
    @JsonProperty(value = "availability_period")
    private List<Integer> availablePeriod;

    @JsonProperty(value = "id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String id;
}
