package com.youmeek.ssm.module.user.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.youmeek.ssm.module.user.mapper.SysUserMapper;
import com.youmeek.ssm.module.user.pojo.SysUser;
import com.youmeek.ssm.module.user.service.SysUserService;

@Service
public class SysUserServiceImpl implements SysUserService {
	
	@Resource
	private SysUserMapper sysUserMapper;


	@Override
	public SysUser getById(Long id) {
		return sysUserMapper.selectByPrimaryKey(id);
	}
}
