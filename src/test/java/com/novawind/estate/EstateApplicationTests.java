package com.novawind.estate;

import com.novawind.estate.application.EstateApplication;
import com.novawind.estate.mysql.dao.UserMapper;
import com.novawind.estate.mysql.model.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = EstateApplication.class)
public class EstateApplicationTests {
	@Resource
	private UserMapper userMapper;


	@Test
	public void dao() {
		User user = userMapper.selectByPrimaryKey(1);
		System.out.println(user);
	}

}
