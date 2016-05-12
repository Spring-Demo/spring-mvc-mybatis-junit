package cn.springmvc.model;

/**
 * @author Lian
 * @time 2015年12月10日 上午1:44:40
 * @desc 用户表
 */
public class User {
	private int id;
	private int state;
	private String nickname;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

}
