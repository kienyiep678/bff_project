package dc.icdc.mstaskplannermodel.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
public class ProjectLocationDTO {
    @JsonProperty(value = "id")
    private int id;
    @JsonProperty(value = "location_name")
    private String location;

}
