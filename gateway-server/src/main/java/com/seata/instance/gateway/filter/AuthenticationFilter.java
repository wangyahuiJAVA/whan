package com.seata.instance.gateway.filter;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

/**
 * @author wyh
 * @Description 用户认证过滤器
 * @createTime 2022年10月29日 15:17:00
 */
@Slf4j
@Component
public class AuthenticationFilter implements GlobalFilter, Ordered {
    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        // 写具体的验证逻辑
        return chain.filter(exchange);
    }

    @Override
    public int getOrder() {
        return 0;
    }
}
