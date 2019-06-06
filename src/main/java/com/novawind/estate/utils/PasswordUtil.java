package com.novawind.estate.utils;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * 简单密码加密工具类
 *
 * @author Jeremy Xiong<br>
 * 2019-06-06 17:26
 */
public class PasswordUtil {
    private static BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();

    public static String encrypt (String password) {
        return encoder.encode(password);
    }

    public static boolean checkPassword (String password, String encPassword) {
        return encoder.matches(password, encPassword);
    }

}
