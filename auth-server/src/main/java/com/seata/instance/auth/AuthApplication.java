package com.seata.instance.auth;

import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 服务主入口
 * @author wyh
 */
@Slf4j
@SpringBootApplication(scanBasePackages = {"com.seata.instance"})
@MapperScan({"com.seata.instance.auth.mapper"})
//@EnableFeignClients(value = {"com.seata.instance"})
public class AuthApplication {

    public static void main(String[] args) {
        SpringApplication.run(AuthApplication.class, args);
        log.info("授权认证服务启动成功！");
    }

}
