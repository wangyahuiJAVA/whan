package com.seata.instance.warehouse;

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
@MapperScan({"com.seata.instance.warehouse.mapper"})
//@EnableFeignClients(value = {"com.seata.instance"})
public class WarehouseApplication {

    public static void main(String[] args) {
        SpringApplication.run(WarehouseApplication.class, args);
        log.info("库存服务启动成功！");
    }

}
