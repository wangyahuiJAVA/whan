package com.seata.instance.gateway.filter;

import com.seata.instance.gateway.manager.GatewayManager;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

import java.util.UUID;

/**
 * @author wyh
 * @Description 用户认证过滤器
 * @createTime 2022年10月29日 15:17:00
 */
@Slf4j
@Component
public class AuthenticationFilter implements GlobalFilter, Ordered {
    @Autowired
    private GatewayManager gatewayManager;
    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        // 写具体的验证逻辑
        // 验证通过之后添加标识
        String id = exchange.getRequest().getId();
        String target = UUID.randomUUID().toString();
        gatewayManager.saveHeadMessage(id,target);
        exchange.getRequest().mutate().headers(httpHeader -> {
            httpHeader.add(id,target);
        });
        return chain.filter(exchange);
    }

    @Override
    public int getOrder() {
        return 0;
    }
}
