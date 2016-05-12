package cn.springmvc.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.springmvc.dao.UserDAO;
import cn.springmvc.model.User;
import cn.springmvc.service.UserService;

/**
 * UserService Impl
 * 
 * @author 	Lian
 * @date	2016年5月12日
 * @since	1.0
 */
@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDAO userDAO;

	public int insertUser(User user) {
		return userDAO.insertUser(user);
	}

	@Override
	public List<User> getUserList() {
		return userDAO.getUserList();
	}

}
