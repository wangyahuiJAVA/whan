package com.seata.instance.gateway;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 服务主入口
 * @author wyh
 */
@Slf4j
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
//@MapperScan({"com.seata.instance.product.mapper"})
//@EnableFeignClients(value = {"com.seata.instance"})
public class GatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(GatewayApplication.class, args);
        log.info("网关服务启动成功！");
    }

}
