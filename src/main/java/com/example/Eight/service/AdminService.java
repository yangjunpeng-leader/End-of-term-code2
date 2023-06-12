package com.example.Eight.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.Eight.entity.Admin;


/**
 * @author 12572
 */
public interface AdminService extends IService<Admin> {


    //管理员登陆
    Admin adminLogin(String username, String password);

    //更新管理员信息
    int updateAdmin(Admin admin);

}
