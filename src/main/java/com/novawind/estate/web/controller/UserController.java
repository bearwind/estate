package com.novawind.estate.web.controller;

import com.novawind.estate.enums.SwitchStatus;
import com.novawind.estate.message.ResponseCode;
import com.novawind.estate.message.ResponseMessage;
import com.novawind.estate.mysql.dao.UserMapper;
import com.novawind.estate.mysql.model.User;
import com.novawind.estate.utils.BCrypt;
import com.novawind.estate.web.dto.UserDto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Date;

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
        if (!BCrypt.checkpw(userDto.getPassword(), db.getPassword())) {
            return  new ResponseMessage(ResponseCode.BAD_USERNAME_OR_PASSWORD);
        }

        return new ResponseMessage(ResponseCode.SUCCESS);
    }

    @PostMapping("register")
    public ResponseMessage register (@RequestBody UserDto userDto) {
        User db = userMapper.findByName(userDto.getName());
        if (db != null) {
            return new ResponseMessage(ResponseCode.DUPLICATED_USERNAME);
        }
        String encPwd = BCrypt.hashpw(userDto.getPassword(), BCrypt.gensalt());
        User user = new User();
        user.setName(userDto.getName());
        user.setPassword(encPwd);
        Date now = new Date();
        user.setCreateDate(now);
        user.setUpdateDate(now);
        user.setStatus(SwitchStatus.ON.getCode());
        userMapper.insertSelective(user);
        return new ResponseMessage(ResponseCode.SUCCESS);
    }


}
