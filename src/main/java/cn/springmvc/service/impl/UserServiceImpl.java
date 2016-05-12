package cn.springmvc.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.springmvc.dao.UserDAO;
import cn.springmvc.model.User;
import cn.springmvc.service.UserService;

/**
 * @author	Lian
 * @time	2015年12月10日 上午2:12:39
 * @desc	
 */
@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDAO userDAO;

	public int insertUser(User user) {
		return userDAO.insertUser(user);
	}

	/**
	 * @return
	 */
	@Override
	public List<User> getUserList() {
		return userDAO.getUserList();
	}
	
	
}
