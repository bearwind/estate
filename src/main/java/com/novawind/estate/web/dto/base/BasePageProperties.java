package com.novawind.estate.web.dto.base;


import com.novawind.estate.constant.Constant;

/**
 * @author Jeremy Xiong<br>
 * 2018-11-14 10:17
 */
public abstract class BasePageProperties extends BaseDto {

    private Integer pageNumber = Constant.DEFAULT_PAGE_NUMBER;
    private Integer pageSize = Constant.DEFAULT_PAGE_SIZE;

    public Integer getPageNumber () {
        return pageNumber;
    }
    public void setPageNumber (Integer pageNumber) {
        this.pageNumber = pageNumber;
    }
    public Integer getPageSize () {
        return pageSize;
    }
    public void setPageSize (Integer pageSize) {
        this.pageSize = pageSize;
    }
}
