package babinski.sebastian.GoldRateApi.webclient.goldrate;

import babinski.sebastian.GoldRateApi.model.GoldRateDto;
import babinski.sebastian.GoldRateApi.webclient.goldrate.dto.GoldGoldRateDto;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class GoldRateClient {

    public static final String GOLDRATE_URL = "http://api.nbp.pl/api/";
    private RestTemplate restTemplate = new RestTemplate();

    public GoldRateDto getGoldRateForDate(String date) {
        GoldGoldRateDto goldGoldRateDto = callGetMethod("cenyzlota/{date}",
                GoldGoldRateDto.class,
                date);

        return GoldRateDto.builder()
                .dataMoja(goldGoldRateDto.getDateDto().getData())
                .cenaMoja(goldGoldRateDto.getPriceDto().getCena())
                .build();
    }

    private <T> T callGetMethod(String url, Class<T> responseType, Object... objects) {
        return restTemplate.getForObject(GOLDRATE_URL + url, responseType, objects);
    }
}
