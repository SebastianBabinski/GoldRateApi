package babinski.sebastian.GoldRateApi.controller;

import babinski.sebastian.GoldRateApi.model.GoldRateDto;
import babinski.sebastian.GoldRateApi.service.GoldRateService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class GoldRateController {

    private final GoldRateService goldRateService;

    @GetMapping("/goldrate")
    public GoldRateDto getGoldRate() {
        return goldRateService.getGoldRate();
    }
}
