package com.seata.instance.warehouse.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.seata.instance.common.model.warehouse.Address;
import com.seata.instance.common.qo.AddressQO;
import com.seata.instance.common.vo.AddressVO;
import com.seata.instance.warehouse.mapper.AddressMapper;
import com.seata.instance.warehouse.service.AddressService;
import org.springframework.stereotype.Service;

/**
 * @author wyh
 * @Description
 * @createTime 2022年10月03日 12:02:00
 */
@Service
public class AddressServiceImpl extends ServiceImpl<AddressMapper, Address> implements AddressService{
    @Override
    public Page<AddressVO> getAddressList(AddressQO addressQO) {
        return null;
    }
}
