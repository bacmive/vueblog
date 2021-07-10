package com.tsj.service.impl;

import com.tsj.entity.User;
import com.tsj.mapper.UserMapper;
import com.tsj.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author crazy seikwan
 * @since 2021-07-08
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
