package com.example.admin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.admin.entity.SysUser;
import com.example.admin.service.ISysUserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * 用户控制器
 */
@Api(tags = "用户管理")
@RestController
@RequestMapping("/user")
public class SysUserController {
    
    @Autowired
    private ISysUserService userService;
    
    @ApiOperation("根据用户名查询用户")
    @GetMapping("/info")
    public SysUser getUserInfo(String userName) {
        return userService.selectUserByUserName(userName);
    }
}