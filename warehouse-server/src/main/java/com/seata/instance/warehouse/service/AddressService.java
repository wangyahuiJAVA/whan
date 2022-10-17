package com.seata.instance.warehouse.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.seata.instance.common.model.warehouse.Address;
import com.seata.instance.common.qo.AddressQO;
import com.seata.instance.common.vo.AddressVO;

/**
 * @author wyh
 * @Description
 * @createTime 2022年10月03日 11:55:00
 */
public interface AddressService extends IService<Address> {
    Page<AddressVO> getAddressList(AddressQO addressQO);
}

