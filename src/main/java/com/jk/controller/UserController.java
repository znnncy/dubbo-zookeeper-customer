package com.jk.controller;

import com.jk.model.User;
import com.jk.service.IUserService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Controller
@RequestMapping("/userController")
public class UserController extends BaseController{

    //记 录日志
   private static  final Logger logger=Logger.getLogger(UserController.class);

    @Autowired
    private IUserService userService;

    @RequestMapping("/getInfo")
    public void getInfo(User user, HttpServletResponse response) throws Exception{
        List<User> list=userService.getInfo(user);
        super.writeJson(list,response);
    }


}
