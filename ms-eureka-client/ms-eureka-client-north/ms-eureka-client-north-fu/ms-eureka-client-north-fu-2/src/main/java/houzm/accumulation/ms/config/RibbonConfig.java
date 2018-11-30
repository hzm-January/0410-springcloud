package houzm.accumulation.ms.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * Package: houzm.accumulation.ms.config
 * Author: hzm_dream@163.com
 * Date: Created in 2018/11/5 19:11
 * Copyright: Copyright (c) 2018
 * Version: 0.0.1
 * Modified By:
 * Description： Ribbon Config
 */
@Configuration
public class RibbonConfig {

    @Bean
    @LoadBalanced
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
