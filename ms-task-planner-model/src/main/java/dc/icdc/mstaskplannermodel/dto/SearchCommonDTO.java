package  dc.icdc.mstaskplannermodel.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.Getter;

@Data
@Getter
public
class SearchCommonDTO {
    @JsonProperty(value = "search")
    String search;
}
