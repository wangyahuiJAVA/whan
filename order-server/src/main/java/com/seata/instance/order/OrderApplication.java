package com.seata.instance.order;

import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * 服务主入口
 * @author wyh
 */
@Slf4j
@SpringBootApplication(scanBasePackages = {"com.seata.instance"})
@MapperScan({"com.seata.instance.order.mapper"})
//@EnableFeignClients(value = {"com.seata.instance"})
public class OrderApplication {

    public static void main(String[] args) {
        SpringApplication.run(OrderApplication.class, args);
        log.info("订单服务启动成功！");
    }

}
