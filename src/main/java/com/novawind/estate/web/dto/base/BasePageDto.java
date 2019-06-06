package com.novawind.estate.web.dto.base;

import java.util.List;

/**
 * @author Jeremy Xiong<br>
 * 2018-07-06 16:42
 */
public class BasePageDto<T> {

    private Long total = 0L;
    private List<T> pageContent;

    public BasePageDto (){

    }
    public BasePageDto (Long total, List<T> pageContent){
        this.total = total;
        this.pageContent = pageContent;
    }

    public Long getTotal () {
        return total;
    }
    public void setTotal (Long total) {
        this.total = total;
    }
    public List<T> getPageContent () {
        return pageContent;
    }
    public void setPageContent (List<T> pageContent) {
        this.pageContent = pageContent;
    }

}
