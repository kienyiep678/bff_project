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
public class ProjectAccountDTO {
    @JsonProperty(value = "account_name")
    private String accountName;
    @JsonProperty(value="id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String id;
}
