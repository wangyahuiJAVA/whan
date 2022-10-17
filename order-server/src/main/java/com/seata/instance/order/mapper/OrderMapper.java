package com.seata.instance.order.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.seata.instance.common.model.order.Order;
import com.seata.instance.common.qo.OrderQO;
import com.seata.instance.common.vo.OrderVO;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * @author wyh
 * @Description
 * @createTime 2022年09月29日 15:31:00
 */
@Repository
public interface OrderMapper extends BaseMapper<Order> {

    /**
     * 分页查询订单信息
     * @param page 分页信息
     * @param orderQO 订单筛选条件
     * @return 订单分页信息
     */
    Page<OrderVO> getOrderList(Page page, @Param("orderQO") OrderQO orderQO);

}
