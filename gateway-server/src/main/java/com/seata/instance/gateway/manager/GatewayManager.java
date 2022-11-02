package com.seata.instance.gateway.manager;

/**
 * @author wyh
 * @Description
 * @createTime 2022年11月01日 19:02:00
 */
public interface GatewayManager {
    Boolean saveHeadMessage(String id, String target);
}
