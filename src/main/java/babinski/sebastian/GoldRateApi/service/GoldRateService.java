package babinski.sebastian.GoldRateApi.service;

import babinski.sebastian.GoldRateApi.model.GoldRateDto;
import babinski.sebastian.GoldRateApi.webclient.goldrate.GoldRateClient;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@Slf4j
@RequiredArgsConstructor
public class GoldRateService {

    private final GoldRateClient goldRateClient;

    public GoldRateDto getGoldRate() {
        return goldRateClient.getGoldRateForDate("2021-08-30");

    }


}
