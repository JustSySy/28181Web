package com.cethik.irmp.web.controller;

import com.cethik.irmp.common.dal.dao.master.SysMenuMapper;
import com.cethik.irmp.common.util.entity.R;
import com.cethik.irmp.common.util.utils.CommonUtils;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 系统用户
 *
 * @Auther daniel.yu
 * @Date 2018/9/13 20:39
 */
@RestController
@RequestMapping("/sys/user")
public class SysUserController extends AbstractController {

	@Autowired
	private SysMenuMapper sysMenuMapper;
	
//	/**
//	 * 用户列表
//	 * @param params
//	 * @return
//	 */
//	@RequestMapping("/list")
//	public Page<SysUser> list(@RequestBody Map<String, Object> params) {
//		if(getUserId() != SystemConstant.SUPER_ADMIN) {
//			params.put("userIdCreate", getUserId());
//		}
//		return sysUserService.listUser(params);
//	}
	
	/**
	 * 获取登录的用户信息
	 */
	@RequestMapping("/info")
	public R info(){
		return R.ok().put("user", getUser());
	}
	
	/**
	 * 用户权限
	 * @return
	 */
	@RequestMapping("/perms")
	public R listUserPerms() {

		List<String> perms = sysMenuMapper.listUserPerms(getUserId());
		Set<String> permsSet = new HashSet<>();
		for(String perm : perms) {
			if(StringUtils.isNotBlank(perm)) {
				permsSet.addAll(Arrays.asList(perm.trim().split(",")));
			}
		}

		return CommonUtils.msgNotCheckNull(permsSet);

	}
	
//	/**
//	 * 新增用户
//	 * @param user
//	 * @return
//	 */
//	@OperateLog("新增用户")
//	@RequestMapping("/save")
//	public R save(@RequestBody SysUser user) {
//		user.setUserIdCreate(getUserId());
//		return sysUserService.saveUser(user);
//	}
//
//	/**
//	 * 根据id查询详情
//	 * @param userId
//	 * @return
//	 */
//	@RequestMapping("/infoUser")
//	public R getById(@RequestBody Long userId) {
//		return sysUserService.getUserById(userId);
//	}
//
//	/**
//	 * 修改用户
//	 * @param user
//	 * @return
//	 */
//	@OperateLog("修改用户")
//	@RequestMapping("/update")
//	public R update(@RequestBody SysUser user) {
//		return sysUserService.updateUser(user);
//	}
//
//	/**
//	 * 删除
//	 * @param id
//	 * @return
//	 */
//	@OperateLog("删除用户")
//	@RequestMapping("/remove")
//	public R batchRemove(@RequestBody Long[] id) {
//		return sysUserService.batchRemove(id);
//	}
//
//	/**
//	 * 用户修改密码
//	 * @param pswd
//	 * @param newPswd
//	 * @return
//	 */
//	@OperateLog("修改密码")
//	@RequestMapping("/updatePswd")
//	public R updatePswdByUser(String pswd, String newPswd) {
//		SysUser user = getUser();
//		user.setPassword(pswd);//原密码
//		user.setEmail(newPswd);//邮箱临时存储新密码
//		return sysUserService.updatePswdByUser(user);
//	}
//
//	/**
//	 * 启用账户
//	 * @param id
//	 * @return
//	 */
//	@OperateLog("启用账户")
//	@RequestMapping("/enable")
//	public R updateUserEnable(@RequestBody Long[] id) {
//		return sysUserService.updateUserEnable(id);
//	}
//
//	/**
//	 * 禁用账户
//	 * @param id
//	 * @return
//	 */
//	@OperateLog("禁用账户")
//	@RequestMapping("/disable")
//	public R updateUserDisable(@RequestBody Long[] id) {
//		return sysUserService.updateUserDisable(id);
//	}
//
//	/**
//	 * 重置密码
//	 * @param user
//	 * @return
//	 */
//	@OperateLog("重置密码")
//	@RequestMapping("/reset")
//	public R updatePswd(@RequestBody SysUser user) {
//		return sysUserService.updatePswd(user);
//	}
}
