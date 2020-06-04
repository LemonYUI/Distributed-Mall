package com.npu.gmall.pms.service;

import com.npu.gmall.pms.entity.ProductAttributeCategory;
import com.baomidou.mybatisplus.extension.service.IService;
import com.npu.gmall.vo.PageInfoVo;

/**
 * 产品属性分类表 服务类
 */
public interface ProductAttributeCategoryService extends IService<ProductAttributeCategory> {

    /**
     * 分页查询所有的属性分类
     * @param pageNum
     * @param pageSize
     * @return
     */
    PageInfoVo productAttributeCategoryPageInfo(Integer pageNum, Integer pageSize);
}
