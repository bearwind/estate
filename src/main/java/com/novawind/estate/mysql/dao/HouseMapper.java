package com.novawind.estate.mysql.dao;

import com.novawind.estate.mysql.model.House;

public interface HouseMapper {
    int deleteByPrimaryKey (Integer id);

    int insert (House record);

    int insertSelective (House record);

    House selectByPrimaryKey (Integer id);

    int updateByPrimaryKeySelective (House record);

    int updateByPrimaryKey (House record);
}