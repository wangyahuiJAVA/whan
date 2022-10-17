package com.seata.instance.warehouse.controller;

import com.seata.instance.warehouse.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wyh
 * @Description
 * @createTime 2022年10月03日 11:55:00
 */
@RestController
@RequestMapping(value = "/address")
public class AddressController {
    @Autowired
    private AddressService addressService;

}
