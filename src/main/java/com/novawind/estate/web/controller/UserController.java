package com.novawind.estate.web.controller;

import com.novawind.estate.message.ResponseCode;
import com.novawind.estate.message.ResponseMessage;
import com.novawind.estate.mysql.dao.UserMapper;
import com.novawind.estate.mysql.model.User;
import com.novawind.estate.utils.PasswordUtil;
import com.novawind.estate.web.dto.UserDto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 用户
 *
 * @author Jeremy Xiong<br>
 * 2019-06-06 11:12
 */

@RestController
@RequestMapping("user")
public class UserController {
    @Resource
    private UserMapper userMapper;

    @PostMapping("login")
    public ResponseMessage login (@RequestBody UserDto userDto) {
        User db = userMapper.findByName(userDto.getName());
        if (db == null) {
            return new ResponseMessage(ResponseCode.USER_NOT_EXISTS);
        }
        if (!PasswordUtil.checkPassword(userDto.getPassword(), db.getPassword())) {
            return  new ResponseMessage(ResponseCode.BAD_USERNAME_OR_PASSWORD);
        }

        return new ResponseMessage(ResponseCode.SUCCESS);
    }


}
