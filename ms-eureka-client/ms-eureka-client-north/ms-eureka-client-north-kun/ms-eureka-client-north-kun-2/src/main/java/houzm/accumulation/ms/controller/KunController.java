package houzm.accumulation.ms.controller;

import houzm.accumulation.ms.JsonUtil;
import java.util.List;
import java.util.Random;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Package: houzm.accumulation.ms.controller
 * Author: hzm_dream@163.com
 * Date: Created in 2018/11/6 18:03
 * Copyright: Copyright (c) 2018
 * Version: 0.0.1
 * Modified By:
 * Description：
 */
@RestController
@RequestMapping(value = "/api/kun/")
public class KunController {

    private final Logger logger = LoggerFactory.getLogger(KunController.class);

    @Autowired
    private DiscoveryClient discoveryClient;

    /**
     *
     */
    @GetMapping("show-discovery-info")
    public void showDiscoveryDetail() {
        List<String> discoveryServiceIds = discoveryClient.getServices();
        logger.debug("== show discovery detail : services : {}", JsonUtil.objectToJson(discoveryServiceIds));
        for (String discoveryServiceId : discoveryServiceIds) {
            List<ServiceInstance> instances = discoveryClient.getInstances(discoveryServiceId);
            logger.debug("== show discovery detail : instances : {}", JsonUtil.objectToJson(instances));
        }
    }

    @GetMapping("show-kun-info")
    public String providerForSky() {
        logger.debug("i am kun 2");
        return "hello kun, i am fu";
    }

    @GetMapping("show-kun-info-degrade")
    public String providerForFuTestDegrade() {
        logger.debug("i am kun 2");
        return "hello kun, i am fu";
    }
}
