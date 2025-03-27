package cn.itcast.feign.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;


/*
* 1.配置文件
* 2.LoggerLevel这个Bean
*    - 如果在@EnableFeignClients注解声明代表全局
*    - 如果在@FeignClient注解中声明代表莫服务
* */
public class DefaultFeignConfiguration {
    @Bean
    public Logger.Level logLevel(){
        return Logger.Level.BASIC;
    }
}
