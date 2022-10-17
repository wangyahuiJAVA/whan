package com.seata.instance.order.config;


import org.springframework.amqp.core.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class RabbitConfig {

    /**
     * Queue 可以有4个参数
     *      1.队列名
     *      2.durable       持久化消息队列 ,rabbitmq重启的时候不需要创建新的队列 默认true
     *      3.auto-delete   表示消息队列没有在使用时将被自动删除 默认是false
     *      4.exclusive     表示该消息队列是否只在当前connection生效,默认是false
     */
    // 创建保存订单的队列
    @Bean
    public Queue saveOrderQueue() {
        return new Queue(RabbitMQDeclare.ORDER_STATISTICS,true);
    }


    // 创建Topic队列交换机
    @Bean
    TopicExchange staticTopicExchange() {
        return new TopicExchange(RabbitMQDeclare.MQ_STATIC_EXCHANGE);
    }



    // 绑定到广播交换机
    @Bean
    Binding bindingExchangeSaveOrderQueue() {
        return BindingBuilder.bind(saveOrderQueue()).to(staticTopicExchange()).with(RabbitMQDeclare.ORDER_STATISTICS);
    }


}
