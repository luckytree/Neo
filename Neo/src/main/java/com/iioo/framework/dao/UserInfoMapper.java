package com.iioo.framework.dao;

import java.util.List;

import com.iioo.framework.model.User;

public interface UserInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
    
    List<User> selectAll();
}