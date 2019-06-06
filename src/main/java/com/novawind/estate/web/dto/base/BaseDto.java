package com.novawind.estate.web.dto.base;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.novawind.estate.mysql.model.User;

/**
 * BaseDto for request
 * @author Jeremy Xiong<br>
 * 2018-11-09 14:15
 */
public class BaseDto {
    @JsonIgnore
    private User currentUser;

    public BaseDto() {
        super();
    }

    public User getCurrentUser () {
        return currentUser;
    }
    public void setCurrentUser (User currentUser) {
        this.currentUser = currentUser;
    }
}
