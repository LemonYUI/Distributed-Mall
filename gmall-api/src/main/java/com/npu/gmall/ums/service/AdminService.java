package com.npu.gmall.ums.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.npu.gmall.ums.entity.Admin;

/**
 * 后台用户表 服务类
 */
public interface AdminService extends IService<Admin> {

    Admin login(String username, String password);

    Admin getUserInfo(String userName);

    Integer register(Admin admin);
}
