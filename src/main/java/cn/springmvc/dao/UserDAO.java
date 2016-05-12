package cn.springmvc.dao;

import java.util.List;

import cn.springmvc.model.User;

/**
 * User DAO
 * 
 * @author 	Lian
 * @date	2016年5月12日
 * @since	1.0
 */
public interface UserDAO {

	/**
	 * 添加新用户
	 * 
	 * @param user
	 * @return
	 */
	public int insertUser(User user);

	/**
	 * 得到用户列表
	 *
	 * @return
	 */
	public List<User> getUserList();
}
