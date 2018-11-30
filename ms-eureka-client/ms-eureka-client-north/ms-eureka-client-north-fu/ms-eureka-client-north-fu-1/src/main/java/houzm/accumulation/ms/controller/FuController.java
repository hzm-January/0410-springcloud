package houzm.accumulation.ms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Package: houzm.accumulation.ms.controller
 * Author: hzm_dream@163.com
 * Date: Created in 2018/11/5 19:08
 * Copyright: Copyright (c) 2018
 * Version: 0.0.1
 * Modified By:
 * Description： Sky Controller
 */
@RestController
@RequestMapping("api/fu/")
public class FuController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("visit-kun")
    public String visitWater() {
        String kunWords = restTemplate.getForEntity("http://ms-eureka-client-north-kun/api/kun/show-kun-info", String.class).getBody();
        return kunWords;
    }
}
