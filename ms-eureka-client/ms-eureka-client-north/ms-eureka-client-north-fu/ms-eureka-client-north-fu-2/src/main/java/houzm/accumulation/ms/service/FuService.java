package houzm.accumulation.ms.service;

/**
 * Package: houzm.accumulation.ms.service
 * Author: hzm_dream@163.com
 * Date: Created in 2018/11/6 21:34
 * Copyright: Copyright (c) 2018
 * Version: 0.0.1
 * Modified By:
 * Description： fu service
 *
 * 实验：熔断器对服务降级
 */
public interface FuService {

    String visitKun();

    String visitKunDegrade();
}
