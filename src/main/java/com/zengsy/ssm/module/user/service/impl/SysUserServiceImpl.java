package com.zengsy.ssm.module.user.service.impl;

import com.zengsy.ssm.module.user.mapper.SysUserMapper;
import com.zengsy.ssm.module.user.pojo.SysUser;
import com.zengsy.ssm.module.user.service.SysUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class SysUserServiceImpl implements SysUserService {
	
	@Resource
	private SysUserMapper sysUserMapper;


	@Override
	public SysUser getById(Long id) {
		return sysUserMapper.selectByPrimaryKey(id);
	}
}
