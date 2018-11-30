package houzm.accumulation.ms.controller;

import houzm.accumulation.ms.service.FuService;
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
    private FuService fuService;

    @GetMapping("visit-kun")
    public String visitWater() {
        return fuService.visitKun();
    }

    @GetMapping("visit-kun-degrade")
    public String visitKunDegrade() {
        return fuService.visitKunDegrade();
    }
}
