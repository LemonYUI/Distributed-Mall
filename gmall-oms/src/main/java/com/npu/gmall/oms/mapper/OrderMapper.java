package com.npu.gmall.oms.mapper;

import com.npu.gmall.oms.entity.Order;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * 订单表 Mapper 接口
 */
public interface OrderMapper extends BaseMapper<Order> {

    Order selectByOrderSn(String orderSn);

}
