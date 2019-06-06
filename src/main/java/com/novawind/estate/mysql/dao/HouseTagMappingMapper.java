package com.novawind.estate.mysql.dao;

import com.novawind.estate.mysql.model.HouseTagMapping;

public interface HouseTagMappingMapper {
    int deleteByPrimaryKey (Integer id);

    int insert (HouseTagMapping record);

    int insertSelective (HouseTagMapping record);

    HouseTagMapping selectByPrimaryKey (Integer id);

    int updateByPrimaryKeySelective (HouseTagMapping record);

    int updateByPrimaryKey (HouseTagMapping record);
}