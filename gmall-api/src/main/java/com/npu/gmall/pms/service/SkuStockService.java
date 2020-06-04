package com.npu.gmall.pms.service;

import com.npu.gmall.pms.entity.SkuStock;
import com.baomidou.mybatisplus.extension.service.IService;

import java.math.BigDecimal;

/**
 * sku的库存 服务类
 */
public interface SkuStockService extends IService<SkuStock> {

    BigDecimal getSkuPriceBySkuId(Long skuId);
}
