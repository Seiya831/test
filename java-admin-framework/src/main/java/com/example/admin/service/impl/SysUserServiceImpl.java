package com.example.admin.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.admin.entity.SysUser;
import com.example.admin.mapper.SysUserMapper;
import com.example.admin.service.ISysUserService;
import org.springframework.stereotype.Service;

/**
 * 用户服务实现类
 */
@Service
public class SysUserServiceImpl extends ServiceImpl<SysUserMapper, SysUser> implements ISysUserService {
    
    @Override
    public SysUser selectUserByUserName(String userName) {
        return baseMapper.selectUserByUserName(userName);
    }
    
    @Override
    public boolean registerUser(SysUser user) {
        // 这里可以添加密码加密等逻辑
        return save(user);
    }
}