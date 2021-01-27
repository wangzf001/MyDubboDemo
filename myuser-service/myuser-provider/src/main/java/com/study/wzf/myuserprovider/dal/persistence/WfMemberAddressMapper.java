package com.study.wzf.myuserprovider.dal.persistence;

import com.study.wzf.myuserprovider.dal.entity.WfMemberAddress;
import java.util.List;

public interface WfMemberAddressMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(WfMemberAddress record);

    WfMemberAddress selectByPrimaryKey(Integer id);

    List<WfMemberAddress> selectAll();

    int updateByPrimaryKey(WfMemberAddress record);
}