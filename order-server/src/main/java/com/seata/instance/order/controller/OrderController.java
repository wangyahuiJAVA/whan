package com.seata.instance.order.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.seata.instance.common.base.BaseController;
import com.seata.instance.common.base.Result;
import com.seata.instance.common.qo.OrderQO;
import com.seata.instance.common.vo.OrderVO;
import com.seata.instance.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author wyh
 * @Description
 * @createTime 2022年09月29日 14:54:00
 */
@RestController
@RequestMapping(value = "/order")
public class OrderController  extends BaseController {

    @Autowired
    private OrderService orderService;

    @PostMapping(value = "/getOrderList")
    public Result<IPage<OrderVO>> getOrderList(@RequestBody OrderQO orderQO){
        return setResult(orderService.getOrderList(orderQO));
    }

}
