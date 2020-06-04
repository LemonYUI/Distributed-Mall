package com.npu.gmall.pms.service;

import com.npu.gmall.pms.entity.Brand;
import com.baomidou.mybatisplus.extension.service.IService;
import com.npu.gmall.vo.PageInfoVo;

/**
 * 品牌表 服务类
 */
public interface BrandService extends IService<Brand> {

    PageInfoVo brandPageInfo(String keyword, Integer pageNum, Integer pageSize);
}
