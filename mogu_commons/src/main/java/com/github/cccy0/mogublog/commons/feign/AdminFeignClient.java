package com.github.cccy0.mogublog.commons.feign;

import com.github.cccy0.mogublog.commons.config.feign.FeignConfiguration;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author Zhai
 * 2021/6/19 17:59
 */

@FeignClient(name = "mogu-admin", configuration = FeignConfiguration.class)
public interface AdminFeignClient {

    /**
     * 获取系统配置信息
     */
    @RequestMapping(value = "/systemConfig/getSystemConfig", method = RequestMethod.GET)
    String getSystemConfig();
}
