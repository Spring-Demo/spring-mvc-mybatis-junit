package cn.springmvc.service;

import java.util.List;

import cn.springmvc.model.User;

/**
 * @author	Lian
 * @time	2015年12月10日 上午2:11:58
 * @desc	
 */
public interface UserService {
	public int insertUser(User user);

	public List<User> getUserList();
}
