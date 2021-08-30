package babinski.sebastian.GoldRateApi.model;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class GoldRateDto {
    private String dataMoja;
    private float cenaMoja;
}
