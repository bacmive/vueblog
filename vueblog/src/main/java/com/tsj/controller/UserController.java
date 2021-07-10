package com.tsj.controller;


import com.tsj.common.lang.Result;
import com.tsj.entity.User;
import com.tsj.service.UserService;
import org.apache.shiro.authz.annotation.RequiresAuthentication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author crazy seikwan
 * @since 2021-07-08
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;

    @RequiresAuthentication
    @GetMapping("/index")
    public Result index(){
        User user = userService.getById(1L);
        return Result.succ(200, "操作成功", user);
    }

    @PostMapping("/save")
    public Result save(@Validated @RequestBody User user){
        return Result.succ(user);
    }
}
