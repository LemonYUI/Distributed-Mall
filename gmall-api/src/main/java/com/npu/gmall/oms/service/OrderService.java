package com.npu.gmall.oms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.npu.gmall.oms.entity.Order;
import com.npu.gmall.oms.entity.OrderItem;
import com.npu.gmall.vo.order.OrderConfirmVo;
import com.npu.gmall.vo.order.OrderCreateVo;

import java.math.BigDecimal;
import java.util.List;

/**
 * 订单表 服务类
 */
public interface OrderService extends IService<Order> {

    //订单确认
    OrderConfirmVo orderConfirm(Long id);

    OrderCreateVo createOrder(BigDecimal totalPrice, Long addressId,String notes);

    Order selectOne(String order_sn);

    List<OrderItem> selectList(String orderSn);

}
