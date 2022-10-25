package com.seata.instance.order.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.seata.instance.common.model.order.OrderProduct;
import org.springframework.stereotype.Repository;


/**
 * @author wyh
 * @Description
 * @createTime 2022年10月20日 20:45:00
 */
@Repository
public interface OrderProductMapper extends BaseMapper<OrderProduct> {
}
