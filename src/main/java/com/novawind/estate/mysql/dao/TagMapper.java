package com.novawind.estate.mysql.dao;

import com.novawind.estate.mysql.model.Tag;

public interface TagMapper {
    int deleteByPrimaryKey (Integer id);

    int insert (Tag record);

    int insertSelective (Tag record);

    Tag selectByPrimaryKey (Integer id);

    int updateByPrimaryKeySelective (Tag record);

    int updateByPrimaryKey (Tag record);
}