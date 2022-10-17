package com.seata.instance.order.config;

public interface RabbitMQDeclare {
    // 新增订单队列
    public static String ORDER_STATISTICS = "order_statistics";

    // static 队列交换机
    public static String MQ_STATIC_EXCHANGE= "MQ_STATIC_EXCHANGE";
}
