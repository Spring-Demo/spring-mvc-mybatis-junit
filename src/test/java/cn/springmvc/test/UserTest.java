package cn.springmvc.test;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.springmvc.model.User;
import cn.springmvc.service.UserService;

/**
 * @author	Lian
 * @time	2015年12月10日 上午2:26:03
 * @desc	
 */
public class UserTest {
	private UserService userService;

	@Before
	public void before() {
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext(
				new String[] { "classpath:conf/spring.xml", "classpath:conf/spring-mybatis.xml" });
		userService = (UserService) context.getBean("userServiceImpl");
	}

	@Test
	public void addUser() {
		User user = new User();
		user.setNickname("你好");
		user.setState(2);
		System.out.println(userService.insertUser(user));
	}

	@Test
	public void getUserList() {
		List<User> userList = userService.getUserList();
		for(User user : userList) {
			System.out.println(user.getNickname());
		}
	}

}
