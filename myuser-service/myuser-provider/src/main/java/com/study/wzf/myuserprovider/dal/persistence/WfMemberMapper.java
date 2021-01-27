package com.study.wzf.myuserprovider.dal.persistence;

import com.study.wzf.myuserprovider.dal.entity.WfMember;
import java.util.List;

public interface WfMemberMapper {
    int deleteByPrimaryKey(Integer userid);

    int insert(WfMember record);

    WfMember selectByPrimaryKey(Integer userid);

    List<WfMember> selectAll();

    int updateByPrimaryKey(WfMember record);
}