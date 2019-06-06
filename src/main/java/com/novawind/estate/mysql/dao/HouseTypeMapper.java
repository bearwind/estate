package com.novawind.estate.mysql.dao;

import com.novawind.estate.mysql.model.HouseType;

public interface HouseTypeMapper {
    int deleteByPrimaryKey (Integer id);

    int insert (HouseType record);

    int insertSelective (HouseType record);

    HouseType selectByPrimaryKey (Integer id);

    int updateByPrimaryKeySelective (HouseType record);

    int updateByPrimaryKey (HouseType record);
}