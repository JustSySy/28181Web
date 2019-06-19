package com.cethik.irmp.core.model;

import java.io.Serializable;
import java.util.Date;

/**
 * 系统用户Token
 *
 * @Auther daniel.yu
 * @Date 2018/9/13 20:39
 */
public class SysUserToken implements Serializable {

	private static final long serialVersionUID = 1L;
	
	/**
	 * 用户id
	 */
	private Long userId;
	
	/**
	 * token
	 */
	private String token;
	
	/**
	 * 过期时间
	 */
	private Date gmtExpire;
	
	/**
	 * 更新时间
	 */
	private Date gmtModified;

	public SysUserToken() {
		super();
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public Date getGmtExpire() {
		return gmtExpire;
	}

	public void setGmtExpire(Date gmtExpire) {
		this.gmtExpire = gmtExpire;
	}

	public Date getGmtModified() {
		return gmtModified;
	}

	public void setGmtModified(Date gmtModified) {
		this.gmtModified = gmtModified;
	}

}
