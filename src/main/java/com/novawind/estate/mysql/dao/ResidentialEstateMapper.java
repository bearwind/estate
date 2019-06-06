package com.novawind.estate.mysql.dao;

import com.novawind.estate.mysql.model.ResidentialEstate;

public interface ResidentialEstateMapper {
    int deleteByPrimaryKey (Integer id);

    int insert (ResidentialEstate record);

    int insertSelective (ResidentialEstate record);

    ResidentialEstate selectByPrimaryKey (Integer id);

    int updateByPrimaryKeySelective (ResidentialEstate record);

    int updateByPrimaryKey (ResidentialEstate record);
}