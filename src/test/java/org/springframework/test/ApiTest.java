package org.springframework.test;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.test.bean.UserService;

/**
 * @program: small-spring
 * @description:
 * @blame:
 * @author: wuyonggang
 * @since: 2021-12-14 19:18
 **/
public class ApiTest {
	@Test
	public void  test_BeabFactory() {
		//1.初始化BeanFactory
		BeanFactory beanFactory = new BeanFactory();
		//2.注册Bean
		beanFactory.registerBean("userService", new UserService());
		//3.获取Bean
		UserService userService = (UserService) beanFactory.getBean("userService");
		userService.queryUserInfo();
	}

}
