package com.zzzzzp.learn.shardingjdbc.dao;

import com.zzzzzp.learn.shardingjdbc.dao.TUserOrder1;

public interface TUserOrder1Dao {
    int deleteByPrimaryKey(Long id);

    int insert(TUserOrder1 record);

    int insertSelective(TUserOrder1 record);

    TUserOrder1 selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TUserOrder1 record);

    int updateByPrimaryKey(TUserOrder1 record);
}