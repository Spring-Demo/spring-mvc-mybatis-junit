package cn.springmvc.dao;

import java.util.List;

import cn.springmvc.model.User;

/**
 * @author	Lian
 * @time	2015年12月10日 上午1:46:39
 * @desc	
 */
public interface UserDAO {

	/**
	 * 添加新用户
	 * @param user
	 * @return
	 */
	public int insertUser(User user);

	/**
	 * @return
	 */
	public List<User> getUserList();
}
