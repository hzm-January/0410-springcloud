package houzm.accumulation.ms.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

/**
 * Package: houzm.accumulation.ms.service
 * Author: hzm_dream@163.com
 * Date: Created in 2018/11/6 21:35
 * Copyright: Copyright (c) 2018
 * Version: 0.0.1
 * Modified By:
 * Description： fu service impl
 */
@Service(value = "fuService")
public class FuServiceImpl implements FuService {

    private final Logger logger = LoggerFactory.getLogger(FuServiceImpl.class);
    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "fallBackVisitKun")
    @Override
    public String visitKun() {
        String kunWords = restTemplate.getForEntity("http://ms-eureka-client-north-kun/api/kun/show-kun-info", String.class).getBody();
        return kunWords;
    }

    @HystrixCommand(fallbackMethod = "fallBackVisitKun")
    @Override
    public String visitKunDegrade() {
        long start = System.currentTimeMillis();
        String kunWords = restTemplate.getForEntity("http://ms-eureka-client-north-kun/api/kun/show-kun-info-degrade", String.class).getBody();
        logger.debug("invoke spend time : {}", System.currentTimeMillis()-start);
        return kunWords;
    }

    public String fallBackVisitKun() {
        return " the info is visit kun fall back ";
    }
}
