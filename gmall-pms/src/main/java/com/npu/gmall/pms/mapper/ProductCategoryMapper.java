package com.npu.gmall.pms.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.npu.gmall.pms.entity.ProductCategory;
import com.npu.gmall.vo.product.PmsProductCategoryWithChildrenItem;

import java.util.List;

/**
 * 产品分类 Mapper 接口
 */
public interface ProductCategoryMapper extends BaseMapper<ProductCategory> {

    List<PmsProductCategoryWithChildrenItem> listCatelogWithChildren(Integer i);
}
