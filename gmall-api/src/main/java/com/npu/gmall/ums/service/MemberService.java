package com.npu.gmall.ums.service;

import com.npu.gmall.ums.entity.Member;
import com.baomidou.mybatisplus.extension.service.IService;
import com.npu.gmall.ums.entity.MemberReceiveAddress;

import java.util.List;

/**
 * 会员表 服务类
 */
public interface MemberService extends IService<Member> {

    Member login(String username, String password);

    List<MemberReceiveAddress> getMemberAddress(Long id);

    MemberReceiveAddress getMemberAddressByAddressId(Long addressId);
}
