package cn.springmvc.service;

import java.util.List;

import cn.springmvc.model.User;

/**
 * UserService
 * 
 * @author 	Lian
 * @date	2016年5月12日
 * @since	1.0
 */
public interface UserService {

	public int insertUser(User user);

	public List<User> getUserList();
}
