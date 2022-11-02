package com.seata.instance.order.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.seata.instance.common.base.BaseController;
import com.seata.instance.common.base.Result;
import com.seata.instance.common.qo.OrderQO;
import com.seata.instance.common.vo.OrderVO;
import com.seata.instance.order.service.OrderService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
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
@Api(tags = "订单模块相关接口")
public class OrderController  extends BaseController {

    @Autowired
    private OrderService orderService;

    @ApiOperation(value = "查询订单列表")
    @PostMapping(value = "/getOrderList")
    public Result<IPage<OrderVO>> getOrderList(@Validated @RequestBody OrderQO orderQO){
        return setResult(orderService.getOrderList(orderQO));
    }

}
